package org.sw.lesson04;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import org.sw.facts.*;
import org.sw.builder.*;
import org.sw.Common;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FactInsertionAndExecutionOrder {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(4, args, 1, 5));
    }


    static void execute(int demo) {
        System.out.println("Demo Number " + demo);

        KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kieClasspathContainer.newKieSession("FactInsertionAndExecutionOrderDemo" + demo);

        ksession.addEventListener(new EventStream(System.out));

        List<Claim> claims = ClaimRepository.getClaims();

        if (demo == 5) {
            if (Common.promptForYesNoQuestion("Do you want to set all claims to 1,000,000?")) {
                System.out.println("All claims set to 1,000,000");
                claims.forEach(claim -> claim.setClaimAmount(1000000));
            }
        }

        claims.forEach(ksession::insert);

        List<Policy> policies = PolicyRepository.getPolicies();
        policies.forEach(ksession::insert);

/*        List<Application> applications = ApplicationRepository.getApplications();
        applications.forEach(ksession::insert);

        List<ClientID> clientIDs = ClientIdRepository.getClientIDs();
        clientIDs.forEach(ksession::insert);*/

            if (demo == 3) {
                Agenda agenda = ksession.getAgenda();
                agenda.getAgendaGroup("issue-payout").setFocus();
                agenda.getAgendaGroup("valid-claim").setFocus();
                agenda.getAgendaGroup("invalid-claim").setFocus();
            }

            if (demo == 4 || demo == 5) {
                Agenda agenda = ksession.getAgenda();
                agenda.getAgendaGroup("issue-payout").setFocus();
                agenda.getAgendaGroup("claim-validation").setFocus();
            }

            System.out.println("==== DROOLS SESSION START ==== ");
            ksession.fireAllRules();
            System.out.println("==== DROOLS SESSION END ==== ");

            List<Payout> payoutObjects = ksession
                    .getObjects(o -> o.getClass() == Payout.class).stream()
                    .map(o -> (Payout) o)
                    .collect(Collectors.toList());
            System.out.println("== PAYOUTS ISSUED == ");
            payoutObjects.forEach(System.out::println);

            if (Common.disposeSession) {
                ksession.dispose();
            }

        }
}
