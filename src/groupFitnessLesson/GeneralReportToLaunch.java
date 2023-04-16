package groupFitnessLesson;

import java.util.Scanner;

public class GeneralReportToLaunch {

    Scanner allRepIn = new Scanner(System.in);

    //Object of the report fetch class
    MonthlyReport rF = new MonthlyReport();
    public void allReport(){

        System.out.println("Welcome to your report portal. Select the type of report" +
                           "\n PRESS 1: for Monthly Lesson Report" +
                           "\n PRESS 2: for Monthly Champion fitness type report");
        int reportTyp = allRepIn.nextInt();
        if(reportTyp == 1 ){

            rF.lessReportLch();

        }
        else if ( reportTyp == 2 ){

            System.out.println(" Get cganp report faster ");
        }
        else {
            System.out.println("Invalid response you will be redirected to main menu");
        }

    }
}
