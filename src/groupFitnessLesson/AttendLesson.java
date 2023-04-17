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
                    System.out.println("Enter your Booking ID \n");
                    Scanner case4In = new Scanner(System.in);
                    String BookingID4 = case4In.nextLine();
                    ft.attendYoga28J(BookingID4 , "Yoga Morning Session on the 7th of January");
                    alt.AltOpt1();
                    break;
                case 5:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case5In = new Scanner(System.in);
                    String BookingID5 = case5In.nextLine();
                    ft.attendSpin7J(BookingID5 , "Spin Evening Session on the 7th of January");
                    alt.AltOpt1();
                    break;
                case 6:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case6In = new Scanner(System.in);
                    String BookingID6 = case6In.nextLine();
                    ft.attendSpin14J(BookingID6 , "Spin Evening Session on the 14th of January");
                    alt.AltOpt1();
                    break;
                case 7:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case7In = new Scanner(System.in);
                    String BookingID7 = case7In.nextLine();
                    ft.attendSpin21J( BookingID7 , "Spin Evening Session on the 21th of January");
                    alt.AltOpt1();
                    break;
                case 8:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case8In = new Scanner(System.in);
                    String BookingID8 = case8In.nextLine();
                    ft.attendSpin28J( BookingID8 , "Spin Evening Session on the 28th of January");
                    alt.AltOpt1();
                    break;
                case 9:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case9In = new Scanner(System.in);
                    String BookingID9 = case9In.nextLine();
                    ft.attendAquacise8J(BookingID9 , "Aquacise Morning Session on the 8th of January");
                    alt.AltOpt1();
                    break;
                case 10:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case10In = new Scanner(System.in);
                    String BookingID10 = case10In.nextLine();
                    ft.attendAquacise15J(BookingID10 , "Aquacise Morning Session on the 15th of January");
                    alt.AltOpt1();
                    break;
                case 11:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case11In = new Scanner(System.in);
                    String BookingID11 = case11In.nextLine();
                    ft.attendAquacise22J(BookingID11 , "Aquacise Morning Session on the 22nd of January");
                    alt.AltOpt1();
                    break;
                case 12:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case12In = new Scanner(System.in);
                    String BookingID12 = case12In.nextLine();
                    ft.attendAquacise29J(BookingID12 , "Aquacise Morning Session on the 29th of January");
                    alt.AltOpt1();
                    break;
                case 13:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case13In = new Scanner(System.in);
                    String BookingID13 = case13In.nextLine();
                    ft.attendZumba8J( BookingID13 , "Zumba Evening Session on the 8th of January");
                    alt.AltOpt1();
                    break;
                case 14:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case14In = new Scanner(System.in);
                    String BookingID14 = case14In.nextLine();
                    ft.attendZumba15J( BookingID14 , "Zumba Evening Session on the 15th of January");
                    alt.AltOpt1();
                    break;
                case 15:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case15In = new Scanner(System.in);
                    String BookingID15 = case15In.nextLine();
                    ft.attendZumba22J( BookingID15 , "Zumba Evening Session on the 22nd of January");
                    alt.AltOpt1();
                    break;
                case 16:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case16In = new Scanner(System.in);
                    String BookingID16 = case16In.nextLine();
                    ft.attendZumba29J( BookingID16 , "Zumba Evening Session on the 15th of January");
                    alt.AltOpt1();
                    break;
                case 17:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case17In = new Scanner(System.in);
                    String BookingID17 = case17In.nextLine();
                    ft.attendYoga4F(BookingID17 , "Yoga Morning Session on the 4th of February");
                    alt.AltOpt1();
                    break;
                case 18:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case18In = new Scanner(System.in);
                    String BookingID18 = case18In.nextLine();
                    ft.attendYoga11F(BookingID18 , "Yoga Morning Session on the 11th of February");
                    alt.AltOpt1();
                    break;
                case 19:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case19In = new Scanner(System.in);
                    String BookingID19 = case19In.nextLine();
                    ft.attendYoga18F(BookingID19 , "Yoga Morning Session on the 18th of February");
                    alt.AltOpt1();
                    break;
                case 20:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case20In = new Scanner(System.in);
                    String BookingID20 = case20In.nextLine();
                    ft.attendYoga25F(BookingID20 , "Yoga Morning Session on the 25th of February");
                    alt.AltOpt1();
                    break;
                case 21:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case21In = new Scanner(System.in);
                    String BookingID21 = case21In.nextLine();
                    ft.attendSpin4F(BookingID21 , "Spin Evening Session on the 4th of February");
                    alt.AltOpt1();
                    break;
                case 22:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case22In = new Scanner(System.in);
                    String BookingID22 = case22In.nextLine();
                    ft.attendSpin11F(BookingID22 , "Spin Evening Session on the 11th of February");
                    alt.AltOpt1();
                    break;
                case 23:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case23In = new Scanner(System.in);
                    String BookingID23 = case23In.nextLine();
                    ft.attendSpin18F(BookingID23 , "Spin Evening Session on the 18th of February");
                    alt.AltOpt1();
                    break;
                case 24:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case24In = new Scanner(System.in);
                    String BookingID24 = case24In.nextLine();
                    ft.attendSpin25F(BookingID24 , "Spin Evening Session on the 25th of February");
                    alt.AltOpt1();
                    break;
                case 25:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case25In = new Scanner(System.in);
                    String BookingID25 = case25In.nextLine();
                    ft.attendAquacise5F(BookingID25 , "Aquacise Morning Session on the 5th of February");
                    alt.AltOpt1();
                    break;
                case 26:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case26In = new Scanner(System.in);
                    String BookingID26 = case26In.nextLine();
                    ft.attendAquacise12F(BookingID26 , "Aquacise Morning Session on the 12th of February");
                    alt.AltOpt1();
                    break;
                case 27:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case27In = new Scanner(System.in);
                    String BookingID27 = case27In.nextLine();
                    ft.attendAquacise19F(BookingID27 , "Aquacise Morning Session on the 19th of February");
                    alt.AltOpt1();
                    break;
                case 28:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case28In = new Scanner(System.in);
                    String BookingID28 = case28In.nextLine();
                    ft.attendAquacise26F(BookingID28 , "Aquacise Morning Session on the 26th of February");
                    alt.AltOpt1();
                    break;
                case 29:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case29In = new Scanner(System.in);
                    String BookingID29 = case29In.nextLine();
                    ft.attendZumba5F( BookingID29 , "Zumba Evening Session on the 5th of February");
                    alt.AltOpt1();
                    break;
                case 30:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case30In = new Scanner(System.in);
                    String BookingID30 = case30In.nextLine();
                    ft.attendZumba5F( BookingID30 , "Zumba Evening Session on the 12th of February");
                    alt.AltOpt1();
                    break;
                case 31:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case31In = new Scanner(System.in);
                    String BookingID31 = case31In.nextLine();
                    ft.attendZumba5F( BookingID31 , "Zumba Evening Session on the 19th of February");
                    alt.AltOpt1();
                    break;
                case 32:
                    System.out.println("Enter your Booking ID \n");
                    Scanner case32In = new Scanner(System.in);
                    String BookingID32 = case32In.nextLine();
                    ft.attendZumba26F( BookingID32 , "Zumba Evening Session on the 26th of February");
                    alt.AltOpt1();
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