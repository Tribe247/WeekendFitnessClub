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
                "\n PRESS 1: To Change " +
                "\n PRESS 2: To Cancel ");

        int changeOp = changeIn.nextInt();
        if ( changeOp == 1) {

            // Creating an input stream to select customer particular booking to change

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

                            "\n              4 Feb            11 Feb          18 Jan          25 Feb       " +
                            "\n Morning:     17.Yoga          18.Yoga         19.Yoga         20.Yoga      " +
                            "\n Price          £ 21             £ 21            £ 21            £ 21       " +
                            "\n Evening:     21.Spin          22.Spin         23.Spin         24.Spin    \n" +
                            "\n Price          £ 25             £ 25            £ 25            £ 25       " +

                            "\n              5 Feb            12 Feb          19 Jan          26 Feb       " +
                            "\n Morning:     25.Aquacise      26.Aquacise     27.Aquacise     28.Aquacise  " +
                            "\n Price          £ 33             £ 33            £ 33            £ 33       " +
                            "\n Evening:     29.Zumba         30.Zumba        31.Zumba        32.Zumba   \n" +
                            "\n Price          £ 35             £ 35            £ 35            £ 35     \n");

            System.out.print("Please select the date and session you booked for::: \n");

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

                            "\n              4 Feb            11 Feb          18 Jan          25 Feb       " +
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
