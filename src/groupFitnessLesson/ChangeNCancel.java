package groupFitnessLesson;

import java.util.Scanner;

public class ChangeNCancel {

    Scanner changeIn = new Scanner(System.in);

    // Creating an object for the sub launcher to call my functions
    //SubLauncher sbl1 = new SubLauncher();

    // Object of the ChData
    ChData chD1 = new ChData();

    // Creating Object for Time table Launcher
    TimeTableLauncher tb1 = new TimeTableLauncher();


    public void changeBooking() {

        System.out.println("Would you like to cancel or change your session" +
                "\n PRESS 1: To Change" +
                "\n PRESS 2: To Cancel ");

        int changeOp = changeIn.nextInt();
        if ( changeOp == 1) {

            // Creating an input stream to select customer particular booking to change
            System.out.print("Please select the booking to change" +
                    "\n 1. Henry for Sun Sat" + "\n 2. Henry for Sat Fit" + "\n 3. Henry for Sat Fit" + "\n 4. Henry for Sat Fit");
            int cusToChange = changeIn.nextInt();
            switch (cusToChange) {
                case 1:
                    // This method has been programmed in the fitness lesson to change and booked new session
                    // Remember to create a separate class for cancel/change input
                    chD1.zumba21st("Henry112");
                    System.out.println("Record found and successfully, Please follow the procedure below to book another fitness lesson session");
                    tb1.timeTableWelcome();
                    System.out.println("Session is changed from Henry112 Saturday to The new input from BookingID");
                    break;
                case 2:
                    // This method has been programmed in the fitness lesson to change and cancel
                    chD1.zumba21st("Henry114");
                    System.out.println("Please follow the procedure below to book another fitness lesson session");
                    tb1.timeTableWelcome();
                    System.out.println("Session is changed from Henry112 Saturday to" + "The new input from BookingID");

                    break;
                case 3:
                    // This method has been programmed in the fitness lesson to change and cancel
                    chD1.zumba21st("Henry124");
                    System.out.println("Please follow the procedure below to book another fitness lesson session");
                    tb1.timeTableWelcome();
                    System.out.println("Session is changed from Henry112 Saturday to" + "The new input from BookingID");

                    break;
                case 4:
                    // This method has been programmed in the fitness lesson to change and cancel
                    chD1.zumba21st("Henry121");
                    System.out.println("Please follow the procedure below to book another fitness lesson session");
                    tb1.timeTableWelcome();
                    System.out.println("Session is changed from Henry112 Saturday to + The new input from BookingID");

                    break;
                default:
                    System.out.println("No booked session for the selected period");
            }
        }
        else if (changeOp == 2) {
            // Creating an input stream to select customer particular booking to change
            System.out.print("Please select the booking to cancel" +
                    "\n 1. Henry for Sun Sat" + "\n 2. Henry for Sat Fit" + "\n 3. Henry for Sat Fit" + "\n 4. Henry for Sat Fit");
            int cusToCancel = changeIn.nextInt();
            switch (cusToCancel) {
                case 1:
                    // This method has been programmed in the fitness lesson to cancel session
                    // Remember to create a separate class for cancel/change input
                    chD1.zumba21st("Henry112");
                    System.out.println("Record found and successfully cancel");
                    //tb1.timeTableWelcome();
                    break;
                case 2:
                    // This method has been programmed in the fitness lesson to cancel a session
                    chD1.zumba21st("Henry102");
                    System.out.println("Record found and successfully, Please follow the procedure below to book another fitness lesson session");
                    //tb1.timeTableWelcome();
                    break;
                case 3:
                    // This method has been programmed in the fitness lesson to cancel a session
                    chD1.zumba21st("Henry132");
                    System.out.println("Record found and successfully, Please follow the procedure below to book another fitness lesson session");
                    //tb1.timeTableWelcome();
                    break;
                case 4:
                    // This method has been programmed in the fitness lesson to cancel a session
                    chD1.zumba21st("Henry172");
                    System.out.println("Record found and successfully, Please follow the procedure below to book another fitness lesson session");
                    //tb1.timeTableWelcome();
                    break;
                default:
                    System.out.println("No booked session for the selected period");
                    break;
            }
        }
        else {
            System.out.println(" Invalid Selection ");
        }

    }

}
