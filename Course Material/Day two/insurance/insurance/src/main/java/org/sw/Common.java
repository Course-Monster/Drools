package org.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Common {

    public static boolean disposeSession = true;

    public static int promptForDemo(int lesson, String[] args, int minDemo, int maxDemo) {
        return promptForDemoInternal("Lesson " + lesson, args, minDemo, maxDemo);
    }

    private static int promptForDemoInternal(String lessonStr, String[] args, int minDemo, int maxDemo) {
        String demoStr = "";

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                if (args != null && args.length > 0) {
                    demoStr = args[0];
                    return Integer.parseInt(demoStr);
                }
                else {
                    System.out.printf(lessonStr + ". Enter demo number (%d...%d): ", minDemo, maxDemo);
                    demoStr = br.readLine();
                }

                int step = Integer.parseInt(demoStr);

                if (step < minDemo || step > maxDemo) {
                    System.out.println("Step number out of range. Insert a number between " + minDemo + " and " + maxDemo);
                }
                else {
                    return step;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number: " + demoStr);
            }
            catch (IOException e) {
                System.out.println("Invalid demo input: " + demoStr);
            }
        }

    }


    public static boolean promptForYesNoQuestion(String question) {
        String enteredStr = "";

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.printf("%s Enter 'yes' or 'no': ", question);
                enteredStr = br.readLine().trim();

                if ("yes".equalsIgnoreCase(enteredStr) || "y".equalsIgnoreCase(enteredStr)) {
                    return true;
                }

                if ("no".equalsIgnoreCase(enteredStr) || "n".equalsIgnoreCase(enteredStr)) {
                    return false;
                }

                System.out.println("Enter either 'yes' or 'no'");
            }
            catch (IOException e) {
                System.out.println("Invalid input: " + enteredStr);
            }
        }

    }

}

