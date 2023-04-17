package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RateReview {

    //An object of the alternate Option Class
    AlternateOptions alt = new AlternateOptions();

    // An object of the lesson classes is created
    FitnessLesson ft =  FitnessLesson.getInstance();
    Scanner revRat = new Scanner(System.in);
    public void revRatWlc(){

        System.out.println("PRESS 1: To rate \n" +
                           "PRESS 2: To review \n");

        int revRatIn = revRat.nextInt();
        if (revRatIn == 1 ) {
            System.out.println("Please select your lesson and session: \n");

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


            try {
                int revRatS = revRat.nextInt();
                switch (revRatS) {
                    case 1:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn1 = new Scanner(System.in);
                        String BookingID1 = caseIn1.nextLine();
                        ft.rateYoga7thJ(BookingID1);
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn2 = new Scanner(System.in);
                        String BookingID2 = caseIn2.nextLine();
                        ft.rateYoga14thJ(BookingID2);
                        alt.AltOpt1();
                        break;
                    case 3:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn3 = new Scanner(System.in);
                        String BookingID3 = caseIn3.nextLine();
                        ft.rateYoga21J(BookingID3);
                        alt.AltOpt1();
                        break;
                    case 4:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn4 = new Scanner(System.in);
                        String BookingID4 = caseIn4.nextLine();
                        ft.rateYoga28J(BookingID4);
                        alt.AltOpt1();
                        break;
                    case 5:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn5 = new Scanner(System.in);
                        String BookingID5 = caseIn5.nextLine();
                        ft.rateSpin7J(BookingID5);
                        alt.AltOpt1();
                        break;
                    case 6:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn6 = new Scanner(System.in);
                        String BookingID6 = caseIn6.nextLine();
                        ft.rateSpin14J(BookingID6);
                        alt.AltOpt1();
                        break;
                    case 7:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn7 = new Scanner(System.in);
                        String BookingID7 = caseIn7.nextLine();
                        ft.rateSpin21J(BookingID7);
                        alt.AltOpt1();
                        break;
                    case 8:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn8 = new Scanner(System.in);
                        String BookingID8 = caseIn8.nextLine();
                        ft.rateSpin28J(BookingID8);
                        alt.AltOpt1();
                        break;
                    case 9:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn9 = new Scanner(System.in);
                        String BookingID9 = caseIn9.nextLine();
                        ft.rateAquacise8J(BookingID9);
                        alt.AltOpt1();
                        break;
                    case 10:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn10 = new Scanner(System.in);
                        String BookingID10 = caseIn10.nextLine();
                        ft.rateAquacise15J(BookingID10);
                        alt.AltOpt1();
                        break;
                    case 11:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn11 = new Scanner(System.in);
                        String BookingID11 = caseIn11.nextLine();
                        ft.rateAquacise22J(BookingID11);
                        alt.AltOpt1();
                        break;
                    case 12:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn12 = new Scanner(System.in);
                        String BookingID12 = caseIn12.nextLine();
                        ft.rateAquacise29J(BookingID12);
                        alt.AltOpt1();
                        break;
                    case 13:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn13 = new Scanner(System.in);
                        String BookingID13 = caseIn13.nextLine();
                        ft.rateZumba8J(BookingID13);
                        alt.AltOpt1();
                        break;
                    case 14:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn14 = new Scanner(System.in);
                        String BookingID14 = caseIn14.nextLine();
                        ft.rateZumba15J(BookingID14);
                        alt.AltOpt1();
                        break;
                    case 15:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn15 = new Scanner(System.in);
                        String BookingID15 = caseIn15.nextLine();
                        ft.rateZumba22J(BookingID15);
                        alt.AltOpt1();
                        break;
                    case 16:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn16 = new Scanner(System.in);
                        String BookingID16 = caseIn16.nextLine();
                        ft.rateZumba29J(BookingID16);
                        alt.AltOpt1();
                        break;
                    case 17:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn17 = new Scanner(System.in);
                        String BookingID17 = caseIn17.nextLine();
                        ft.rateYoga4F(BookingID17);
                        alt.AltOpt1();
                        break;
                    case 18:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn18 = new Scanner(System.in);
                        String BookingID18 = caseIn18.nextLine();
                        ft.rateYoga11F(BookingID18);
                        alt.AltOpt1();
                        break;
                    case 19:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn19 = new Scanner(System.in);
                        String BookingID19 = caseIn19.nextLine();
                        ft.rateYoga18F(BookingID19);
                        alt.AltOpt1();
                        break;
                    case 20:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn20 = new Scanner(System.in);
                        String BookingID20 = caseIn20.nextLine();
                        ft.rateYoga25F(BookingID20);
                        alt.AltOpt1();
                        break;
                    case 21:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn21 = new Scanner(System.in);
                        String BookingID21 = caseIn21.nextLine();
                        ft.rateSpin4F(BookingID21);
                        alt.AltOpt1();
                        break;
                    case 22:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn22 = new Scanner(System.in);
                        String BookingID22 = caseIn22.nextLine();
                        ft.rateSpin11F(BookingID22);
                        alt.AltOpt1();
                        break;
                    case 23:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn23 = new Scanner(System.in);
                        String BookingID23 = caseIn23.nextLine();
                        ft.rateSpin18F(BookingID23);
                        alt.AltOpt1();
                        break;
                    case 24:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn24 = new Scanner(System.in);
                        String BookingID24 = caseIn24.nextLine();
                        ft.rateSpin25F(BookingID24);
                        alt.AltOpt1();
                        break;
                    case 25:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn25 = new Scanner(System.in);
                        String BookingID25 = caseIn25.nextLine();
                        ft.rateAquacise5F(BookingID25);
                        alt.AltOpt1();
                        break;
                    case 26:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn26 = new Scanner(System.in);
                        String BookingID26 = caseIn26.nextLine();
                        ft.rateAquacise12F(BookingID26);
                        break;
                    case 27:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn27 = new Scanner(System.in);
                        String BookingID27 = caseIn27.nextLine();
                        ft.rateAquacise19F(BookingID27);
                        break;
                    case 28:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn28 = new Scanner(System.in);
                        String BookingID28 = caseIn28.nextLine();
                        ft.rateAquacise26F(BookingID28);
                        break;
                    case 29:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn29 = new Scanner(System.in);
                        String BookingID29 = caseIn29.nextLine();
                        ft.rateZumba5F(BookingID29);
                        break;
                    case 30:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn30 = new Scanner(System.in);
                        String BookingID30 = caseIn30.nextLine();
                        ft.rateZumba12F(BookingID30);
                        break;
                    case 31:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn31 = new Scanner(System.in);
                        String BookingID31 = caseIn31.nextLine();
                        ft.rateZumba19F(BookingID31);
                        break;
                    case 32:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn32 = new Scanner(System.in);
                        String BookingID32 = caseIn32.nextLine();
                        ft.rateZumba26F(BookingID32);
                        break;
                    default:
                        System.out.println("No lesson available for the selected session");
                        alt.AltOpt1();
                }
            } catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                alt.AltOpt1();
            }
        }


        else if (revRatIn == 2 ) {

            System.out.println("Please select your lesson and session: \n");

            System.out.println(
                    "\n                      7th Jan          14 Jan          21 Jan            28 Jan" +
                            "\n Morning:     1.Yoga           3.Yoga          5.Yoga            7.Yoga" +
                            "\n Evening:     2.Spin           4.Spin          6.Spin            8.Spin \n" +

                            "                8th Jan          15 Jan          22 Jan            29 Jan   " +
                            "\n Morning:     9.Aquacise       11.Aquacise     13.Aquacise       15.Aquacise" +
                            "\n Evening:     10.Zumba         12.Zumba        14.Zumba          16.Zumba  \n" +

                            "\n              4 Feb            11 Feb          18 Feb            25 Feb      " +
                            "\n Morning:     17.Yoga          19.Yoga         21.Yoga           23.Yoga     " +
                            "\n Evening:     18.Spin          20.Spin         22.Spin           24.Spin   \n" +

                            "\n              5 Feb            12 Feb          19 Jan            26 Feb         " +
                            "\n Morning:     25.Aquacise      27.Aquacise     29.Aquacise       31.Aquacise    " +
                            "\n Evening:     26.Zumba          28.Zumba       30.Zumba          32.Zumba     \n");

            try {
                int revRatS = revRat.nextInt();
                switch (revRatS) {
                    case 1:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In1 = new Scanner(System.in);
                        String BookingID1 = case1In1.nextLine();
                        ft.reviewYoga7thJ(BookingID1);
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("Enter your Booking ID \n");
                        Scanner caseIn2 = new Scanner(System.in);
                        String BookingID2 = caseIn2.nextLine();
                        ft.reviewYoga14thJ(BookingID2);
                        alt.AltOpt1();
                        break;
                    case 3:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In3 = new Scanner(System.in);
                        String BookingID3 = case1In3.nextLine();
                        ft.reviewYoga21J(BookingID3);
                        alt.AltOpt1();
                        break;
                    case 4:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In4 = new Scanner(System.in);
                        String BookingID4 = case1In4.nextLine();
                        ft.reviewYoga28J(BookingID4);
                        alt.AltOpt1();
                        break;
                    case 5:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In5 = new Scanner(System.in);
                        String BookingID5 = case1In5.nextLine();
                        ft.reviewSpin7J(BookingID5);
                        alt.AltOpt1();
                        break;
                    case 6:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In6 = new Scanner(System.in);
                        String BookingID6 = case1In6.nextLine();
                        ft.reviewSpin14J(BookingID6);
                        alt.AltOpt1();
                        break;
                    case 7:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In7 = new Scanner(System.in);
                        String BookingID7 = case1In7.nextLine();
                        ft.reviewSpin21J(BookingID7);
                        alt.AltOpt1();
                        break;
                    case 8:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In8 = new Scanner(System.in);
                        String BookingID8 = case1In8.nextLine();
                        ft.reviewSpin28J(BookingID8);
                        alt.AltOpt1();
                        break;
                    case 9:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In9 = new Scanner(System.in);
                        String BookingID9 = case1In9.nextLine();
                        ft.reviewAquacise8J(BookingID9);
                        alt.AltOpt1();
                        break;
                    case 10:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In10 = new Scanner(System.in);
                        String BookingID10 = case1In10.nextLine();
                        ft.reviewAquacise15J(BookingID10);
                        alt.AltOpt1();
                        break;
                    case 11:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In11 = new Scanner(System.in);
                        String BookingID11 = case1In11.nextLine();
                        ft.reviewAquacise22J(BookingID11);
                        alt.AltOpt1();
                        break;
                    case 12:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In12 = new Scanner(System.in);
                        String BookingID12 = case1In12.nextLine();
                        ft.reviewAquacise29J(BookingID12);
                        alt.AltOpt1();
                        break;
                    case 13:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In13 = new Scanner(System.in);
                        String BookingID13 = case1In13.nextLine();
                        ft.reviewZumba8J(BookingID13);
                        alt.AltOpt1();
                        break;
                    case 14:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In14 = new Scanner(System.in);
                        String BookingID14 = case1In14.nextLine();
                        ft.reviewZumba15J(BookingID14);
                        alt.AltOpt1();
                        break;
                    case 15:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In15 = new Scanner(System.in);
                        String BookingID15 = case1In15.nextLine();
                        ft.reviewZumba22J(BookingID15);
                        alt.AltOpt1();
                        break;
                    case 16:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In16 = new Scanner(System.in);
                        String BookingID16 = case1In16.nextLine();
                        ft.reviewZumba29J(BookingID16);
                        alt.AltOpt1();
                        break;
                    case 17:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In17 = new Scanner(System.in);
                        String BookingID17 = case1In17.nextLine();
                        ft.reviewYoga4F(BookingID17);
                        alt.AltOpt1();
                        break;
                    case 18:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In18 = new Scanner(System.in);
                        String BookingID18 = case1In18.nextLine();
                        ft.reviewYoga11F(BookingID18);
                        alt.AltOpt1();
                        break;
                    case 19:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In19 = new Scanner(System.in);
                        String BookingID19 = case1In19.nextLine();
                        ft.reviewYoga18F(BookingID19);
                        alt.AltOpt1();
                        break;
                    case 20:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In20 = new Scanner(System.in);
                        String BookingID20 = case1In20.nextLine();
                        ft.reviewYoga25F(BookingID20);
                        alt.AltOpt1();
                        break;
                    case 21:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In21 = new Scanner(System.in);
                        String BookingID21 = case1In21.nextLine();
                        ft.reviewSpin4F(BookingID21);
                        alt.AltOpt1();
                        break;
                    case 22:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In22 = new Scanner(System.in);
                        String BookingID22 = case1In22.nextLine();
                        ft.reviewSpin11F(BookingID22);
                        alt.AltOpt1();
                        break;
                    case 23:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In23 = new Scanner(System.in);
                        String BookingID23 = case1In23.nextLine();
                        ft.reviewSpin18F(BookingID23);
                        alt.AltOpt1();                        break;
                    case 24:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In24 = new Scanner(System.in);
                        String BookingID24 = case1In24.nextLine();
                        ft.reviewSpin25F(BookingID24);
                        alt.AltOpt1();                        break;
                    case 25:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In25 = new Scanner(System.in);
                        String BookingID25 = case1In25.nextLine();
                        ft.reviewAquacise5F(BookingID25);
                        alt.AltOpt1();
                        break;
                    case 26:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In26 = new Scanner(System.in);
                        String BookingID26 = case1In26.nextLine();
                        ft.reviewAquacise12F(BookingID26);
                        alt.AltOpt1();
                        break;
                    case 27:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In27 = new Scanner(System.in);
                        String BookingID27 = case1In27.nextLine();
                        ft.reviewAquacise19F(BookingID27);
                        alt.AltOpt1();
                        break;
                    case 28:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In28 = new Scanner(System.in);
                        String BookingID28 = case1In28.nextLine();
                        ft.reviewAquacise26F(BookingID28);
                        alt.AltOpt1();
                        break;
                    case 29:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In29 = new Scanner(System.in);
                        String BookingID29 = case1In29.nextLine();
                        ft.reviewZumba5F(BookingID29);
                        alt.AltOpt1();
                        break;
                    case 30:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In30 = new Scanner(System.in);
                        String BookingID30 = case1In30.nextLine();
                        ft.reviewZumba12F(BookingID30);
                        break;
                    case 31:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In31 = new Scanner(System.in);
                        String BookingID31 = case1In31.nextLine();
                        ft.reviewZumba19F(BookingID31);
                        break;
                    case 32:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In32 = new Scanner(System.in);
                        String BookingID32 = case1In32.nextLine();
                        ft.reviewZumba26F(BookingID32);
                        break;
                    default:
                        System.out.println("No lesson available for the selected session \n");
                        alt.AltOpt1();
                }
            } catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                alt.AltOpt1();
            }
        }
        else{
            System.out.println("Invalid input \n");
            alt.AltOpt1();
        }


            }


}
