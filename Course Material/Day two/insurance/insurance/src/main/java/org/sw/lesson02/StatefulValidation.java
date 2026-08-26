package org.sw.lesson02;

import org.sw.facts.Application;
import org.sw.Common;
import org.sw.builder.ApplicationRepository;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;

public class StatefulValidation {
    public static void main(final String[] args) {
        execute(Common.promptForDemo(2, args, 1, 2));
    }

    static void execute(int demo) {
        System.out.println("Demo Number " + demo);
        KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kieClasspathContainer.newKieSession("StatefulApplicationValidationDemo" + demo);

        List<Application> applications = ApplicationRepository.getApplications();
        applications.forEach(ksession::insert);

        System.out.println("==== DROOLS SESSION START ==== ");
        ksession.fireAllRules();
        if (Common.disposeSession) {
            ksession.dispose();
        }
        System.out.println("==== DROOLS SESSION END ==== ");

        System.out.println("==== VALIDATION STATUS AFTER SESSION === ");
        applications.forEach(application -> {
            if (demo == 1) {
                System.out.println(application + " result: Application " + application.getStatus() );
            }
            if (demo == 2) {
                System.out.println(application + " result: " + application.getStatus() + ", reason: " + application.getReason());
            }
        });

    }
}
