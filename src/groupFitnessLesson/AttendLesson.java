package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AttendLesson {

    //An object of the alternate Option Class
    AlternateOptions alt = new AlternateOptions();

    // An instance of the lesson classes is created
    FitnessLesson ft =  FitnessLesson.getInstance();
    Scanner attendIn = new Scanner(System.in);

    public void attendL() {

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

                        "\n              5 Feb            12 Feb          19 Jan          26 Feb       " +
                        "\n Morning:     25.Aquacise      26.Aquacise     27.Aquacise     28.Aquacise  " +
                        "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                        "\n Evening:     29.Zumba         30.Zumba        31.Zumba        32.Zumba   \n" +
                        "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

        System.out.print("Please select the number of date and session you booked for: \n");

        try {
            int attendNew = attendIn.nextInt();
            switch (attendNew) {
                case 1:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case1In = new Scanner(System.in);
                    String BookingID1 = case1In.nextLine();
                    ft.attendYoga7thJ(BookingID1 , "Yoga Morning Session on the 7th of January");
                    alt.AltOpt1();
                    break;
                case 2:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case2In = new Scanner(System.in);
                    String BookingID2 = case2In.nextLine();
                    ft.attendYoga14thJ(BookingID2 , "Yoga Morning Session on the 7th of January");
                    alt.AltOpt1();
                    break;
                case 3:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case3In = new Scanner(System.in);
                    String BookingID3 = case3In.nextLine();
                    ft.attendYoga21J(BookingID3 , "Yoga Morning Session on the 7th of January");
                    alt.AltOpt1();
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
                case 17:

                    System.out.println("Thursday62");
                    break;
                case 18:
                    System.out.println("Thursday61");
                    break;
                case 19:
                    System.out.println("Thursday22");
                    break;
                case 20:
                    System.out.println("Thursday6");
                    break;
                case 21:
                    System.out.println("Friday1");
                    break;
                case 22:
                    System.out.println("Monday4");
                    break;
                case 23:
                    System.out.println("Tuesday2");
                    break;
                case 24:
                    System.out.println("Wednesday22");
                    break;
                case 25:
                    System.out.println("Thursday121");
                    break;
                case 26:
                    System.out.println("Friday112");
                    break;
                case 27:
                    System.out.println("Monday122");
                    break;
                case 28:
                    System.out.println("Tuesday424");
                    break;
                case 29:
                    System.out.println("Wednesday233");
                    break;
                case 30:
                    System.out.println("Thursday221");
                    break;
                case 31:
                    System.out.println("Friday224");
                    break;
                case 32:
                    System.out.println("Friday110");
                    break;
                default:
                    System.out.println("No lesson available for the selected session \n");
                    alt.AltOpt1();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
            alt.AltOpt1();
        }

    }

}