package groupFitnessLesson;

import java.util.Scanner;

public class TimeTableLauncher {

    Scanner welcomeIn = new Scanner(System.in);

    Booking ld1 = new Booking();

    public void timeTableWelcome(){

        System.out.println("Welcome to Group Fitness Lesson session schedule" +
                "\n Please check our timetable to select your preferred training session and type" +
                "\n Please note that we offer lesson on saturdays and sundays of every week, " +
                "\n you can select your session by choosing any of the day or by selection the lesson type.\n");

        System.out.println("Check the time table for available lesson and periods" +
                "\n PRESS 1: Time table by days" +
                "\n PRESS 2: Time table by lesson type");

        int timetableInput = welcomeIn.nextInt();

        // This occure if you decide to choose lesson by day of lesson
        if (timetableInput == 1){
            ld1.prefDay();
        }

        // This occurs if you decide to choose lesson by type of lesson
        else if (timetableInput == 2) {
            ld1.preferlesson();
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
