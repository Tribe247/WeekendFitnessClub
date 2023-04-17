package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Booking {

    Scanner TimeEntry = new Scanner(System.in);

    //Method for alternate options
    AlternateOptions altB = new AlternateOptions();

    // An object of the lesson classes is created
    FitnessLesson ft =  FitnessLesson.getInstance();

    // An object of the Menu launcher classes is created
    SubLauncher sbl = new SubLauncher();


    public void prefDay() {

        System.out.println("You have choose to view your time table by days" +
                           "\n PRESS 1: for Saturday Lesson" +
                           "\n Press 2: for Sunday Lesson");

        int dayLesson = TimeEntry.nextInt();

        if (dayLesson == 1) {
            System.out.println("Please see saturday lesson timetable and " +
                               "press the number of the session you wish to book \n");

            System.out.println(
                            "                7 Jan          14 Jan          21 Jan          28 Jan    " +
                            "\n Morning:     1.Yoga         2. Yoga         3. Yoga         4. Yoga   " +
                            "\n Price          £ 21            £ 21            £ 21            £ 21   " +
                            "\n Evening:     5.Spin         6. Spin         7. Spin         8. Spin   " +
                            "\n Price          £ 25            £ 25            £ 25            £ 25 \n" +

                            "\n              4 Feb          11 Feb          18 Feb          25 Feb    " +
                            "\n Morning:     9.Yoga         10.Yoga         11.Yoga         12.Yoga   " +
                            "\n Price          £ 21            £ 21            £ 21            £ 21   " +
                            "\n Evening:     13.Spin        14.Spin         15.Spin         16.Spin   " +
                            "\n Price          £ 25            £ 25            £ 25            £ 25 \n");


            try {
                System.out.println("\n Which Session will you like to attend");
                int SaturdaylessonSession = TimeEntry.nextInt();
                switch (SaturdaylessonSession) {
                    case 1:
                        System.out.println("You have selected Yoga Morning Lesson for 7th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case1In = new Scanner(System.in);
                        String name = case1In.nextLine();
                        ft.addYoga7thJ(name, "Yoga Morning Session on the 7th of January");
                        altB.AltOpt1();
                        break;
                    case 2:
                        System.out.println("You have selected Yoga Morning Lesson for 14th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case2In = new Scanner(System.in);
                        String name1 = case2In.nextLine();
                        ft.addYoga14thJ( name1, "Yoga Morning Session on the 14th of January");
                        altB.AltOpt1();
                        break;
                    case 3:
                        System.out.println("You have selected Yoga Morning Lesson for 21st of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case3In = new Scanner(System.in);
                        String name2 = case3In.nextLine();
                        ft.addYoga21J( name2, "Yoga Morning Session on the 21th of January");
                        altB.AltOpt1();
                        break;
                    case 4:
                        System.out.println("You have selected Yoga Morning Lesson for 28th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case4In = new Scanner(System.in);
                        String name3 = case4In.nextLine();
                        ft.addYoga28J( name3, "Yoga Morning Session on the 28th of January");
                        altB.AltOpt1();
                        break;
                    case 5:
                        System.out.println("You have selected Spin Evening Lesson for 7th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case5In = new Scanner(System.in);
                        String name4 = case5In.nextLine();
                        ft.addSpin7J( name4, "Spin Evening Session on the 7th of January");
                        altB.AltOpt1();
                        break;
                    case 6:
                        System.out.println("You have selected Spin Evening Lesson for 14th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case6In = new Scanner(System.in);
                        String name5 = case6In.nextLine();
                        ft.addSpin14J( name5, "Spin Evening Session on the 14th of January");
                        altB.AltOpt1();
                        break;
                    case 7:
                        System.out.println("You have selected Spin Evening Lesson for 21st of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case7In = new Scanner(System.in);
                        String name6 = case7In.nextLine();
                        ft.addSpin21J( name6, "Spin Evening Session on the 21th of January");
                        altB.AltOpt1();
                        break;
                    case 8:
                        System.out.println("You have selected Spin Evening Lesson for 28th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case8In = new Scanner(System.in);
                        String name7 = case8In.nextLine();
                        ft.addSpin28J( name7, "Spin Evening Session on the 28th of January");
                        altB.AltOpt1();
                        break;
                    case 9:
                        System.out.println("You have selected Yoga Morning Lesson for 4th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case9In = new Scanner(System.in);
                        String name8 = case9In.nextLine();
                        ft.addYoga4F( name8, "Yoga Morning Session on the 4th of February");
                        altB.AltOpt1();
                        break;
                    case 10:
                        System.out.println("You have selected Yoga Morning Lesson for 11th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case10In = new Scanner(System.in);
                        String name9 = case10In.nextLine();
                        ft.addYoga11F( name9, "Yoga Morning Session on the 11th of February");
                        altB.AltOpt1();
                        break;
                    case 11:
                        System.out.println("You have selected Yoga Morning Lesson for 18th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case11In = new Scanner(System.in);
                        String name10 = case11In.nextLine();
                        ft.addYoga18F( name10, "Yoga Morning Session on the 18th of February");
                        altB.AltOpt1();
                        break;
                    case 12:
                        System.out.println("You have selected Yoga Morning Lesson for 25th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case12In = new Scanner(System.in);
                        String name11 = case12In.nextLine();
                        ft.addYoga25F( name11 , "Yoga Morning Session on the 25th of February");
                        altB.AltOpt1();
                        break;
                    case 13:
                        System.out.println("You have selected Spin Evening Lesson for 4th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case13In = new Scanner(System.in);
                        String name12 = case13In.nextLine();
                        ft.addSpin4F( name12, "Spin Evening Session on the 4th of February");
                        altB.AltOpt1();
                        break;
                    case 14:
                        System.out.println("You have selected Spin Evening Lesson for 11th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case14In = new Scanner(System.in);
                        String name13 = case14In.nextLine();
                        ft.addSpin11F( name13, "Spin Evening Session on the 11th of February");
                        altB.AltOpt1();
                        break;
                    case 15:
                        System.out.println("You have selected Spin Evening Lesson for 18th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case15In = new Scanner(System.in);
                        String name14 = case15In.nextLine();
                        ft.addSpin18F( name14, "Spin Evening Session on the 18th of February");
                        altB.AltOpt1();
                        break;
                    case 16:
                        System.out.println("You have selected Spin Evening Lesson for 25th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case16In = new Scanner(System.in);
                        String name15 = case16In.nextLine();
                        ft.addSpin25F( name15, "Spin Evening Session on the 25th of February");
                        altB.AltOpt1();
                        break;
                    default:
                        System.out.println("No lesson available for the selected session");
                        altB.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected to main menu \n \n \n ");
                altB.AltOpt1();
            }


        } else if (dayLesson == 2) {
            System.out.println("Please see sunday lesson timetable and" +
                            "\n press the number of the session you wish to book");
            System.out.println(
                            "                  8th Jan          15 Jan          22 Jan         29 Jan      1" +
                            "\n Morning:       1.Aquacise       2.Aquacise      3.Aquacise     4.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:       5.Zumba          6.Zumba         7.Zumba        8.Zumba     " +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n" +

                            "\n                5 Feb            12 Feb          19 Feb         26 Feb      " +
                            "\n Morning:       9.Aquacise       10.Aquacise     11.Aquacise    12.Aquacise " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:       13.Zumba         14.Zumba        15.Zumba       16.Zumba    " +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

                try {
                    System.out.println("Please type in your preferred session here: ");
                    int SundaylessonSession = TimeEntry.nextInt();
                    switch (SundaylessonSession) {
                        case 1:
                            System.out.println("You have selected Aquacise Morning Lesson for 8th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case1In = new Scanner(System.in);
                            String name1 = case1In.nextLine();
                            ft.addAquacise8J( name1, "Aquacise Morning Session on the 8th of January");
                            altB.AltOpt1();
                            break;
                        case 2:
                            System.out.println("You have selected Aquacise Morning Lesson for 15th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case2In = new Scanner(System.in);
                            String name2 = case2In.nextLine();
                            ft.addAquacise15J( name2, "Aquacise Morning Session on the 15th of January");
                            altB.AltOpt1();
                            break;
                        case 3:
                            System.out.println("You have selected Aquacise Morning Lesson for 22nd of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case3In = new Scanner(System.in);
                            String name3 = case3In.nextLine();
                            ft.addAquacise22J( name3, "Aquacise Morning Session on the 22nd of January");
                            altB.AltOpt1();
                            break;
                        case 4:
                            System.out.println("You have selected Aquacise Morning Lesson for 29th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case4In = new Scanner(System.in);
                            String name4 = case4In.nextLine();
                            ft.addAquacise29J( name4, "Aquacise Morning Session on the 29th of January");
                            altB.AltOpt1();
                            break;
                        case 5:
                            System.out.println("You have selected Zumba Evening Lesson for 8th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case5In = new Scanner(System.in);
                            String name5 = case5In.nextLine();
                            ft.addZumba8J( name5, "Zumba Evening Session on the 8th of January");
                            altB.AltOpt1();
                            break;
                        case 6:
                            System.out.println("You have selected Zumba Evening Lesson for 15th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case6In = new Scanner(System.in);
                            String name6 = case6In.nextLine();
                            ft.addZumba15J( name6, "Zumba Evening Session on the 15th of January");
                            altB.AltOpt1();
                            break;
                        case 7:
                            System.out.println("You have selected Zumba Evening Lesson for 22nd of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case7In = new Scanner(System.in);
                            String name7 = case7In.nextLine();
                            ft.addZumba22J( name7, "Zumba Evening Session on the 22nd of January");
                            altB.AltOpt1();
                            break;
                        case 8:
                            System.out.println("You have selected Zumba Evening Lesson for 29th of January \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case8In = new Scanner(System.in);
                            String name8 = case8In.nextLine();
                            ft.addZumba29J( name8, "Zumba Evening Session on the 29th of January");
                            altB.AltOpt1();
                            break;
                        case 9:
                            System.out.println("You have selected Aquacise Morning Lesson for 5th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case9In = new Scanner(System.in);
                            String name9 = case9In.nextLine();
                            ft.addAquacise5F( name9, "Aquacise Morning Session on the 5th of February");
                            altB.AltOpt1();
                            break;
                        case 10:
                            System.out.println("You have selected Aquacise Morning Lesson for 12th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case10In = new Scanner(System.in);
                            String name10 = case10In.nextLine();
                            ft.addAquacise12F( name10 , "Aquacise Morning Session on the 12th of February");
                            altB.AltOpt1();
                            break;
                        case 11:
                            System.out.println("You have selected Aquacise Morning Lesson for 19th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case11In = new Scanner(System.in);
                            String name11 = case11In.nextLine();
                            ft.addAquacise19F( name11 , "Aquacise Morning Session on the 19th of February");
                            altB.AltOpt1();
                            break;
                        case 12:
                            System.out.println("You have selected Aquacise Morning Lesson for 26th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case12In = new Scanner(System.in);
                            String name12 = case12In.nextLine();
                            ft.addAquacise26F( name12 , "Aquacise Morning Session on the 26th of February");
                            altB.AltOpt1();
                            break;
                        case 13:
                            System.out.println("You have selected Zumba Evening Lesson for 5th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case13In = new Scanner(System.in);
                            String name13 = case13In.nextLine();
                            ft.addZumba5F( name13 , "Zumba Evening Session on the 5th of February");
                            altB.AltOpt1();
                            break;
                        case 14:
                            System.out.println("You have selected Zumba Evening Lesson for 12th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case14In = new Scanner(System.in);
                            String name14 = case14In.nextLine();
                            ft.addZumba12F( name14, "Zumba Evening Session on the 12th of February");
                            altB.AltOpt1();
                            break;
                        case 15:
                            System.out.println("You have selected Zumba Evening Lesson for 19th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case15In = new Scanner(System.in);
                            String name15 = case15In.nextLine();
                            ft.addZumba19F( name15, "Zumba Evening Session on the 19th of February");
                            altB.AltOpt1();
                            break;
                        case 16:
                            System.out.println("You have selected Zumba Evening Lesson for 26th of February \n");
                            System.out.println("Enter your lastName \n");
                            Scanner case16In = new Scanner(System.in);
                            String name16 = case16In.nextLine();
                            ft.addZumba26F( name16 , "Zumba Evening Session on the 26th of February");
                            altB.AltOpt1();
                            break;
                        default:
                            System.out.println("No lesson available for the selected session \n");

                            altB.AltOpt1();

                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("This an invalid input ::: You will be redirected to main menu \n \n \n ");
                    altB.AltOpt1();
                }
        } else {
            System.out.println("Invalid Entry");
            altB.AltOpt1();
        }
    }

    public void preferlesson() {
            System.out.println("You have choosen to view your time table by type of fitness lesson \n  ");

        System.out.println(
                        "\n              7th Jan          14 Jan          21 Jan          28 Jan       " +
                        "\n Morning:     1.Yoga           2.Yoga          3.Yoga          4.Yoga       " +
                        "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                        "\n Evening:     5.Spin           6.Spin          7.Spin          8.Spin       " +
                        "\n Price          £ 25             £ 25            £ 25            £ 25     \n" +


                        "                8th Jan          15 Jan          22 Jan          29 Jan       " +
                        "\n Morning:     9.Aquacise       10.Aquacise     11.Aquacise     12.Aquacise  " +
                        "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                        "\n Evening:     13.Zumba         14.Zumba        15.Zumba        16.Zumba     " +
                        "\n Price          £ 35             £ 35            £ 35            £ 35     \n" +

                        "\n              4 Feb            11 Feb          18 Feb          25 Feb       " +
                        "\n Morning:     17.Yoga          18.Yoga         19.Yoga         20.Yoga      " +
                        "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                        "\n Evening:     21.Spin          22.Spin         23.Spin         24.Spin    \n" +
                        "\n Price          £ 25             £ 25            £ 25            £ 25       " +

                        "\n              5 Feb            12 Feb          19 Feb          26 Feb       " +
                        "\n Morning:     25.Aquacise      26.Aquacise     27.Aquacise     28.Aquacise  " +
                        "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                        "\n Evening:     29.Zumba         30.Zumba        31.Zumba        32.Zumba   \n" +
                        "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

        System.out.println("Type in your preferred lesson session according to lesson numbers \n");

            try {
                System.out.println("Type in your preferred session here: ");
                int bylessonSession = TimeEntry.nextInt();
                String userName;
                switch (bylessonSession) {
                    case 1:
                        System.out.println("You have selected Yoga Morning Lesson for 7th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case1In = new Scanner(System.in);
                        String name1 = case1In.nextLine();
                        ft.addYoga7thJ(name1 , "Yoga Morning Session on the 7th of January");
                        altB.AltOpt1();
                        break;
                    case 2:
                        System.out.println("You have selected Yoga Morning Lesson for 14th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case2In = new Scanner(System.in);
                        String name2 = case2In.nextLine();
                        ft.addYoga14thJ( name2, "Yoga Morning Session on the 14th of January");
                        altB.AltOpt1();
                        break;
                    case 3:
                        System.out.println("You have selected Yoga Morning Lesson for 21st of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case3In = new Scanner(System.in);
                        String name3 = case3In.nextLine();
                        ft.addYoga21J( name3 , "Yoga Morning Session on the 21th of January");
                        altB.AltOpt1();
                        break;
                    case 4:
                        System.out.println("You have selected Yoga Morning Lesson for 28th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case4In = new Scanner(System.in);
                        String name4 = case4In.nextLine();
                        ft.addYoga28J( name4 , "Yoga Morning Session on the 28th of January");
                        altB.AltOpt1();
                        break;
                    case 5:
                        System.out.println("You have selected Spin Evening Lesson for 7th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case5In = new Scanner(System.in);
                        String name5 = case5In.nextLine();
                        ft.addSpin7J( name5 , "Spin Evening Session on the 7th of January");
                        altB.AltOpt1();
                        break;
                    case 6:
                        System.out.println("You have selected Spin Evening Lesson for 14th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case6In = new Scanner(System.in);
                        String name6 = case6In.nextLine();
                        ft.addSpin14J( name6 , "Spin Evening Session on the 14th of January");
                        altB.AltOpt1();
                        break;
                    case 7:
                        System.out.println("You have selected Spin Evening Lesson for 21st of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case7In = new Scanner(System.in);
                        String name7 = case7In.nextLine();
                        ft.addSpin21J( name7 , "Spin Evening Session on the 21th of January");
                        altB.AltOpt1();
                        break;
                    case 8:
                        System.out.println("You have selected Spin Evening Lesson for 28th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case8In = new Scanner(System.in);
                        String name8 = case8In.nextLine();
                        ft.addSpin28J( name8 , "Spin Evening Session on the 28th of January");
                        altB.AltOpt1();
                        break;
                    case 9:
                        System.out.println("You have selected Aquacise Morning Lesson for 8th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case9In = new Scanner(System.in);
                        String name9 = case9In.nextLine();
                        ft.addAquacise8J( name9 , "Aquacise Morning Session on the 8th of January");
                        altB.AltOpt1();
                        break;
                    case 10:
                        System.out.println("You have selected Aquacise Morning Lesson for 15th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case10In = new Scanner(System.in);
                        String name10 = case10In.nextLine();
                        ft.addAquacise15J( name10 , "Aquacise Morning Session on the 15th of January");
                        altB.AltOpt1();
                        break;
                    case 11:
                        System.out.println("You have selected Aquacise Morning Lesson for 22nd of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case11In = new Scanner(System.in);
                        String name11 = case11In.nextLine();
                        ft.addAquacise22J( name11 , "Aquacise Morning Session on the 22nd of January");
                        altB.AltOpt1();
                        break;
                    case 12:
                        System.out.println("You have selected Aquacise Morning Lesson for 29th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case12In = new Scanner(System.in);
                        String name12 = case12In.nextLine();
                        ft.addAquacise29J( name12 , "Aquacise Morning Session on the 29th of January");
                        altB.AltOpt1();
                        break;
                    case 13:
                        System.out.println("You have selected Zumba Evening Lesson for 8th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case13In = new Scanner(System.in);
                        String name13 = case13In.nextLine();
                        ft.addZumba8J( name13 , "Zumba Evening Session on the 8th of January");
                        altB.AltOpt1();
                        break;
                    case 14:
                        System.out.println("You have selected Zumba Evening Lesson for 15th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case14In = new Scanner(System.in);
                        String name14 = case14In.nextLine();
                        ft.addZumba15J( name14 , "Zumba Evening Session on the 15th of January");
                        altB.AltOpt1();
                        break;
                    case 15:
                        System.out.println("You have selected Zumba Evening Lesson for 22nd of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case15In = new Scanner(System.in);
                        String name15 = case15In.nextLine();
                        ft.addZumba22J( name15 , "Zumba Evening Session on the 22nd of January");
                        altB.AltOpt1();
                        break;
                    case 16:
                        System.out.println("You have selected Zumba Evening Lesson for 29th of January \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case16In = new Scanner(System.in);
                        String name16 = case16In.nextLine();
                        ft.addZumba29J( name16 , "Zumba Evening Session on the 29th of January");
                        altB.AltOpt1();
                        break;
                    case 17:
                        System.out.println("You have selected Yoga Morning Lesson for 4th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case17In = new Scanner(System.in);
                        String name17 = case17In.nextLine();
                        ft.addYoga4F( name17 , "Yoga Morning Session on the 4th of February");
                        altB.AltOpt1();
                        break;
                    case 18:
                        System.out.println("You have selected Yoga Morning Lesson for 11th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case18In = new Scanner(System.in);
                        String name18 = case18In.nextLine();
                        ft.addYoga11F( name18 , "Yoga Morning Session on the 11th of February");
                        altB.AltOpt1();
                        break;
                    case 19:
                        System.out.println("You have selected Yoga Morning Lesson for 18th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case19In = new Scanner(System.in);
                        String name19 = case19In.nextLine();
                        ft.addYoga18F( name19 , "Yoga Morning Session on the 18th of February");
                        altB.AltOpt1();
                        break;
                    case 20:
                        System.out.println("You have selected Yoga Morning Lesson for 25th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case20In = new Scanner(System.in);
                        String name20 = case20In.nextLine();
                        ft.addYoga25F( name20 , "Yoga Morning Session on the 25th of February");
                        altB.AltOpt1();
                        break;
                    case 21:
                        System.out.println("You have selected Spin Evening Lesson for 4th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case21In = new Scanner(System.in);
                        String name21 = case21In.nextLine();
                        ft.addSpin4F( name21 , "Spin Evening Session on the 4th of February");
                        altB.AltOpt1();
                        break;
                    case 22:
                        System.out.println("You have selected Spin Evening Lesson for 11th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case22In = new Scanner(System.in);
                        String name22 = case22In.nextLine();
                        ft.addSpin11F( name22 , "Spin Evening Session on the 11th of February");
                        altB.AltOpt1();
                        break;
                    case 23:
                        System.out.println("You have selected Spin Evening Lesson for 18th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case23In = new Scanner(System.in);
                        String name23 = case23In.nextLine();
                        ft.addSpin18F( name23 , "Spin Evening Session on the 18th of February");
                        altB.AltOpt1();
                        break;
                    case 24:
                        System.out.println("You have selected Spin Evening Lesson for 25th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case24In = new Scanner(System.in);
                        String name24 = case24In.nextLine();
                        ft.addSpin25F( name24 , "Spin Evening Session on the 25th of February");
                        altB.AltOpt1();
                        break;
                    case 25:
                        System.out.println("You have selected Aquacise Morning Lesson for 5th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case25In = new Scanner(System.in);
                        String name25 = case25In.nextLine();
                        ft.addAquacise5F( name25 , "Aquacise Morning Session on the 5th of February");
                        altB.AltOpt1();
                        break;
                    case 26:
                        System.out.println("You have selected Aquacise Morning Lesson for 12th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case26In = new Scanner(System.in);
                        String name26 = case26In.nextLine();
                        ft.addAquacise12F( name26 , "Aquacise Morning Session on the 12th of February");
                        altB.AltOpt1();
                        break;
                    case 27:
                        System.out.println("You have selected Aquacise Morning Lesson for 19th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case27In = new Scanner(System.in);
                        String name27 = case27In.nextLine();
                        ft.addAquacise19F( name27 , "Aquacise Morning Session on the 19th of February");
                        altB.AltOpt1();
                        break;
                    case 28:
                        System.out.println("You have selected Aquacise Morning Lesson for 26th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case28In = new Scanner(System.in);
                        String name28 = case28In.nextLine();
                        ft.addAquacise26F( name28 , "Aquacise Morning Session on the 26th of February");
                        altB.AltOpt1();
                        break;
                    case 29:
                        System.out.println("You have selected Zumba Evening Lesson for 5th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case29In = new Scanner(System.in);
                        String name29 = case29In.nextLine();
                        ft.addZumba5F( name29 , "Zumba Evening Session on the 5th of February");
                        altB.AltOpt1();
                        break;
                    case 30:
                        System.out.println("You have selected Zumba Evening Lesson for 12th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case30In = new Scanner(System.in);
                        String name30 = case30In.nextLine();
                        ft.addZumba12F( name30 , "Zumba Evening Session on the 12th of February");
                        altB.AltOpt1();
                        break;
                    case 31:
                        System.out.println("You have selected Zumba Evening Lesson for 19th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case31In = new Scanner(System.in);
                        String name31 = case31In.nextLine();
                        ft.addZumba19F( name31 , "Zumba Evening Session on the 19th of February");
                        altB.AltOpt1();
                        break;
                    case 32:
                        System.out.println("You have selected Zumba Evening Lesson for 26th of February \n");
                        System.out.println("Enter your lastName \n");
                        Scanner case32In = new Scanner(System.in);
                        String name32 = case32In.nextLine();
                        ft.addZumba26F( name32 , "Zumba Evening Session on the 26th of February");
                        altB.AltOpt1();
                        break;
                    default:
                        System.out.println("No lesson available for the selected session");
                        altB.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected to main menu \n \n \n ");
                altB.AltOpt1();
            }
    }

    // A method to welcome my client into the timetable portal

}
