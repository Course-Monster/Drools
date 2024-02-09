package org.sw.lesson01;

import org.sw.facts.Application;
import org.sw.Common;
import org.sw.builder.ApplicationRepository;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import java.util.List;

public class StatelessApplicationValidation {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(1, args, 1, 5));
    }

    static void execute(int demo) {
        System.out.println("Demo Number " + demo);

        List<Application> applications = ApplicationRepository.getApplications();

        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession("StatelessApplicationValidationDemo" + demo);
        System.out.println("==== DROOLS SESSION START ==== ");
        kieSession.execute(applications);
        System.out.println("==== DROOLS SESSION END ==== ");

        if (demo >= 4) {
            System.out.println("==== VALIDATION STATUS AFTER SESSION ==== ");

            applications.forEach(application -> System.out.println(application + " validation " + application.getStatus()));

        }

    }
}
