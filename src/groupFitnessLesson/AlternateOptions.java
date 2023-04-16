package groupFitnessLesson;

import java.util.Scanner;


public class AlternateOptions {

    // Method for main menu
    SubLauncher sbl = new SubLauncher();


    Scanner altOpt = new Scanner(System.in);

    public void AltOpt1(){
        // This method contains main menu and Exit
        System.out.println("What else will you like to do: \n" +
                           "PRESS 1: For Main Menu \n" +
                           "PRESS 2: To EXIT \n");

        int OptionIn = altOpt.nextInt();
        if (OptionIn == 1){
            sbl.welcomePage();
            sbl.welcomePage1();
        }
        else if (OptionIn == 2) {
            System.out.println("Thank you for your patronage, Hope to see you next time...");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input, You will be redirected to main page");
            sbl.welcomePage1();

        }

    }

    public void AltOpt2(){

        // Method for time table
        TimeTableLauncher ttb = new TimeTableLauncher();

        // This method contains timetable, main menu and Exit
        System.out.println("Key in for other options: \n" +
                "PRESS 1: To book a new session \n" +
                "PRESS 2: For Main Menu \n" +
                "PRESS 3: To EXIT \n");

        int OptionIn = altOpt.nextInt();
        if (OptionIn == 1){
            ttb.timeTableWelcome();
        }
        else if (OptionIn == 2) {
            sbl.welcomePage();
            sbl.welcomePage1();
        }
        else if (OptionIn == 3) {
            System.out.println("Thank you for your patronage, Hope to see you next time...");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input, You will be redirected to main page");
            sbl.welcomePage1();

        }

    }

}
