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
                System.out.println("LESSON REPORT FOR MONTH 01 \n");
                ft.lessonReportYoga7thJan();
                ft.lessonReportYoga14thJan();
                ft.lessonReportYoga21J();
                ft.lessonReportYoga28J();
                ft.lessonReportSpin7J();
                ft.lessonReportSpin14J();
                ft.lessonReportSpin21J();
                ft.lessonReportSpin28J();
                ft.lessonReportAquacise8J();
                ft.lessonReportAquacise15J();
                ft.lessonReportAquacise22J();
                ft.lessonReportAquacise29J();
                ft.lessonReportZumba8J();
                ft.lessonReportZumba15J();
                ft.lessonReportZumba15J();
                ft.lessonReportZumba15J();

                alt.AltOpt1();

            }
            else if (lessonR == 2) {
                System.out.println("LESSON REPORT FOR MONTH 02");
                ft.lessonReportYoga4F();
                ft.lessonReportYoga11F();
                ft.lessonReportYoga18F();
                ft.lessonReportYoga25F();
                ft.lessonReportSpin4F();
                ft.lessonReportSpin11F();
                ft.lessonReportSpin18F();
                ft.lessonReportSpin25F();
                ft.lessonReportAquacise5F();
                ft.lessonReportAquacise12F();
                ft.lessonReportAquacise19F();
                ft.lessonReportAquacise26F();
                ft.lessonReportZumba5F();
                ft.lessonReportZumba12F();
                ft.lessonReportZumba19F();
                ft.lessonReportZumba26F();

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
                ft.champReportYoga14thJan();
                ft.champReportYoga21J();
                ft.champReportYoga28J();
                ft.champReportSpin7J();
                ft.champReportSpin14J();
                ft.champReportSpin21J();
                ft.champReportSpin28J();
                ft.champReportAquacise8J();
                ft.champReportAquacise15J();
                ft.champReportAquacise22J();
                ft.champReportAquacise29J();
                ft.champReportZumba8J();
                ft.champReportZumba15J();
                ft.champReportZumba22J();
                ft.champReportZumba29J();

                alt.AltOpt1();

            }
            else if (lessonR == 2) {
                System.out.println("CHAMPION REPORT FOR MONTH 02");
                ft.champReportYoga4F();
                ft.champReportYoga11F();
                ft.champReportYoga18F();
                ft.champReportYoga25F();
                ft.champReportSpin4F();
                ft.champReportSpin11F();
                ft.champReportSpin18F();
                ft.champReportSpin25F();
                ft.champReportYoga4F();
                ft.champReportYoga11F();
                ft.champReportYoga18F();
                ft.champReportAquacise5F();
                ft.champReportAquacise12F();
                ft.champReportAquacise19F();
                ft.champReportAquacise26F();
                ft.champReportZumba5F();
                ft.champReportZumba12F();
                ft.champReportZumba19F();
                ft.champReportZumba26F();

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
