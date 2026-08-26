package org.sw.lesson05;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import java.util.List;
import java.util.stream.Collectors;

import org.sw.builder.*;
import org.sw.facts.*;
import org.sw.Common;

public class InsertLogicalAndFactObjects {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(5, args, 1, 4));
    }


    static void execute(int demo) {
        System.out.println("Running Demo " + demo);
        SessionData sessionData = new SessionData();

        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("InsertLogicalAndFactObjectsDemo" + demo);

        List<Claim> claims = ClaimRepository.getClaims();
        claims.forEach(ksession::insert);

        List<Policy> policies = PolicyRepository.getPolicies();
        policies.forEach(ksession::insert);

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

        System.out.println("==== DROOLS SESSION START ==== ");
        ksession.fireAllRules();
        System.out.println("==== DROOLS SESSION END ==== ");

        if (demo > 1) {
            System.out.println("==== VALID CLAIMS INSERTED === ");
            sessionData.validClaims = ksession.getObjects(o -> o.getClass() == ValidClaim.class).stream()
                    .map(o -> (ValidClaim) o)
                    .collect(Collectors.toList());
            sessionData.validClaims.forEach(System.out::println);

            System.out.println("==== INVALID CLAIMS INSERTED === ");
            sessionData.invalidClaims = ksession.getObjects(o -> o.getClass() == InvalidClaim.class).stream()
                    .map(o -> (InvalidClaim) o)
                    .collect(Collectors.toList());
            sessionData.invalidClaims.forEach(System.out::println);

            List<Payout> payoutObjects = ksession
                    .getObjects(o -> o.getClass() == Payout.class).stream()
                    .map(o -> (Payout) o)
                    .collect(Collectors.toList());
            System.out.println("== PAYOUTS ISSUED == ");
            payoutObjects.forEach(System.out::println);
        }

        if (Common.disposeSession) {
            ksession.dispose();
        }

    }
}
