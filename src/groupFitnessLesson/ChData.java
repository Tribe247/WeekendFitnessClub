package groupFitnessLesson;

import java.util.HashMap;
import java.util.Scanner;


public class ChData {

    Scanner chDscan = new Scanner(System.in);

    // Object to call my time table launcher
    TimeTableLauncher ttl = new TimeTableLauncher();

    // Creating an object for the sub launcher to call my functions
    SubLauncher sbl2 = new SubLauncher();

    //Trying to call another method from another class


    public void zumba21st(String bookingID) {
        HashMap<String, String> cusRecord = new HashMap<String, String>();
        //Set<Entry<String, String>> mappings = cusRecord.entrySet();
        cusRecord.put("Wale", "Zumba moring session 7th January\n");
        //cusRecord.put("Dele"   , "Zumba moring session 7th January");
        cusRecord.put("Henry", "Zumba moring session 7th January\n");
        cusRecord.put("Queen", "Zumba moring session 7th January\n");
        cusRecord.put("Malik", "Zumba moring session 7th January\n");

        if (cusRecord.containsKey(bookingID)) {
            //System.out.println("Record found, Please proceed to change your Booking");
            cusRecord.remove(bookingID);
            //System.out.println("Status: Change is successful ");
        } else {
            System.out.println("You do not have a booked session" +
                    "\n PRESS 1: to book a new session" +
                    "\n PRESS 2: to go to the main menu ");
            int newSession = chDscan.nextInt();
            switch (newSession) {
                case 1:
                    // Put method for new session
                    System.out.println("Proceed to book new session");
                    ttl.timeTableWelcome();

                    break;
                case 2:
                    System.out.println("Launcher Menu Reached");
                    // put method for main menu
                    sbl2.welcomePage1();

                    break;
                default:
                    System.out.println("Invalid Input");
                    // Let System go back to main menu
            }

        }

    }

}
