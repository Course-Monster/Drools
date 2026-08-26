package org.sw.lesson07;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.sw.facts.Application;
import org.sw.facts.Proposal;
import org.sw.builder.ApplicationRepository;

import java.util.List;
import java.util.stream.Collectors;


public class CalculatePremium {
    public static void main(final String[] args) { execute(); }
    static void execute() {

        System.out.println("Running Lesson07");

        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("SpreadsheetDecisionTables");

        System.out.println("==== APPLICATIONS IN DROOLS SESSION LESSON 07 ==== ");

        List<Application> applications = ApplicationRepository.getApplications();
        applications.forEach(ksession::insert);
        applications.forEach(System.out::println);

        System.out.println("==== DROOLS SESSION LESSON 07 START ==== ");
        ksession.fireAllRules();

        System.out.println("==== DROOLS SESSION LESSON 07 END ==== ");

        List<Proposal> proposals = ksession
                .getObjects(o -> o.getClass() == Proposal.class).stream()
                .map(proposal -> (Proposal) proposal)
                .collect(Collectors.toList());
        System.out.println("==== PROPOSALS ISSUED ==== ");
        proposals.forEach(System.out::println);

        ksession.dispose();
    }

}