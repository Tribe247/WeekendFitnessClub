package groupFitnessLesson;

import java.util.HashMap;
import java.util.Scanner;

public class FitnessLesson {

    private static FitnessLesson instance;


    public static synchronized FitnessLesson getInstance() {
        if (instance == null) {
            instance = new FitnessLesson();
        }
        return instance;
    }

    Scanner ftScanner = new Scanner(System.in);



    public FitnessLesson() {
        // Yoga
        this.yoga7thJan = new HashMap<>();
        this.yoga14thJan = new HashMap<>();
        this.yoga21stJan = new HashMap<>();
        this.yoga28thJan = new HashMap<>();
        this.yoga4thFeb = new HashMap<>();
        this.yoga11thFeb = new HashMap<>();
        this.yoga18thFeb = new HashMap<>();
        this.yoga25thFeb = new HashMap<>();

        // Spin
        this.Spin7thJan = new HashMap<>();
        this.Spin14thJan = new HashMap<>();
        this.Spin21stJan = new HashMap<>();
        this.Spin28thJan = new HashMap<>();
        this.Spin4thFeb = new HashMap<>();
        this.Spin11thFeb = new HashMap<>();
        this.Spin18thFeb = new HashMap<>();
        this.Spin25thFeb = new HashMap<>();

        // Aquacise
        this.Aquacise8thJan = new HashMap<>();
        this.Aquacise15thJan = new HashMap<>();
        this.Aquacise22ndJan = new HashMap<>();
        this.Aquacise29thJan = new HashMap<>();
        this.Aquacise5thFeb = new HashMap<>();
        this.Aquacise12thFeb = new HashMap<>();
        this.Aquacise19thFeb = new HashMap<>();
        this.Aquacise26thFeb = new HashMap<>();

        // Zumba
        this.zumba8thJan = new HashMap<>();
        this.zumba15thJan = new HashMap<>();
        this.zumba22ndJan = new HashMap<>();
        this.zumba29thJan = new HashMap<>();
        this.zumba5thFeb = new HashMap<>();
        this.zumba12thFeb = new HashMap<>();
        this.zumba19thFeb = new HashMap<>();
        this.zumba26thFeb = new HashMap<>();
    }


