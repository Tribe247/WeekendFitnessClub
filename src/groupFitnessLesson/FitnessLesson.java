package groupFitnessLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FitnessLesson {


    AlternateOptions alt = new AlternateOptions();

    ///RateReview rr = new RateReview();

    private static FitnessLesson instance;



    public static synchronized FitnessLesson getInstance() {
        if (instance == null) {
            instance = new FitnessLesson();
        }
        return instance;
    }

    // Declaring List for rating
    ArrayList<Integer> rateYoga7J;
    ArrayList<Integer> rateYoga14J;
    ArrayList<Integer> rateYoga21J;
    ArrayList<Integer> rateYoga28J;
    ArrayList<Integer> rateYoga4F;
    ArrayList<Integer> rateYoga11F;
    ArrayList<Integer> rateYoga18F;
    ArrayList<Integer> rateYoga25F;

    // Spin
    ArrayList<Integer> rateSpin7J;
    ArrayList<Integer> rateSpin14J;
    ArrayList<Integer> rateSpin21J;
    ArrayList<Integer> rateSpin28J;
    ArrayList<Integer> rateSpin4F;
    ArrayList<Integer> rateSpin11F;
    ArrayList<Integer> rateSpin18F;
    ArrayList<Integer> rateSpin25F;

    // Aquacise
    ArrayList<Integer> rateAqua8J;
    ArrayList<Integer> rateAqua15J;
    ArrayList<Integer> rateAqua22J;
    ArrayList<Integer> rateAqua29J;
    ArrayList<Integer> rateAqua5F;
    ArrayList<Integer> rateAqua12F;
    ArrayList<Integer> rateAqua19F;
    ArrayList<Integer> rateAqua26F;

    // Zumba
    ArrayList<Integer> rateZumb8J;
    ArrayList<Integer> rateZumb15J;
    ArrayList<Integer> rateZumb22J;
    ArrayList<Integer> rateZumb29J;
    ArrayList<Integer> rateZumb5F;
    ArrayList<Integer> rateZumb12F;
    ArrayList<Integer> rateZumb19F;
    ArrayList<Integer> rateZumb26F;





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


        //Assigning to rating
        // Yoga Rating
        rateYoga7J = new ArrayList<>();
        rateYoga14J = new ArrayList<>();
        rateYoga21J = new ArrayList<>();
        rateYoga28J = new ArrayList<>();
        rateYoga4F = new ArrayList<>();
        rateYoga11F = new ArrayList<>();
        rateYoga18F = new ArrayList<>();
        rateYoga25F = new ArrayList<>();

        //Spin Rating
        rateSpin7J = new ArrayList<>();
        rateSpin14J = new ArrayList<>();
        rateSpin21J = new ArrayList<>();
        rateSpin28J = new ArrayList<>();
        rateSpin4F = new ArrayList<>();
        rateSpin11F = new ArrayList<>();
        rateSpin18F = new ArrayList<>();
        rateSpin25F = new ArrayList<>();

        // Rate Aqua
        rateAqua8J = new ArrayList<>();
        rateAqua15J = new ArrayList<>();
        rateAqua22J = new ArrayList<>();
        rateAqua29J = new ArrayList<>();
        rateAqua5F = new ArrayList<>();
        rateAqua12F = new ArrayList<>();
        rateAqua19F = new ArrayList<>();
        rateAqua26F = new ArrayList<>();

        // Rate Zumba
        rateZumb8J = new ArrayList<>();
        rateZumb15J = new ArrayList<>();
        rateZumb22J = new ArrayList<>();
        rateZumb29J = new ArrayList<>();
        rateZumb5F = new ArrayList<>();
        rateZumb12F = new ArrayList<>();
        rateZumb19F = new ArrayList<>();
        rateZumb26F = new ArrayList<>();


    }

    // Overall Method for rating calculation
    public double CalculateAveRating(ArrayList<Integer> averageList) {
        double sum = 0;
        for (int average : averageList) {
            sum += average;
        }
        double average = sum / averageList.size();
        return average;
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

        } else {
            System.out.println("You do not have a booked lesson, What else will you like to do? \n");
            // Method to menu
        }
    }
    public void rateYoga7thJ(String lastName){
        if (yoga7thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga7J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                                   "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga7J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga7J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga7J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga7J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga7thJan(){
        int NoOfCustomer = yoga7thJan.size();
        double avRating = this.CalculateAveRating(this.rateYoga7J);
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
            // Method to menu
        }
    }
    public void rateYoga14thJ(String lastName){
        if (yoga14thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga14J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga14J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga14J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga14J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga14J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                     "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga14thJan(){
        int NoOfCustomer = yoga14thJan.size();
        double avRating = this.CalculateAveRating(this.rateYoga14J);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 14TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga14thJan(){
        int NoOfCustomer = yoga14thJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "                    LESSON: YOGA           DATE:14TH        SESSION:MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga21J(String lastName){
        if (yoga21stJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga21J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga21J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga21J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga21J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga21J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga21J(){
        int NoOfCustomer = yoga21stJan.size();
        double avRating = this.CalculateAveRating(this.rateYoga21J);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 21TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga21J(){
        int NoOfCustomer = yoga21stJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "                    LESSON: YOGA           DATE:21TH        SESSION:MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga28J(String lastName){
        if (yoga28thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga28J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga28J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga28J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga28J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga28J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga28J(){
        int NoOfCustomer = yoga28thJan.size();
        double avRating = this.CalculateAveRating(this.rateYoga28J);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 28TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga28J(){
        int NoOfCustomer = yoga28thJan.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:28TH        SESSION:MORNING \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga4F(String lastName){
        if (yoga4thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga4F = new ArrayList<>();
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga4F = new ArrayList<>();
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga4F = new ArrayList<>();
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga4F = new ArrayList<>();
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga4F = new ArrayList<>();
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga4F(){
        int NoOfCustomer = yoga4thFeb.size();
        double avRating = this.CalculateAveRating(this.rateYoga4F);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 4TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga4F(){
        int NoOfCustomer = yoga4thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:4TH        SESSION:MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga11F(String lastName){
        if (yoga11thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga11F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga11F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga11F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga11F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga11F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga11F(){
        int NoOfCustomer = yoga11thFeb.size();
        double avRating = this.CalculateAveRating(this.rateYoga11F);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 11TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga11F(){
        int NoOfCustomer = yoga11thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:11TH        SESSION:MORNING \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga18F(String lastName){
        if (yoga18thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga18F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga18F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga18F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga18F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga18F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga18F(){
        int NoOfCustomer = yoga18thFeb.size();
        double avRating = this.CalculateAveRating(this.rateYoga18F);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 18TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga18F(){
        int NoOfCustomer = yoga18thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:18TH        SESSION:MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateYoga25F(String lastName){
        if (yoga25thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga25F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga25F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga25F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga25F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga25F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportYoga25F(){
        int NoOfCustomer = yoga25thFeb.size();
        double avRating = this.CalculateAveRating(this.rateYoga25F);
        System.out.println(
                "       LESSON TYPE: YOGA                 DATE: 25TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportYoga25F(){
        int NoOfCustomer = yoga25thFeb.size();
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: YOGA           DATE:25TH        SESSION:MORNING \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin7J(String lastName){
        if (Spin7thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin7J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin7J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin7J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin7J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin7J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin7J(){
        int NoOfCustomer = Spin7thJan.size();
        double avRating = this.CalculateAveRating(this.rateSpin7J);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 7TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin7J(){
        int NoOfCustomer = Spin7thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE:7TH        SESSION:EVENING \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin14J(String lastName){
        if (Spin14thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin14J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin14J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin14J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin14J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin14J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin14J(){
        int NoOfCustomer = Spin14thJan.size();
        double avRating = this.CalculateAveRating(this.rateSpin14J);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 14TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin14J(){
        int NoOfCustomer = Spin14thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE:14TH        SESSION:EVENING  \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin21J(String lastName){
        if (Spin21stJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin21J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin21J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin21J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin21J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin21J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin21J(){
        int NoOfCustomer = Spin21stJan.size();
        double avRating = this.CalculateAveRating(this.rateSpin21J);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 21TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin21J(){
        int NoOfCustomer = Spin21stJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE:21TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin28J(String lastName){
        if (Spin28thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin28J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin28J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin28J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin28J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin28J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin28J(){
        int NoOfCustomer = Spin28thJan.size();
        double avRating = this.CalculateAveRating(this.rateSpin28J);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 28TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin28J(){
        int NoOfCustomer = Spin28thJan.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE: 28TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin4F(String lastName){
        if (Spin4thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateYoga4F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateYoga4F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateYoga4F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateYoga4F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateYoga4F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin4F(){
        int NoOfCustomer = Spin4thFeb.size();
        double avRating = this.CalculateAveRating(this.rateSpin4F);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 4F           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin4F(){
        int NoOfCustomer = Spin4thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE: 4TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin11F(String lastName){
        if (Spin11thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin11F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin11F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin11F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin11F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin11F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin11F(){
        int NoOfCustomer = Spin11thFeb.size();
        double avRating = this.CalculateAveRating(this.rateSpin11F);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 11TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin11F(){
        int NoOfCustomer = Spin11thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "                    LESSON: SPIN           DATE:11TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin18F(String lastName){
        if (Spin18thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin18F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin18F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin18F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin18F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin18F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin18F(){
        int NoOfCustomer = Spin18thFeb.size();
        double avRating = this.CalculateAveRating(this.rateSpin18F);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 18TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin18F(){
        int NoOfCustomer = Spin18thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE: 18TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateSpin25F(String lastName){
        if (Spin25thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateSpin25F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateSpin25F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateSpin25F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateSpin25F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateSpin25F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportSpin25F(){
        int NoOfCustomer = Spin25thFeb.size();
        double avRating = this.CalculateAveRating(this.rateSpin25F);
        System.out.println(
                "       LESSON TYPE: SPIN                 DATE: 25TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportSpin25F(){
        int NoOfCustomer = Spin25thFeb.size();
        double price = 25.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: SPIN           DATE:25TH        SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise8J(String lastName){
        if (Aquacise8thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua8J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua8J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua8J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua8J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua8J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise8J(){
        int NoOfCustomer = Aquacise8thJan.size();
        double avRating = this.CalculateAveRating(this.rateAqua8J);
        System.out.println(
                "       LESSON TYPE: AQUACISE                 DATE: 8TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise8J(){
        int NoOfCustomer = Aquacise8thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:8TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise15J(String lastName){
        if (Aquacise15thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua15J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua15J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua15J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua15J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua15J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise15J(){
        int NoOfCustomer = Aquacise15thJan.size();
        double avRating = this.CalculateAveRating(this.rateAqua15J);
        System.out.println(
                "       LESSON TYPE: AQUACISE                 DATE: 15TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise15J(){
        int NoOfCustomer = Aquacise15thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:15TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise22J(String lastName){
        if (Aquacise22ndJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua22J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua22J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua22J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua22J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua22J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise22J(){
        int NoOfCustomer = Aquacise22ndJan.size();
        double avRating = this.CalculateAveRating(this.rateAqua22J);
        System.out.println(
                "       LESSON TYPE: AQUACISE                 DATE: 22TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise22J(){
        int NoOfCustomer = Aquacise22ndJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:22TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise29J(String lastName){
        if (Aquacise29thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua29J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua29J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua29J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua29J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua29J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise29J(){
        int NoOfCustomer = Aquacise29thJan.size();
        double avRating = this.CalculateAveRating(this.rateAqua29J);
        System.out.println(
                "       LESSON TYPE: AQUACISE                 DATE: 29TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise29J(){
        int NoOfCustomer = Aquacise29thJan.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE: 29TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise5F(String lastName){
        if (Aquacise5thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua5F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua5F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua5F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua5F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua5F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise5F(){
        int NoOfCustomer = Aquacise5thFeb.size();
        double avRating = this.CalculateAveRating(this.rateAqua5F);
        System.out.println(
                "       LESSON TYPE: AQUACISE             DATE: 5TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise5F(){
        int NoOfCustomer = Aquacise5thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:5TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise12F(String lastName){
        if (Aquacise12thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua12F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua12F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua12F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua12F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua12F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise12F(){
        int NoOfCustomer = Aquacise12thFeb.size();
        double avRating = this.CalculateAveRating(this.rateAqua12F);
        System.out.println(
                "       LESSON TYPE: AQUACISE              DATE: 12TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise12F(){
        int NoOfCustomer = Aquacise12thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:12TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise19F(String lastName){
        if (Aquacise19thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua19F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua19F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua19F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua19F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua19F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise19F(){
        int NoOfCustomer = Aquacise19thFeb.size();
        double avRating = this.CalculateAveRating(this.rateAqua19F);
        System.out.println(
                "       LESSON TYPE: AQUACISE              DATE: 19TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise19F(){
        int NoOfCustomer = Aquacise19thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:19TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateAquacise26F(String lastName){
        if (Aquacise26thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua26F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua26F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua26F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua26F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua26F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportAquacise26F(){
        int NoOfCustomer = Aquacise26thFeb.size();
        double avRating = this.CalculateAveRating(this.rateAqua26F);
        System.out.println(
                        "       LESSON TYPE: AQUACISE             DATE: 26TH           SESSION: MORNING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportAquacise26F(){
        int NoOfCustomer = Aquacise26thFeb.size();
        double price = 33.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: AQUACISE           DATE:26TH        SESSION: MORNING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba8J(String lastName){
        if (zumba8thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateAqua8J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateAqua8J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateAqua8J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateAqua8J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateAqua8J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba8J(){
        int NoOfCustomer = zumba8thJan.size();
        double avRating = this.CalculateAveRating(this.rateZumb8J);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 8TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba8J(){
        int NoOfCustomer = zumba8thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 8TH        SESSION: EVENING \n" +
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


        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba15J(String lastName){
        if (zumba15thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb15J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb15J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb15J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb15J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb15J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba15J(){
        int NoOfCustomer = zumba15thJan.size();
        double avRating = this.CalculateAveRating(this.rateZumb15J);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 15TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba15J(){
        int NoOfCustomer = zumba15thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE:15TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba22J(String lastName){
        if (zumba22ndJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb22J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb22J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb22J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb22J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb22J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba22J(){
        int NoOfCustomer = zumba22ndJan.size();
        double avRating = this.CalculateAveRating(this.rateZumb22J);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 22TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba22J(){
        int NoOfCustomer = zumba22ndJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 22TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba29J(String lastName){
        if (zumba29thJan.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb29J.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb29J.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb29J.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb29J.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb29J.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba29J(){
        int NoOfCustomer = zumba29thJan.size();
        double avRating = this.CalculateAveRating(this.rateZumb29J);
        System.out.println(
                "               LESSON TYPE: ZUMBA                 DATE: 29TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba29J(){
        int NoOfCustomer = zumba29thJan.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 29TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba5F(String lastName){
        if (zumba5thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb5F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb5F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb5F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb5F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb5F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba5F(){
        int NoOfCustomer = zumba5thFeb.size();
        double avRating = this.CalculateAveRating(this.rateZumb5F);
        System.out.println(
                        "       LESSON TYPE: ZUMBA                 DATE: 5TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba5F(){
        int NoOfCustomer = zumba5thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 5TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba12F(String lastName){
        if (zumba12thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb12F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb12F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb12F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb12F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb12F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba12F(){
        int NoOfCustomer = zumba12thFeb.size();
        double avRating = this.CalculateAveRating(this.rateZumb12F);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 12TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba12F(){
        int NoOfCustomer = zumba12thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 12TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba19F(String lastName){
        if (zumba19thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb19F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb19F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb19F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb19F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb19F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba19F(){
        int NoOfCustomer = zumba19thFeb.size();
        double avRating = this.CalculateAveRating(this.rateZumb19F);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 19TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba19F(){
        int NoOfCustomer = zumba19thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 19TH        SESSION: EVENING \n" +
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

        } else {
            System.out.println("You do not have a booked lesson, You will be redirected for other options \n");
        }
    }
    public void rateZumba26F(String lastName){
        if (zumba26thFeb.containsKey(lastName)) {
            System.out.println("Record found for: " + lastName +
                    "\nPlease select rating below review \n" +
                    "\n PRESS 1: Very dissatisfied " +
                    "\n PRESS 2: Dissatisfied " +
                    "\n PRESS 3: OK" +
                    "\n PRESS 4: Satisfied" +
                    "\n PRESS 5: Very Satisfied");

            int rating = ftScanner.nextInt();

            if (rating == 1) {
                rateZumb26F.add(rating);
                System.out.println("Customer is Very dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 2) {
                rateZumb26F.add(rating);
                System.out.println("Customer is dissatisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 3) {
                rateZumb26F.add(rating);
                System.out.println("Customer is OK" +
                        "\n We hope to serve you better");
            } else if (rating == 4) {
                rateZumb26F.add(rating);
                System.out.println("Customer is Satisfied" +
                        "\n We hope to serve you better");
            } else if (rating == 5) {
                rateZumb26F.add(rating);
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
            System.out.println("Record found for: " + lastName +
                    "\n Please leave your review");
            String review = ftScanner.nextLine();

            System.out.println("Your Review: " + review + "\n Thank you for the feedback");
        }
        else {
            System.out.println("Record not found, You can not rate this lesson ");
        }
    }
    public void lessonReportZumba26F(){
        int NoOfCustomer = zumba26thFeb.size();
        double avRating = this.CalculateAveRating(this.rateZumb26F);
        System.out.println(
                "       LESSON TYPE: ZUMBA                 DATE: 26TH           SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "    AVERAGE RATING: " + avRating + "\n" );
    }
    public void champReportZumba26F(){
        int NoOfCustomer = zumba26thFeb.size();
        double price = 35.00;
        double totalIncome = NoOfCustomer * price;
        System.out.println(
                "            LESSON: ZUMBA           DATE: 26TH        SESSION: EVENING \n" +
                        "NUMBER OF CUSTOMER: " + NoOfCustomer + "\n" +
                        "   PRICE OF LESSON: " + price +
                        "      TOTAL INCOME: " + totalIncome + "\n");
    }
}






