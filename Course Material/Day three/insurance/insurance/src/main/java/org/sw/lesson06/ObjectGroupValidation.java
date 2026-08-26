package org.sw.lesson06;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.sw.facts.*;
import org.sw.builder.*;
import org.sw.Common;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class ObjectGroupValidation {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(6, args, 1, 4));
    }

    static void execute(int demo) {
        System.out.println("Running Demo " + demo);

        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("ObjectGroupValidationDemo" + demo);

        ksession.addEventListener(new RuleRuntimeEventListener() {
            @Override
            public void objectInserted(ObjectInsertedEvent event) {
                System.out.println("==> " + event.getObject() + " inserted");
            }

            @Override
            public void objectUpdated(ObjectUpdatedEvent event) {
                System.out.println("==> " + event.getObject() + " updated");
            }

            @Override
            public void objectDeleted(ObjectDeletedEvent event) {
                System.out.println("==> " + event.getOldObject() + " deleted");
            }
        });

        List<FamilyApplication> familyApplications = ApplicationRepository.getFamilyApplications();
        familyApplications.forEach(ksession::insert);

        List<ClientID> clientIDS = ClientIdRepository.getClientIDs();
        if (demo == 3) {
            if (Common.promptForYesNoQuestion("Do you want to set all IDs as expired?")) {
                System.out.println("All client IDs are now expired");
                clientIDS.forEach(clientID -> clientID.setExpiryDate(LocalDate.MIN));
            }
        }
        clientIDS.forEach(ksession::insert);

        if (demo == 4) {
            List<Application> applications = ApplicationRepository.getApplications();
            applications.forEach(ksession::insert);
        }

        System.out.println("==== DROOLS SESSION START ==== ");
        ksession.fireAllRules();
        System.out.println("==== DROOLS SESSION END ==== ");

        System.out.println("==== INVALID FAMILY APPLICATIONS INSERTED === ");

        Collection<?> invalidApplications = ksession.getObjects(o -> o.getClass() == InvalidFamilyApplication.class);
        invalidApplications.forEach(System.out::println);

        Collection<?> policies = ksession.getObjects(o -> o.getClass() == Policy.class);
        System.out.println("== NEW POLICIES CREATED == ");
        policies.forEach(System.out::println);

        if (Common.disposeSession) {
            ksession.dispose();
        }

    }
}
