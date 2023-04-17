package groupFitnessLesson;

import java.util.Scanner;

public class LessonChampReport {

    // An instance of the lesson classes is created
    FitnessLesson ft =  FitnessLesson.getInstance();

    // Object of alternate class
    AlternateOptions alt = new AlternateOptions();

    Scanner lcR = new Scanner(System.in);

    public void reportLaunch(){

        System.out.println(" Please select report you wish to view: \n" +
                "PRESS 1: For Monthly Lesson Report \n" +
                "PRESS 2: For Monthly Champion Report\n " +
                "PRESS 3: For other option");

        int reportIn = lcR.nextInt();
        if ( reportIn == 1) {
            System.out.println("Select report month:  \n" +
                               "PRESS 1: For Month 01 \n" +
                               "PRESS 2: For Month 02 \n" );

            int lessonR = lcR.nextInt();
            if ( lessonR == 1 ) {
                System.out.println("LESSON REPORT FOR MONTH 01");
                ft.lessonReportYoga7thJan();

                alt.AltOpt1();



            }
            else if (lessonR == 2) {
                System.out.println("LESSON REPORT FOR MONTH 02");

            }
            else{
                System.out.println("Invalid Input... \n");
                alt.AltOpt1();

            }


        }
        else if (reportIn == 2) {

            System.out.println("Select report month:  \n" +
                    "PRESS 1: For Month 01 \n" +
                    "PRESS 2: For Month 02 \n" );

            int lessonR = lcR.nextInt();
            if ( lessonR == 1 ) {
                System.out.println("CHAMPION REPORT FOR MONTH 01");
                ft.champReportYoga7thJan();

                alt.AltOpt1();

            }
            else if (lessonR == 2) {
                System.out.println("CHAMPION REPORT FOR MONTH 02");


            }
            else{
                System.out.println("Invalid Input... \n");
                alt.AltOpt1();
            }


        }
        else {
            alt.AltOpt1();
        }

    }


}
