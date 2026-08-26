package org.sw.lesson07;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.sw.facts.Application;
import org.sw.facts.Proposal;
import org.sw.builder.ApplicationRepository;

import java.util.ArrayList;
import java.util.List;

public class CalculatePremiumStateless {
    public static void main(final String[] args) {
        execute();
    }

    static void execute() {
        System.out.println("Running Lesson07 as a Stateless Session");

        List<Application> applications = ApplicationRepository.getApplications();
        System.out.println("==== APPLICATIONS IN DROOLS SESSION LESSON 07 ==== ");
        applications.forEach(System.out::println);

        List<Proposal> proposals = new ArrayList<>();

        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        StatelessKieSession ksession = kc.newStatelessKieSession("SpreadsheetDecisionTablesStateless");

        ksession.setGlobal("proposalsList", proposals );

        System.out.println("==== DROOLS SESSION LESSON 07 START ==== ");
        ksession.execute(applications);
        System.out.println("==== DROOLS SESSION LESSON 07 END ==== ");

        System.out.println("==== PROPOSALS ISSUED ==== ");
        proposals.forEach(System.out::println);
    }

}
