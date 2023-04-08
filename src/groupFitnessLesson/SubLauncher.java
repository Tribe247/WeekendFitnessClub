package groupFitnessLesson;

import java.util.Scanner;

public class SubLauncher {


    public void welcomePage() {
        System.out.println("Welcome to Group Fitness Lesson. You can Book a new lesson, attend a lesson," +
                           "\nChange or cancel booked lesson or Check monthly fitness and booking report");
    }

    public void welcomePage1() {

        Scanner Launcher1 = new Scanner(System.in);

        // Object of the class launcher
        //Launcher lh = new Launcher();

        //Object of cancel and change
        ChangeNCancel nCa = new ChangeNCancel();

        //ChData chdt = new ChData();

        // Object of the class timetable / booking
        TimeTableLauncher tb = new TimeTableLauncher();


        // Object of the rate/Review class
        ReviewAttend newRev = new ReviewAttend();

        //Object of report class
        GeneralReportToLaunch genR = new GeneralReportToLaunch();



        System.out.println("Please select what you wish to do" +
                "\n PRESS 1: To Book a lesson " +
                "\n PRESS 2: To change or cancel a lesson " +
                "\n PRESS 3: To attend a lesson " +
                "\n PRESS 4: Check monthly fitness and booking report " +
                "\n PRESS 5: To EXIT");

        int menu = Launcher1.nextInt();
        switch (menu) {
            case 1:
                // Calling this method for booking
                tb.timeTableWelcome();
                break;
            case 2:
                // A method to call for Cancellation/ change will be called herr
                nCa.changeBooking();
                //chdt.zumba21st("Harry");
                break;
            case 3:
                // A method called to initiate review/rating
                newRev.toCallAttend();
                break;
            case 4:
                //A method to call general report

                genR.allReport();

                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Entry");
        }


    }
}