package groupFitnessLesson;

import java.util.HashMap;
import java.util.Scanner;

public class ReviewAttendData {

    Scanner revRating = new Scanner(System.in);

    // Creating object for launcher which contain the main menu
    //Launcher lh2 = new Launcher();

    // Creating object for sub launcher class which contain the main menu
    SubLauncher sbl1 = new SubLauncher();

    // Object for timetable and other class will also be created and added
    TimeTableLauncher tbl = new TimeTableLauncher();

    public void yoga7th(String bookingID) {
        HashMap<String, String> cusRecord = new HashMap<String, String>();
        //Set<Entry<String, String>> mappings = cusRecord.entrySet();
        cusRecord.put("Wale", "Yoga Evening Session 7th January\n");
        //cusRecord.put("Dele"   , "Yoga Evening Session 7th January\n");
        cusRecord.put("Henry", "Yoga Evening Session 7th January\n");
        cusRecord.put("Queen", "Yoga Evening Session 7th January\n");
        cusRecord.put("Malik", "Yoga Evening Session 7th January\n");

        System.out.println("Welcome to review and rating portal, You can review, rate and attend a class" +
                "\n PRESS 1: To attend your lesson" +
                "\n PRESS 2: To write reveiw for a lesson " +
                "\n PRESS 3: To rate a lesson" +
                "\n PRESS 4: to book new lesson" +
                "\n PRESS 5: to go the main menu" +
                "\n PRESS 6: to EXIT ");

        int revRatAtt = revRating.nextInt();

        switch (revRatAtt) {
            case 1:
                if (cusRecord.containsKey(bookingID)) {
                    System.out.println("Lesson Found: 1. Wale Sat 7th Spin (Or load it from array)" +
                            "Please proceed to attend your lesson");
                    System.out.println("Status: Attended");
                } else {
                    System.out.println("No record found");
                }
                break;
            case 2:

                if (cusRecord.containsKey(bookingID)) {
                    System.out.println("Please write a review of the lesson you attended");
                    System.out.println("Record found for (Lesson Details), Please leave your review");

                    Scanner revIn = new Scanner(System.in);

                    String review = revIn.nextLine();

                    System.out.println( review + "\n Thank you for the feedback");

                    System.out.println("\n What else will you like to do ?: " +
                            " PRESS 1: to go to main menu" +
                            " PRESS 2: to EXIT ");
                    int otherOption = revRating.nextInt();
                    switch (otherOption) {
                        case 1:
                            // call method to main menu
                            sbl1.welcomePage1();
                            break;

                        case 2:
                            // call method to EXIT the app
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Selection you will be redirected to main menu");
                            // Call method to main menu
                    }

                }
                else {
                    System.out.println("No record found");
                    // Call method to main menu
                }

                break;
            case 3:

                System.out.println("Please rate the lesson you attended");

                if (cusRecord.containsKey(bookingID)) {
                    System.out.println("Record found for (Lesson Details), Please select rating below review" +
                            "\n PRESS 1: Very dissatisfied " +
                            "\n PRESS 2: Dissatisfied " +
                            "\n PRESS 3: OK" +
                            "\n PRESS 4: Satisfied" +
                            "\n PRESS 5: Very Satisfied");

                    int rating = revRating.nextInt();

                    switch (rating) {
                        case 1:
                            System.out.println("Customer is Very dissatisfied" +
                                               "\n We hope to serve you better");
                            break;
                        case 2:
                            System.out.println("Customer is dissatisfied" +
                                               "\nWe hope to serve you better");
                            break;
                        case 3:
                            System.out.println("Customer is OK" +
                                               "\nWe hope to serve you better");
                            break;
                        case 4:
                            System.out.println("Customer is Satisfied" +
                                               "\nWe hope to serve you better");
                            break;
                        case 5:
                            System.out.println("Customer is Very Satisfied" +
                                               "\nWe hope to serve you better");
                            break;
                        default:
                            System.out.println("Invalid Selection");
                            // Call method to main menu
                    }
                }
                else {
                    System.out.println("You can not rate a lesson you did not attend. Thank you");
                }
                break;
            default:
                System.out.println("Invalid Selection");
                System.out.println("\n What else will you like to do ?: " +
                        " PRESS 1: to go to main menu" +
                        " PRESS 2: to EXIT ");
                int otherOption = revRating.nextInt();
                switch (otherOption) {
                    case 1:
                        // call method to main menu
                        break;
                    case 2:
                        // call method to EXIT the app
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        // Call method to main menu
                }
        }

    }

}
