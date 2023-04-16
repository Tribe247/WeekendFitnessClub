package groupFitnessLesson;

import java.util.Scanner;

public class MonthlyReportLauncher {

    Scanner mth = new Scanner(System.in);


    public void reportLaunch(){

        System.out.println(" Please select report you wish to view: \n" +
                           "PRESS 1: For Monthly Lesson Report \n" +
                           "PRESS 2: For Monthly Champion Report\n " +
                           "PRESS 3: For other option");

        int reportIn = mth.nextInt();
        if ( reportIn == 1) {

        }
        else if (reportIn == 2) {

        }
        else {
            // Method for other option
        }

    }
}
