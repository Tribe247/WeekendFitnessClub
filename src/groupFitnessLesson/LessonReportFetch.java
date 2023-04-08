package groupFitnessLesson;

import java.util.Scanner;

public class LessonReportFetch {

    Scanner reportCls = new Scanner(System.in);

    // Object of the MLReport
    MonthlyLessonReport mlR = new MonthlyLessonReport();

    public void lessReportLch(){

        System.out.println("Select the report you wish to view" +
                           "\n PRESS 1: for January Report" +
                           "\n PRESS 2: for February Report");
        int reportQuest = reportCls.nextInt();

        if (reportQuest == 1 ){

            System.out.println("Please find the January lesson report below: \n");

            mlR.janLesson();

        }
        else if (reportQuest == 2){

            mlR.febLesson();
        }
        else {
            System.out.println("Invalid Input");

        }


    }
}