    // Yoga Lesson Data
    private HashMap<String, String> yoga7thJan;
    public void addYoga7thJ(String lastName, String lesson) {

        if (yoga7thJan.size() < 5 ) {
            if (yoga7thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga7thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be rquired for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga7thJan.keySet()) {
                    //System.out.println("Key: " + i + ", Value: " + yoga7thJan.get(i));
                //}
            }
        }
        else if (yoga7thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga7thJ(String lastName , String lesson) {

        if (yoga7thJan.containsKey(lastName)) {
            yoga7thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga7thJ(String lastName, String lesson) {
        if (yoga7thJan.containsKey(lastName)) {
            yoga7thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga7thJ(String lastName , String lesson){
        if (yoga7thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                               " PRESS 1: To review or rate \n" +
                               " PRESS 2: For Main Menu \n" +
                               " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
            // Method to menu
        }
    }
    public void rateYoga7thJ(String lastName){
        if (yoga7thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                                   "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
                System.out.println("Record not found, You can not rate this lesson ");
                // call for main method
            }
        }
    public void reviewYoga7thJ(String lastName) {
        if (yoga7thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga7thJan(){
        int NoOfCustomer = yoga7thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga7thJan(){
        int NoOfCustomer = yoga7thJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                "   PRICE OF LESSON: " + price +
                "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> yoga14thJan;

    public void addYoga14thJ(String lastName, String lesson) {

        if (yoga14thJan.size() < 5 ) {
            if (yoga14thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga14thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga14thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga14thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga14thJ(String lastName , String lesson) {

        if (yoga14thJan.containsKey(lastName)) {
            yoga14thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga14thJ(String lastName, String lesson) {
        if (yoga14thJan.containsKey(lastName)) {
            yoga14thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga14thJ(String lastName , String lesson){
        if (yoga14thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
            // Method to menu
        }
    }
    public void rateYoga14thJ(String lastName){
        if (yoga14thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga14thJ(String lastName) {
        if (yoga14thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga14thJan(){
        int NoOfCustomer = yoga14thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga14thJan(){
        int NoOfCustomer = yoga14thJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "                    LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> yoga21stJan;

    public void addYoga21J(String lastName, String lesson) {

        if (yoga21stJan.size() < 5 ) {
            if (yoga21stJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga21stJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga14thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga21stJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga21J(String lastName , String lesson) {

        if (yoga21stJan.containsKey(lastName)) {
            yoga21stJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga21J(String lastName, String lesson) {
        if (yoga21stJan.containsKey(lastName)) {
            yoga21stJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga21J(String lastName , String lesson){
        if (yoga21stJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga21J(String lastName){
        if (yoga21stJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga21J(String lastName) {
        if (yoga21stJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga21J(){
        int NoOfCustomer = yoga21stJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga21J(){
        int NoOfCustomer = yoga21stJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "                    LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> yoga28thJan;

    public void addYoga28J(String lastName, String lesson) {

        if (yoga28thJan.size() < 5 ) {
            if (yoga28thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga28thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga28thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga28thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga28J(String lastName , String lesson) {

        if (yoga28thJan.containsKey(lastName)) {
            yoga28thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga28J(String lastName, String lesson) {
        if (yoga28thJan.containsKey(lastName)) {
            yoga28thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga28J(String lastName , String lesson){
        if (yoga28thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga28J(String lastName){
        if (yoga28thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga28J(String lastName) {
        if (yoga28thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga28J(){
        int NoOfCustomer = yoga28thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga28J(){
        int NoOfCustomer = yoga28thJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }




    private HashMap<String, String> yoga4thFeb;
    public void addYoga4F(String lastName, String lesson) {

        if (yoga4thFeb.size() < 5 ) {
            if (yoga4thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga4thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga4thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga4thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga4F(String lastName , String lesson) {

        if (yoga4thFeb.containsKey(lastName)) {
            yoga4thFeb.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga4F(String lastName, String lesson) {
        if (yoga4thFeb.containsKey(lastName)) {
            yoga4thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga4F(String lastName , String lesson){
        if (yoga4thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga4F(String lastName){
        if (yoga4thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga4F(String lastName) {
        if (yoga4thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga4F(){
        int NoOfCustomer = yoga4thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga4F(){
        int NoOfCustomer = yoga4thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }




    private HashMap<String, String> yoga11thFeb;

    public void addYoga11F(String lastName, String lesson) {

        if (yoga11thFeb.size() < 5 ) {
            if (yoga11thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga11thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga11thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga11thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga11F(String lastName , String lesson) {

        if (yoga11thFeb.containsKey(lastName)) {
            yoga11thFeb.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga11F(String lastName, String lesson) {
        if (yoga11thFeb.containsKey(lastName)) {
            yoga11thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga11F(String lastName , String lesson){
        if (yoga11thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga11F(String lastName){
        if (yoga11thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga11F(String lastName) {
        if (yoga11thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga11F(){
        int NoOfCustomer = yoga11thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga11F(){
        int NoOfCustomer = yoga11thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> yoga18thFeb;

    public void addYoga18F(String lastName, String lesson) {

        if (yoga18thFeb.size() < 5 ) {
            if (yoga18thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga18thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga18thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga18thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga18F(String lastName , String lesson) {

        if (yoga18thFeb.containsKey(lastName)) {
            yoga18thFeb.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga18F(String lastName, String lesson) {
        if (yoga18thFeb.containsKey(lastName)) {
            yoga18thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga18F(String lastName , String lesson){
        if (yoga18thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga18F(String lastName){
        if (yoga18thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga18F(String lastName) {
        if (yoga18thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga18F(){
        int NoOfCustomer = yoga18thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga18F(){
        int NoOfCustomer = yoga18thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }




    private HashMap<String, String> yoga25thFeb;

    public void addYoga25F(String lastName, String lesson) {

        if (yoga25thFeb.size() < 5 ) {
            if (yoga25thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga25thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : yoga25thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (yoga25thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeYoga25F(String lastName , String lesson) {

        if (yoga25thFeb.containsKey(lastName)) {
            yoga25thFeb.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelYoga25F(String lastName, String lesson) {
        if (yoga25thFeb.containsKey(lastName)) {
            yoga25thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendYoga25F(String lastName , String lesson){
        if (yoga25thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga25F(String lastName){
        if (yoga25thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewYoga25F(String lastName) {
        if (yoga25thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga25F(){
        int NoOfCustomer = yoga25thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga25F(){
        int NoOfCustomer = yoga25thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }




    // Spin Lesson Data
    private HashMap<String, String> Spin7thJan;

    public void addSpin7J(String lastName, String lesson) {

        if (Spin7thJan.size() < 5 ) {
            if (Spin7thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin7thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin7thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin7thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin7J(String lastName , String lesson) {

        if (Spin7thJan.containsKey(lastName)) {
            Spin7thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin7J(String lastName, String lesson) {
        if (Spin7thJan.containsKey(lastName)) {
            Spin7thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin7J(String lastName , String lesson){
        if (Spin7thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin7J(String lastName){
        if (Spin7thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin7J(String lastName) {
        if (Spin7thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin7J(){
        int NoOfCustomer = Spin7thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin7J(){
        int NoOfCustomer = Spin7thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }




    private HashMap<String, String> Spin14thJan;

    public void addSpin14J(String lastName, String lesson) {

        if (Spin14thJan.size() < 5 ) {
            if (Spin14thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin14thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin14thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin14thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin14J(String lastName , String lesson) {

        if (Spin14thJan.containsKey(lastName)) {
            Spin14thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin14J(String lastName, String lesson) {
        if (Spin14thJan.containsKey(lastName)) {
            Spin14thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin14J(String lastName , String lesson){
        if (Spin14thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin14J(String lastName){
        if (Spin14thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin14J(String lastName) {
        if (Spin14thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin14J(){
        int NoOfCustomer = Spin14thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin14J(){
        int NoOfCustomer = Spin14thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> Spin21stJan;

    public void addSpin21J(String lastName, String lesson) {

        if (Spin21stJan.size() < 5 ) {
            if (Spin21stJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin21stJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin21stJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin21stJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin21J(String lastName , String lesson) {

        if (Spin21stJan.containsKey(lastName)) {
            Spin21stJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin21J(String lastName, String lesson) {
        if (Spin21stJan.containsKey(lastName)) {
            Spin21stJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin21J(String lastName , String lesson){
        if (Spin21stJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin21J(String lastName){
        if (Spin21stJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin21J(String lastName) {
        if (Spin21stJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin21J(){
        int NoOfCustomer = Spin21stJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin21J(){
        int NoOfCustomer = Spin21stJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }






    private HashMap<String, String> Spin28thJan;
    public void addSpin28J(String lastName, String lesson) {

        if (Spin28thJan.size() < 5 ) {
            if (Spin28thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin28thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin28thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin28thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin28J(String lastName , String lesson) {

        if (Spin28thJan.containsKey(lastName)) {
            Spin28thJan.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin28J(String lastName, String lesson) {
        if (Spin28thJan.containsKey(lastName)) {
            Spin28thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin28J(String lastName , String lesson){
        if (Spin28thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin28J(String lastName){
        if (Spin28thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin28J(String lastName) {
        if (Spin28thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin28J(){
        int NoOfCustomer = Spin28thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin28J(){
        int NoOfCustomer = Spin28thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }







    private HashMap<String, String> Spin4thFeb;

    public void addSpin4F(String lastName, String lesson) {

        if (Spin4thFeb.size() < 5 ) {
            if (Spin4thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin4thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin4thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin4thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin4F(String lastName , String lesson) {

        if (Spin4thFeb.containsKey(lastName)) {
            Spin4thFeb.remove(lastName);
            System.out.println("Record found, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin4F(String lastName, String lesson) {
        if (Spin4thFeb.containsKey(lastName)) {
            Spin4thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin4F(String lastName , String lesson){
        if (Spin4thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin4F(String lastName){
        if (Spin4thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin4F(String lastName) {
        if (Spin4thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin4F(){
        int NoOfCustomer = Spin4thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin4F(){
        int NoOfCustomer = Spin4thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> Spin11thFeb;

    public void addSpin11F(String lastName, String lesson) {

        if (Spin11thFeb.size() < 5 ) {
            if (Spin11thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin11thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin4thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin11thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin11F(String lastName , String lesson) {

        if (Spin11thFeb.containsKey(lastName)) {
            Spin11thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin11F(String lastName, String lesson) {
        if (Spin11thFeb.containsKey(lastName)) {
            Spin11thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin11F(String lastName , String lesson){
        if (Spin11thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin11F(String lastName){
        if (Spin11thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin11F(String lastName) {
        if (Spin11thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin11F(){
        int NoOfCustomer = Spin11thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin11F(){
        int NoOfCustomer = Spin11thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> Spin18thFeb;

    public void addSpin18F(String lastName, String lesson) {

        if (Spin18thFeb.size() < 5 ) {
            if (Spin18thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin18thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin18thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin18thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin18F(String lastName , String lesson) {

        if (Spin18thFeb.containsKey(lastName)) {
            Spin18thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin18F(String lastName, String lesson) {
        if (Spin18thFeb.containsKey(lastName)) {
            Spin18thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin18F(String lastName , String lesson){
        if (Spin18thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin18F(String lastName){
        if (Spin18thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin18F(String lastName) {
        if (Spin18thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin18F(){
        int NoOfCustomer = Spin18thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin18F(){
        int NoOfCustomer = Spin18thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> Spin25thFeb;

    public void addSpin25F(String lastName, String lesson) {

        if (Spin25thFeb.size() < 5 ) {
            if (Spin25thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin25thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Spin25thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Spin25thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeSpin25F(String lastName , String lesson) {

        if (Spin25thFeb.containsKey(lastName)) {
            Spin25thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelSpin25F(String lastName, String lesson) {
        if (Spin25thFeb.containsKey(lastName)) {
            Spin25thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendSpin25F(String lastName , String lesson){
        if (Spin25thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin25F(String lastName){
        if (Spin25thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewSpin25F(String lastName) {
        if (Spin25thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin25F(){
        int NoOfCustomer = Spin25thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin25F(){
        int NoOfCustomer = Spin25thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "T      OTAL INCOME: " + totalIncome + "\n");
    }


    // Aquacise Data   (8th Jan          15 Jan          22 Jan          29 Jan )
    private HashMap<String, String> Aquacise8thJan;

    public void addAquacise8J(String lastName, String lesson) {

        if (Aquacise8thJan.size() < 5 ) {
            if (Aquacise8thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise8thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise8thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise8thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise8J(String lastName , String lesson) {

        if (Aquacise8thJan.containsKey(lastName)) {
            Aquacise8thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise8J(String lastName, String lesson) {
        if (Aquacise8thJan.containsKey(lastName)) {
            Aquacise8thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise8J(String lastName , String lesson){
        if (Aquacise8thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise8J(String lastName){
        if (Aquacise8thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise8J(String lastName) {
        if (Aquacise8thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise8J(){
        int NoOfCustomer = Aquacise8thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise8J(){
        int NoOfCustomer = Aquacise8thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> Aquacise15thJan;

    public void addAquacise15J(String lastName, String lesson) {

        if (Aquacise15thJan.size() < 5 ) {
            if (Aquacise15thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise15thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise15thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise15thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise15J(String lastName , String lesson) {

        if (Aquacise15thJan.containsKey(lastName)) {
            Aquacise15thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise15J(String lastName, String lesson) {
        if (Aquacise15thJan.containsKey(lastName)) {
            Aquacise15thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise15J(String lastName , String lesson){
        if (Aquacise15thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise15J(String lastName){
        if (Aquacise15thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise15J(String lastName) {
        if (Aquacise15thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise15J(){
        int NoOfCustomer = Aquacise15thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise15J(){
        int NoOfCustomer = Aquacise15thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }






    private HashMap<String, String> Aquacise22ndJan;

    public void addAquacise22J(String lastName, String lesson) {

        if (Aquacise22ndJan.size() < 5 ) {
            if (Aquacise22ndJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise22ndJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise22ndJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise22ndJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise22J(String lastName , String lesson) {

        if (Aquacise22ndJan.containsKey(lastName)) {
            Aquacise22ndJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise22J(String lastName, String lesson) {
        if (Aquacise22ndJan.containsKey(lastName)) {
            Aquacise22ndJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise22J(String lastName , String lesson){
        if (Aquacise22ndJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise22J(String lastName){
        if (Aquacise22ndJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise22J(String lastName) {
        if (Aquacise22ndJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise22J(){
        int NoOfCustomer = Aquacise22ndJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise22J(){
        int NoOfCustomer = Aquacise22ndJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> Aquacise29thJan;

    public void addAquacise29J(String lastName, String lesson) {

        if (Aquacise29thJan.size() < 5 ) {
            if (Aquacise29thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise29thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise29thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise29thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise29J(String lastName , String lesson) {

        if (Aquacise29thJan.containsKey(lastName)) {
            Aquacise29thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise29J(String lastName, String lesson) {
        if (Aquacise29thJan.containsKey(lastName)) {
            Aquacise29thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise29J(String lastName , String lesson){
        if (Aquacise29thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise29J(String lastName){
        if (Aquacise29thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise29J(String lastName) {
        if (Aquacise29thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise29J(){
        int NoOfCustomer = Aquacise29thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise29J(){
        int NoOfCustomer = Aquacise29thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    // Aquacise Data   (5 Feb            12 Feb          19 Jan          26 Feb )
    private HashMap<String, String> Aquacise5thFeb;

    public void addAquacise5F(String lastName, String lesson) {

        if (Aquacise5thFeb.size() < 5 ) {
            if (Aquacise5thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise5thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise29thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise5thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise5F(String lastName , String lesson) {

        if (Aquacise5thFeb.containsKey(lastName)) {
            Aquacise5thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise5F(String lastName, String lesson) {
        if (Aquacise5thFeb.containsKey(lastName)) {
            Aquacise5thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise5F(String lastName , String lesson){
        if (Aquacise5thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise5F(String lastName){
        if (Aquacise5thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise5F(String lastName) {
        if (Aquacise5thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise5F(){
        int NoOfCustomer = Aquacise5thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise5F(){
        int NoOfCustomer = Aquacise5thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    private HashMap<String, String> Aquacise12thFeb;

    public void addAquacise12F(String lastName, String lesson) {

        if (Aquacise12thFeb.size() < 5 ) {
            if (Aquacise12thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise12thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise12thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise12thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise12F(String lastName , String lesson) {

        if (Aquacise12thFeb.containsKey(lastName)) {
            Aquacise12thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise12F(String lastName, String lesson) {
        if (Aquacise12thFeb.containsKey(lastName)) {
            Aquacise12thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise12F(String lastName , String lesson){
        if (Aquacise12thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise12F(String lastName){
        if (Aquacise12thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise12F(String lastName) {
        if (Aquacise12thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise12F(){
        int NoOfCustomer = Aquacise12thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise12F(){
        int NoOfCustomer = Aquacise12thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> Aquacise19thFeb;

    public void addAquacise19F(String lastName, String lesson) {

        if (Aquacise19thFeb.size() < 5 ) {
            if (Aquacise19thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise19thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise19thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise19thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise19F(String lastName , String lesson) {

        if (Aquacise19thFeb.containsKey(lastName)) {
            Aquacise19thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise19F(String lastName, String lesson) {
        if (Aquacise19thFeb.containsKey(lastName)) {
            Aquacise19thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise19F(String lastName , String lesson){
        if (Aquacise19thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise19F(String lastName){
        if (Aquacise19thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise19F(String lastName) {
        if (Aquacise19thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise19F(){
        int NoOfCustomer = Aquacise19thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise19F(){
        int NoOfCustomer = Aquacise19thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> Aquacise26thFeb;

    public void addAquacise26F(String lastName, String lesson) {

        if (Aquacise26thFeb.size() < 5 ) {
            if (Aquacise26thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Aquacise26thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise26thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (Aquacise26thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeAquacise26F(String lastName , String lesson) {

        if (Aquacise26thFeb.containsKey(lastName)) {
            Aquacise26thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelAquacise26F(String lastName, String lesson) {
        if (Aquacise26thFeb.containsKey(lastName)) {
            Aquacise26thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendAquacise26F(String lastName , String lesson){
        if (Aquacise26thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise26F(String lastName){
        if (Aquacise26thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewAquacise26F(String lastName) {
        if (Aquacise26thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise26F(){
        int NoOfCustomer = Aquacise26thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise26F(){
        int NoOfCustomer = Aquacise26thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    // Zumba (8th Jan          15 Jan          22 Jan          29 Jan )
    private HashMap<String, String> zumba8thJan;


    public void addZumba8J(String lastName, String lesson) {

        if (zumba8thJan.size() < 5 ) {
            if (zumba8thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba8thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba8thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba8thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba8J(String lastName , String lesson) {

        if (zumba8thJan.containsKey(lastName)) {
            zumba8thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba8J(String lastName, String lesson) {
        if (zumba8thJan.containsKey(lastName)) {
            zumba8thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba8J(String lastName , String lesson){
        if (zumba8thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba8J(String lastName){
        if (zumba8thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba8J(String lastName) {
        if (zumba8thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba8J(){
        int NoOfCustomer = zumba8thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba8J(){
        int NoOfCustomer = zumba8thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> zumba15thJan;

    public void addZumba15J(String lastName, String lesson) {

        if (zumba15thJan.size() < 5 ) {
            if (zumba15thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba15thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba15thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba15thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba15J(String lastName , String lesson) {

        if (zumba15thJan.containsKey(lastName)) {
            zumba15thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba15J(String lastName, String lesson) {
        if (zumba15thJan.containsKey(lastName)) {
            zumba15thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba15J(String lastName , String lesson){
        if (zumba15thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba15J(String lastName){
        if (zumba15thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba15J(String lastName) {
        if (zumba15thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba15J(){
        int NoOfCustomer = zumba15thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba15J(){
        int NoOfCustomer = zumba15thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> zumba22ndJan;

    public void addZumba22J(String lastName, String lesson) {

        if (zumba22ndJan.size() < 5 ) {
            if (zumba22ndJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba22ndJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba22ndJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba22ndJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba22J(String lastName , String lesson) {

        if (zumba22ndJan.containsKey(lastName)) {
            zumba22ndJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba22J(String lastName, String lesson) {
        if (zumba22ndJan.containsKey(lastName)) {
            zumba22ndJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba22J(String lastName , String lesson){
        if (zumba22ndJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba22J(String lastName){
        if (zumba22ndJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba22J(String lastName) {
        if (zumba22ndJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba22J(){
        int NoOfCustomer = zumba22ndJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba22J(){
        int NoOfCustomer = zumba22ndJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> zumba29thJan;

    public void addZumba29J(String lastName, String lesson) {

        if (zumba29thJan.size() < 5 ) {
            if (zumba29thJan.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba29thJan.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba29thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba29thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba29J(String lastName , String lesson) {

        if (zumba29thJan.containsKey(lastName)) {
            zumba29thJan.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba29J(String lastName, String lesson) {
        if (zumba29thJan.containsKey(lastName)) {
            zumba29thJan.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba29J(String lastName , String lesson){
        if (zumba29thJan.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba29J(String lastName){
        if (zumba29thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba29J(String lastName) {
        if (zumba29thJan.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba29J(){
        int NoOfCustomer = zumba29thJan.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba29J(){
        int NoOfCustomer = zumba29thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }


    // Zumba (5 Feb            12 Feb          19 Jan          26 Feb )

    private HashMap<String, String> zumba5thFeb;

    public void addZumba5F(String lastName, String lesson) {

        if (zumba5thFeb.size() < 5 ) {
            if (zumba5thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba5thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba5thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba5thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba5F(String lastName , String lesson) {

        if (zumba5thFeb.containsKey(lastName)) {
            zumba5thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba5F(String lastName, String lesson) {
        if (zumba5thFeb.containsKey(lastName)) {
            zumba5thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba5F(String lastName , String lesson){
        if (zumba5thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba5F(String lastName){
        if (zumba5thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba5F(String lastName) {
        if (zumba5thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba5F(){
        int NoOfCustomer = zumba5thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba5F(){
        int NoOfCustomer = zumba5thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> zumba12thFeb;

    public void addZumba12F(String lastName, String lesson) {

        if (zumba12thFeb.size() < 5 ) {
            if (zumba12thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba12thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : Aquacise26thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba12thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba12F(String lastName , String lesson) {

        if (zumba12thFeb.containsKey(lastName)) {
            zumba12thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba12F(String lastName, String lesson) {
        if (zumba12thFeb.containsKey(lastName)) {
            zumba12thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba12F(String lastName , String lesson){
        if (zumba12thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba12F(String lastName){
        if (zumba12thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba12F(String lastName) {
        if (zumba12thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba12F(){
        int NoOfCustomer = zumba12thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba12F(){
        int NoOfCustomer = zumba12thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }

    private HashMap<String, String> zumba19thFeb;

    public void addZumba19F(String lastName, String lesson) {

        if (zumba19thFeb.size() < 5 ) {
            if (zumba19thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba19thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba19thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba19thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba19F(String lastName , String lesson) {

        if (zumba19thFeb.containsKey(lastName)) {
            zumba19thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba19F(String lastName, String lesson) {
        if (zumba19thFeb.containsKey(lastName)) {
            zumba19thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba19F(String lastName , String lesson){
        if (zumba19thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba19F(String lastName){
        if (zumba19thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba19F(String lastName) {
        if (zumba19thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba19F(){
        int NoOfCustomer = zumba19thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba19F(){
        int NoOfCustomer = zumba19thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }
    private HashMap<String, String> zumba26thFeb;

    public void addZumba26F(String lastName, String lesson) {

        if (zumba26thFeb.size() < 5 ) {
            if (zumba26thFeb.containsKey(lastName)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                zumba26thFeb.put( lastName , lesson);
                System.out.println("Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
                System.out.println("Lesson Status: Lesson Booked \n");
                System.out.println("Please always keep your lesson details, It may be required for  \n" +
                        "other activities on the portal \n");

                // Remove the comment to confirm all session are booked
                //for (String i : zumba26thFeb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga14thJan.get(i));
                //}
            }
        }
        else if (zumba26thFeb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }
    public void changeZumba26F(String lastName , String lesson) {

        if (zumba26thFeb.containsKey(lastName)) {
            zumba26thFeb.remove(lastName);
            System.out.println("Record found and removed, Please proceed:  \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void cancelZumba26F(String lastName, String lesson) {
        if (zumba26thFeb.containsKey(lastName)) {
            zumba26thFeb.remove(lastName);
            System.out.println("Record found, and Successfully cancelled  \n");
            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

        } else {
            System.out.println("You do not have a booked session, See other Options::: ");
        }
    }
    public void attendZumba26F(String lastName , String lesson){
        if (zumba26thFeb.containsKey(lastName)) {
            System.out.println(" Thank you for attending your lesson");

            System.out.println("Lesson Details: \n Booking ID: " + lastName + "  Session Booked: " + lesson + "\n");
            System.out.println("Lesson Status: Attended \n");

            // It can call a method for rate and review
            System.out.println("We will like to here from you,Please leave a review or rate our program: \n" +
                    " PRESS 1: To review or rate \n" +
                    " PRESS 2: For Main Menu \n" +
                    " PRESS 3: To Quit \n");

            int inR = ftScanner.nextInt();
            if(inR == 1 ) {
                // Method to rev and rating
            }
            else if (inR == 2 ) {
                // Method to main menu
            }
            else if (inR == 3 ) {
                // Method to quit
            }
            else {
                System.out.println("Invalid Input, You will be redirected for other option");

            }

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba26F(String lastName){
        if (zumba26thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please select rating below review" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                System.out.println("Customer is Very Satisfied" +
                        "\n We hope to serve you better");
            } else {
                System.out.println("Invalid Selection");
                // Call method to main menu
            }
        }

        else {
            System.out.println("Record not found, You can not rate this lesson ");
            // call for main method
        }
    }
    public void reviewZumba26F(String lastName) {
        if (zumba26thFeb.containsKey(lastName)) {
            System.out.println("Record found for (Lesson Details), Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba26F(){
        int NoOfCustomer = zumba26thFeb.size();
        String avRating = "Null";
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 7TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba26F(){
        int NoOfCustomer = zumba26thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:7TH        SESSION:MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }
}






