package groupFitnessLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeNCancel {

    Scanner changeIn = new Scanner(System.in);

    // Creating an object for the sub launcher to call my functions
    //SubLauncher sbl1 = new SubLauncher();


    // Creating Object for Time table Launcher
    TimeTableLauncher tb1 = new TimeTableLauncher();

    // Method for alternate options
    AlternateOptions alt = new AlternateOptions();

    // Instance of the class
    FitnessLesson ft =  FitnessLesson.getInstance();


    public void changeBooking() {

        System.out.println("Would you like to cancel or change your session" +
                "\n PRESS 1: To Change" +
                "\n PRESS 2: To Cancel ");

        int changeOp = changeIn.nextInt();
        if ( changeOp == 1) {

            // Creating an input stream to select customer particular booking to change
            System.out.print("Please select the date and session you booked for::: \n");
            System.out.println(
                    "\n                      7th Jan          14 Jan          21 Jan            28 Jan" +
                            "\n Morning:     1.Yoga           3.Yoga          5.Yoga            7.Yoga" +
                            "\n Evening:     2.Spin           4.Spin          6.Spin            8.Spin \n" +

                            "                8th Jan          15 Jan          22 Jan            29 Jan   " +
                            "\n Morning:     9.Aquacise       11.Aquacise     13.Aquacise       15.Aquacise" +
                            "\n Evening:     10.Zumba         12.Zumba        14.Zumba          16.Zumba  \n" +

                            "\n              4 Feb            11 Feb          18 Jan            25 Feb      " +
                            "\n Morning:     17.Yoga          19.Yoga         21.Yoga           23.Yoga     " +
                            "\n Evening:     18.Spin          20.Spin         22.Spin           24.Spin   \n" +

                            "\n              5 Feb            12 Feb          19 Jan            26 Feb         " +
                            "\n Morning:     25.Aquacise      27.Aquacise     29.Aquacise       31.Aquacise    " +
                            "\n Evening:     26.Zumba          28.Zumba       30.Zumba          32.Zumba     \n");

            try {
                int cusToChange = changeIn.nextInt();
                switch (cusToChange) {
                    case 1:
                        System.out.println("Input your BookingID: \n");
                        Scanner changeInc = new Scanner(System.in);
                        String BookingID = changeInc.nextLine();
                        ft.changeYoga7thJ(BookingID , "Yoga Morning Session on the 7th of January");
                        alt.AltOpt2();
                        break;
                    case 2:
                        System.out.println("No booked ");
                        break;
                    case 3:
                        System.out.println("No one booked ");
                        break;
                    case 4:
                        System.out.println("No booked two ");

                        break;
                    default:
                        System.out.println("No booked session for the selected period \n");
                        alt.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                    System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                    alt.AltOpt1();
            }

        }
        else if (changeOp == 2) {
            System.out.print("Please select the date and session you booked for::: \n");
            System.out.println(
                    "\n                      7th Jan          14 Jan          21 Jan            28 Jan" +
                            "\n Morning:     1.Yoga           3.Yoga          5.Yoga            7.Yoga" +
                            "\n Evening:     2.Spin           4.Spin          6.Spin            8.Spin \n" +

                            "                8th Jan          15 Jan          22 Jan            29 Jan   " +
                            "\n Morning:     9.Aquacise       11.Aquacise     13.Aquacise       15.Aquacise" +
                            "\n Evening:     10.Zumba         12.Zumba        14.Zumba          16.Zumba  \n" +

                            "\n              4 Feb            11 Feb          18 Jan            25 Feb      " +
                            "\n Morning:     17.Yoga          19.Yoga         21.Yoga           23.Yoga     " +
                            "\n Evening:     18.Spin          20.Spin         22.Spin           24.Spin   \n" +

                            "\n              5 Feb            12 Feb          19 Jan            26 Feb         " +
                            "\n Morning:     25.Aquacise      27.Aquacise     29.Aquacise       31.Aquacise    " +
                            "\n Evening:     26.Zumba          28.Zumba       30.Zumba          32.Zumba     \n");

            try {
                int cusToCancle = changeIn.nextInt();
                switch (cusToCancle) {
                    case 1:
                        System.out.println("Input your BookingID: \n");
                        Scanner changeInca = new Scanner(System.in);
                        String BookingID = changeInca.nextLine();
                        ft.cancelYoga7thJ(BookingID , "Yoga Morning Session on the 7th of January");
                        alt.AltOpt1();
                        break;
                    case 2:
                        System.out.println("No booked ");
                        break;
                    case 3:
                        System.out.println("No one booked ");
                        break;
                    case 4:
                        System.out.println("No booked two ");

                        break;
                    default:
                        System.out.println("No booked session for the selected period \n");
                        alt.AltOpt1();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("This an invalid input ::: You will be redirected for other options \n \n \n ");
                alt.AltOpt1();
            }

        }
        else {
            System.out.println(" Invalid Selection, You will be redirected for other options ");
            alt.AltOpt1();
        }

    }

}
