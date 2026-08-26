package org.sw.builder;

import org.sw.facts.Application;
import org.sw.facts.FamilyApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ApplicationRepository {
    public static List<Application> getApplications() {
        List<Application> applications = new ArrayList<>();

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1000")
                .withClientName("James Smith")
                .withClientAge(52)
                .withPEC(false)
                .withRisk("High")
                .withEmployed(true)
                .withBMI(21)
                .withClientIdNumber("ID-100")
                .withSmoker(false)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1001")
                .withClientName("Maria Smith")
                .withClientAge(56)
                .withPEC(true)
                .withRisk("Medium")
                .withEmployed(true)
                .withBMI(23)
                .withClientIdNumber("ID-101")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1002")
                .withClientName("Robert Johnson")
                .withClientAge(38)
                .withPEC(false)
                .withRisk("High")
                .withEmployed(true)
                .withBMI(25)
                .withClientIdNumber("ID-102")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1003")
                .withClientName("Linda Johnson")
                .withClientAge(36)
                .withPEC(true)
                .withRisk("Low")
                .withEmployed(false)
                .withBMI(32)
                .withClientIdNumber("ID-103")
                .withSmoker(false)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1004")
                .withClientName("Michael Johnson")
                .withClientAge(16)
                .withPEC(false)
                .withRisk("Low")
                .withEmployed(false)
                .withBMI(20)
                .withClientIdNumber("ID-104")
                .withSmoker(false)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1005")
                .withClientName("Elizabeth Anderson")
                .withClientAge(27)
                .withPEC(false)
                .withRisk("Medium")
                .withEmployed(true)
                .withBMI(27)
                .withClientIdNumber("ID-105")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1006")
                .withClientName("David Lrr")
                .withClientAge(63)
                .withPEC(true)
                .withRisk("High")
                .withEmployed(true)
                .withBMI(31)
                .withClientIdNumber("ID-106")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1007")
                .withClientName("Emily Taylor")
                .withClientAge(80)
                .withPEC(false)
                .withRisk("Low")
                .withEmployed(false)
                .withBMI(18)
                .withClientIdNumber("ID-107")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1008")
                .withClientName("William Brown")
                .withClientAge(21)
                .withPEC(true)
                .withRisk("Low")
                .withEmployed(true)
                .withBMI(28)
                .withClientIdNumber("ID-108")
                .withSmoker(true)
                .build());

        applications.add(Application.newBuilder()
                .withApplicationNumber("A-1009")
                .withClientName("Jessica Thompson")
                .withClientAge(71)
                .withPEC(false)
                .withRisk("Medium")
                .withEmployed(false)
                .withBMI(23)
                .withClientIdNumber("ID-110")
                .withSmoker(false)
                .build());

        return applications;
    }

    public static List<FamilyApplication> getFamilyApplications() {
        List<FamilyApplication> familyApplications = new ArrayList<>();

        familyApplications.add(FamilyApplication.newBuilder()
                .withApplicationNumber("GIA-1000")
                .withClientIdNumbers(asList("ID-100", "ID-101"))
                .withClientAges(asList(52, 56))
                .withStartDate(LocalDate.of(2024, Month.MARCH, 1))
                .withPolicyDurationYears(1)
                .build());

        familyApplications.add(FamilyApplication.newBuilder()
                .withApplicationNumber("GIA-1001")
                .withClientIdNumbers(asList("ID-102", "ID-103", "ID-104"))
                .withClientAges(asList(38, 36, 16))
                .withStartDate(LocalDate.of(2024, Month.MAY, 5))
                .withPolicyDurationYears(1)
                .build());

        return familyApplications;
    }
}
