package groupFitnessLesson;

import java.util.Scanner;

public class TimeTableLauncher {

    Scanner welcomeIn = new Scanner(System.in);

    LessonDay ld1 = new LessonDay();

    public void timeTableWelcome(){

        System.out.println("Welcome to Group Fitness Lesson session schedule" +
                "\n Please check our timetable to select your preferred training session and type" +
                "\n Please note that we offer lesson on saturdays and sundays of every week, " +
                "\n you can select your session by choosing any of the day or by selection the lesson type. Thank you \n");

        System.out.println("Check the time table for available lesson and periods" +
                "\n To check the time table by days press 1" +
                "\n To check the time table by lesson type press 2");

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
