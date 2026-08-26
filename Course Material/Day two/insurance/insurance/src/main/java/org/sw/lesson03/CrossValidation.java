package org.sw.lesson03;

import org.sw.builder.ApplicationRepository;
import org.sw.builder.ClientIdRepository;
import org.sw.facts.Application;
import org.sw.facts.Claim;
import org.sw.facts.ClientID;
import org.sw.facts.Policy;
import org.sw.builder.ClaimRepository;
import org.sw.builder.PolicyRepository;
import org.sw.Common;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;

public class CrossValidation {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(3, args, 1, 3));
    }


    static void execute(int demo) {
        System.out.println("Demo Number " + demo);

        if (demo == 1) {
            KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
            KieSession ksession = kieClasspathContainer.newKieSession("CrossValidationDemo" + demo);

            List<Claim> claims = ClaimRepository.getClaims();
            claims.forEach(ksession::insert);

            List<Policy> policies = PolicyRepository.getPolicies();
            policies.forEach(ksession::insert);

            System.out.println("==== DROOLS SESSION START ==== ");
            ksession.fireAllRules();
            if (Common.disposeSession) {
                ksession.dispose();
            }
            System.out.println("==== DROOLS SESSION END ==== ");

            System.out.println("==== CLAIMS VALIDATION STATUS AFTER SESSION === ");
            claims.forEach(claim -> System.out.println(claim + " verdict: " + claim.getStatus())
            );
        }

        if (demo >= 2) {
            KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
            KieSession ksession = kieClasspathContainer.newKieSession("CrossValidationDemo" + demo);

            List<Application> applications = ApplicationRepository.getApplications();
            applications.forEach(ksession::insert);

            List<ClientID> clientIDs = ClientIdRepository.getClientIDs();
            clientIDs.forEach(ksession::insert);


            System.out.println("==== DROOLS SESSION START ==== ");
            ksession.fireAllRules();
            if (Common.disposeSession) {
                ksession.dispose();
            }
            System.out.println("==== DROOLS SESSION END ==== ");

            System.out.println("==== APPLICATIONS AFTER DROOLS SESSION === ");
            applications.forEach(application -> System.out.println(application + " verdict: " + application.getStatus()));
        }
    }
}
