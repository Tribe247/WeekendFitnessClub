package groupFitnessLesson;

import java.util.Scanner;

public class LessonDay {

    Scanner TimeEntry = new Scanner(System.in);

    // An object of the lesson classes is created
    FitnessLesson ft = new FitnessLesson();


    //Creating a method for my day lesson classes
    public void prefDay() {

        System.out.println("You have choose to view your time table by days" +
                           "\n PRESS 1: for Saturday Lesson" +
                           "\n Press 2: for Sunday Lesson");

        int dayLesson = TimeEntry.nextInt();

        if (dayLesson == 1) {
            System.out.println("Please see saturday lesson timetable and " +
                               "press the number of the session you wish to book \n");

            System.out.println(
                    "                        7 Jan          14 Jan          21 Jan          28 Jan" +
                            "\n Morning:     1.Yoga         3. Zumba        5. Box Fit      7. Aquacize" +
                            "\n Evening:     2.Spin         4. Box Fit      6. Spin         8. Bodysculpt \n" +

                            "\n              4 Feb          11 Feb          18 Jan          25 Feb " +
                            "\n Morning:     9.Yoga         11.Zumba         13.Box Fit        15.Aquacise " +
                            "\n Evening:     10.Spin        12.Box Fit       14.Spin           16.Bodysculpt \n");

            System.out.println("\n Which Session will you like to attend");

            int SaturdaylessonSession = TimeEntry.nextInt();
            switch (SaturdaylessonSession) {
                case 1:
                    System.out.println("You have selected Yoga training for 7nd of January");
                    System.out.println("Enter your lastName");
                    Scanner Case1In = new Scanner(System.in);
                    String name = Case1In.nextLine();
                    ft.yoga7th(name);
                    break;
                case 2:
                    System.out.println("You have selected Spin training for 7th of January");
                    System.out.println("Enter your lastName");
                    Scanner Case2In = new Scanner(System.in);
                    String name1 = Case2In.nextLine();
                    ft.spin7th(name1);
                    break;
                case 3:
                    System.out.println("You have selected Zumba training for 7th of January");
                    System.out.println("Enter your lastName");
                    Scanner Case3In = new Scanner(System.in);
                    String name2 = Case3In.nextLine();
                    ft.yoga7th(name2);
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Monday");
                    break;
                case 7:
                    System.out.println("Tuesday");
                    break;
                case 8:
                    System.out.println("Wednesday");
                    break;
                case 9:
                    System.out.println("Thursday11");
                    break;
                case 10:
                    System.out.println("Friday11");
                    break;
                case 11:
                    System.out.println("Monday12");
                    break;
                case 12:
                    System.out.println("Tuesday44");
                    break;
                case 13:
                    System.out.println("Wednesday33");
                    break;
                case 14:
                    System.out.println("Thursday21");
                    break;
                case 15:
                    System.out.println("Friday24");
                    break;
                case 16:
                    System.out.println("Friday10");
                    break;
                default:
                    System.out.println("No lesson available for the selected session");
            }

        } else if (dayLesson == 2) {
            System.out.println("Please see sunday lesson timetable and" +
                            "\n press the number of the session you wish to book");
            System.out.println(
                    "                          7th Jan          14 Jan          21 Jan          28 Jan" +
                            "\n Morning:       1.Aquacise       3.Yoga          5.Zumba         7.Bodysculpt" +
                            "\n Evening:       2.Bodysculpt     4.Spin          6.Bodysculpt    8.Box Fit" +

                            "\n                4 Feb            11 Feb          18 Jan           25 Feb " +
                            "\n Morning:       9.Aquacise       11.Yoga         13.Yoga          15.Aquacise " +
                            "\n Evening:       10.Spin          12.Spin         14.Spin          16.Bodysculpt");

            System.out.println("Please type in your preferred session here: ");

            int SundaylessonSession = TimeEntry.nextInt();
            switch (SundaylessonSession) {
                case 1:
                    System.out.println("You have selected Yoga training for 7nd of January");
                    System.out.println("Enter your lastName");
                    Scanner Case1In = new Scanner(System.in);
                    String name = Case1In.nextLine();
                    ft.yoga7th(name);
                    break;
                case 2:
                    System.out.println("You have selected Spin training for 7th of January");
                    System.out.println("Enter your lastName");
                    Scanner Case2In = new Scanner(System.in);
                    String name1 = Case2In.nextLine();
                    ft.spin7th(name1);
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Monday");
                    break;
                case 7:
                    System.out.println("Tuesday");
                    break;
                case 8:
                    System.out.println("Wednesday1");
                    break;
                case 9:
                    System.out.println("Thursday21");
                    break;
                case 10:
                    System.out.println("Friday3");
                    break;
                case 11:
                    System.out.println("Monday45");
                    break;
                case 12:
                    System.out.println("Tuesday11");
                    break;
                case 13:
                    System.out.println("Wednesday111");
                    break;
                case 14:
                    System.out.println("Thursday0");
                    break;
                case 15:
                    System.out.println("Friday2");
                    break;
                case 16:
                    System.out.println("Friday11");
                    break;
                default:
                    System.out.println("No lesson available for the selected session");
            }
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public void preferlesson() {
            System.out.println("You have choose to view your time table by type of fitness lesson type" +
                            "\n Type in your preferred lesson session according to lesson numbers \n");
            System.out.println(
                            "\n              7th Jan          14 Jan          21 Jan            28 Jan" +
                            "\n Morning:     1.Yoga           3.Zumba         5.Box Fit         7.Aquacise" +
                            "\n Evening:     2.Spin           4.Box Fit       6.Spin            8.Bodysculpt \n" +

                            "                8th Jan          15 Jan          22 Jan            29 Jan   " +
                            "\n Morning:     9.Aquacise       11.Yoga         13.Zumba          15.Bodysculpt" +
                            "\n Evening:     10.Body-sculpt   12.Spin         14.Bodysculpt     16.Box Fit  \n" +

                            "\n              4 Feb            11 Feb          18 Jan            25 Feb " +
                            "\n Morning:     17.Yoga          19.Zumba        21.Box Fit        23.Aquacise " +
                            "\n Evening:     18.Spin          20.Box Fit      22.Spin           24.Bodysculpt \n" +

                            "\n              5 Feb            12 Feb          19 Jan            26 Feb " +
                            "\n Morning:     25.Aquacise      27.Yoga         29.Yoga           31.Aquacise " +
                            "\n Evening:     26.Spin          28.Spin         30.Spin           32.Bodysculpt \n");

            System.out.println("Type in your preferred session here: ");

            int bylessonSession = TimeEntry.nextInt();
            switch (bylessonSession) {
                case 1:
                    System.out.println("You have selected Yoga training for 7nd of January");
                    System.out.println("Enter your lastName");
                    Scanner Case1In = new Scanner(System.in);
                    String name = Case1In.nextLine();
                    ft.yoga7th(name);
                    break;
                case 2:
                    System.out.println("You have selected Spin training for 7th of January");
                    System.out.println("Enter your lastName");
                    Scanner Case2In = new Scanner(System.in);
                    String name1 = Case2In.nextLine();
                    ft.spin7th(name1);
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Monday");
                    break;
                case 7:
                    System.out.println("Tuesday out");
                    break;
                case 8:
                    System.out.println("Wednesday in");
                    break;
                case 9:
                    System.out.println("Thursday in");
                    break;
                case 10:
                    System.out.println("Friday of");
                    break;
                case 11:
                    System.out.println("Monday ok");
                    break;
                case 12:
                    System.out.println("Tuesday00");
                    break;
                case 13:
                    System.out.println("Wednesday01");
                    break;
                case 14:
                    System.out.println("Thursday10");
                    break;
                case 15:
                    System.out.println("Friday78");
                    break;
                case 16:
                    System.out.println("Friday88");
                    break;
                case 17:
                    System.out.println("Wednesday77");
                    break;
                case 18:
                    System.out.println("Thursday66");
                    break;
                case 19:
                    System.out.println("Friday55");
                    break;
                case 20:
                    System.out.println("Monday14");
                    break;
                case 21:
                    System.out.println("Tuesday34");
                    break;
                case 22:
                    System.out.println("Wednesday23");
                    break;
                case 23:
                    System.out.println("Thursday97");
                    break;
                case 24:
                    System.out.println("Friday09");
                    break;
                case 25:
                    System.out.println("Monday90");
                    break;
                case 26:
                    System.out.println("Tuesday99");
                    break;
                case 27:
                    System.out.println("Wednesday87");
                    break;
                case 28:
                    System.out.println("Thursday23");
                    break;
                case 29:
                    System.out.println("Friday11");
                    break;
                case 30:
                    System.out.println("Friday12");
                    break;
                case 31:
                    System.out.println("Friday02");
                    break;
                case 32:
                    System.out.println("Friday11");
                    break;
                default:
                    System.out.println("No lesson available for the selected session");
            }
    }

    // A method to welcome my client into the timetable portal

}
