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
                    "\n                      7th Jan          14 Jan          21 Jan            28 Jan     " +
                            "\n Morning:     1.Yoga           3.Yoga          5.Yoga            7.Yoga     " +
                            "\n Evening:     2.Spin           4.Spin          6.Spin            8.Spin \n  " +

                            "                8th Jan          15 Jan          22 Jan            29 Jan     " +
                            "\n Morning:     9.Aquacise       11.Aquacise     13.Aquacise       15.Aquacise" +
                            "\n Evening:     10.Zumba         12.Zumba        14.Zumba          16.Zumba \n" +

                            "\n              4 Feb            11 Feb          18 Feb            25 Feb     " +
                            "\n Morning:     17.Yoga          19.Yoga         21.Yoga           23.Yoga    " +
                            "\n Evening:     18.Spin          20.Spin         22.Spin           24.Spin  \n" +

                            "\n              5 Feb            12 Feb          19 Jan            26 Feb     " +
                            "\n Morning:     25.Aquacise      27.Aquacise     29.Aquacise       31.Aquacise" +
                            "\n Evening:     26.Zumba          28.Zumba       30.Zumba          32.Zumba \n");

            try {
                int revRatS = revRat.nextInt();
                switch (revRatS) {
                    case 1:
                        System.out.println("Enter your Booking ID \n");
                        Scanner case1In = new Scanner(System.in);
                        String BookingID = case1In.nextLine();
                        ft.rateYoga7thJ(BookingID);
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("Thursday6");
                        break;
                    case 3:
                        System.out.println("Thursday666");
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
                        Scanner case1In = new Scanner(System.in);
                        String BookingID = case1In.nextLine();
                        ft.reviewYoga7thJ(BookingID);
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("Thursday6");
                        break;
                    case 3:
                        System.out.println("Thursday666");
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
                        System.out.println("No lesson available for the selected session");
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
