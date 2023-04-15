package groupFitnessLesson;

import java.util.HashMap;
import java.util.Scanner;

public class FitnessLesson {

    Launcher lh1 = new Launcher();

    Scanner ftScanner = new Scanner(System.in);

    //private String name;

    //private double price;

    //Implementing my discursion with wale


    // Yoga Lesson Data
    private HashMap<String, String> yoga7thJan = new HashMap<>();

    public void addYoga7thJ(String name, String lesson) {
        if (yoga7thJan.size() < 5 ) {
            if (yoga7thJan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga7thJan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yoga7thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga7thJan.get(i));}

            for (String i : yoga7thJan.keySet()) {
                System.out.println("Booking is successful");
                System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
            }
            }
        }
        else if (yoga7thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");

        }
    }

    private HashMap<String, String> yoga14thJan = new HashMap<>();

    public void yoga14thJ(String name, String lesson) {
        if (yoga14thJan.size() < 5 ) {
            if (yoga14thJan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga14thJan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yoga7thJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yoga7thJan.get(i));}

                for (String i : yoga14thJan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga14thJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }


    private HashMap<String, String> yoga21stJan = new HashMap<>();

    public void yoga21thJ(String name, String lesson) {
        if (yoga21stJan.size() < 5 ) {
            if (yoga21stJan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga21stJan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yogathJ.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga21stJan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga21stJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> yoga28stJan = new HashMap<>();

    public void yoga28thJ(String name, String lesson) {
        if (yoga28stJan.size() < 5 ) {
            if (yoga28stJan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga28stJan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yoga28stJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga28stJan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga28stJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> yoga9Feb = new HashMap<>();

    public void yoga9F(String name, String lesson) {
        if (yoga9Feb.size() < 5 ) {
            if (yoga9Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga9Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yoga9Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga9Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga9Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> yoga11Feb = new HashMap<>();

    public void yogathJ(String name, String lesson) {
        if (yoga11Feb.size() < 5 ) {
            if (yoga11Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga11Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yoga11Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga11Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga11Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> yoga18Feb = new HashMap<>();

    public void yoga18F(String name, String lesson) {
        if (yoga18Feb.size() < 5 ) {
            if (yoga18Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga18Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yogastJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga18Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga18Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> yoga25Feb = new HashMap<>();

    public void yoga25F(String name, String lesson) {
        if (yoga25Feb.size() < 5 ) {
            if (yoga25Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yoga25Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yogastJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yoga25Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yoga25Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    // Spin Lesson Data
    private HashMap<String, String> Spin7Jan = new HashMap<>();

    public void Spin7J(String name, String lesson) {
        if (Spin7Jan.size() < 5 ) {
            if (Spin7Jan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {

                Spin7Jan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                for (String i : Spin7Jan.keySet()) {
                System.out.println("Key: " + i + ", Value: " + Spin7Jan.get(i));}

                for (String i : Spin7Jan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin7Jan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin14Jan = new HashMap<>();

    public void Spin14J(String name, String lesson) {
        if (Spin14Jan.size() < 5 ) {
            if (Spin14Jan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin14Jan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin14Jan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin14Jan.get(i));}

                for (String i : Spin14Jan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin14Jan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin21Jan = new HashMap<>();

    public void Spin21J(String name, String lesson) {
        if (Spin21Jan.size() < 5 ) {
            if (Spin21Jan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin21Jan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin21Jan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin21Jan.get(i));}

                for (String i : Spin21Jan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin21Jan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin28Jan = new HashMap<>();

    public void Spin28J(String name, String lesson) {
        if (Spin28Jan.size() < 5 ) {
            if (Spin28Jan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin28Jan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin28Jan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin28Jan.get(i));}

                for (String i : Spin28Jan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin28Jan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin9Feb = new HashMap<>();

    public void Spin9F(String name, String lesson) {
        if (Spin9Feb.size() < 5 ) {
            if (Spin9Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin9Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin9Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin9Feb.get(i));}

                for (String i : Spin9Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin9Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin11Feb = new HashMap<>();

    public void Spin11F(String name, String lesson) {
        if (Spin11Feb.size() < 5 ) {
            if (Spin11Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin11Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin11Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin11Feb.get(i));}

                for (String i : Spin11Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin11Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin18Feb = new HashMap<>();

    public void Spin18F(String name, String lesson) {
        if (Spin18Feb.size() < 5 ) {
            if (Spin18Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin18Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin18Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin18Feb.get(i));}

                for (String i : Spin18Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin18Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }

    private HashMap<String, String> Spin25Feb = new HashMap<>();

    public void Spin25F(String name, String lesson) {
        if (Spin25Feb.size() < 5 ) {
            if (Spin25Feb.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                Spin25Feb.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : Spin25Feb.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + Spin25Feb.get(i));}

                for (String i : Spin25Feb.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (Spin25Feb.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }











    /* public void yogathJ(String name, String lesson) {
        if (yogastJan.size() < 5 ) {
            if (yogastJan.containsKey(name)) {
                System.out.println("You cannot be added to a session twice");
            } else {
                yogastJan.put( name , lesson);

                // Remove the comment to confirm all session are booked
                //for (String i : yogastJan.keySet()) {
                //System.out.println("Key: " + i + ", Value: " + yogathJ.get(i));}

                for (String i : yogastJan.keySet()) {
                    System.out.println("Booking is successful");
                    System.out.println("Booking ID: " + name + "  Session Booked: " + lesson);
                }
            }
        }
        else if (yogastJan.size() == 5)  {
            System.out.println("Session is filled up, Try another another session\n ");
        }
    }                  */





    /* public void yoga7th(String bookingID){
        HashMap<String, String> cusRecord = new HashMap<String, String>();
        //Set<Entry<String, String>> mappings = cusRecord.entrySet();
        cusRecord.put("Wale"     , "Yoga Evening Session 7th January\n");
        //cusRecord.put("Dele"   , "Yoga Evening Session 7th January\n");
        cusRecord.put("Henry"    , "Yoga Evening Session 7th January\n");
        cusRecord.put("Queen"    , "Yoga Evening Session 7th January\n");
        cusRecord.put("Malik"    , "Yoga Evening Session 7th January\n");


        if (cusRecord.size() < 5 ){
            if(cusRecord.containsKey(bookingID)) {
                System.out.println("You cannot be added to a session twice");
            }
            else {
                cusRecord.put( bookingID , "Spin Evening Session 7th January\n");
                System.out.println("Session is successfully Added");
                //System.out.println(cusRecord);
                for (String i : cusRecord.keySet()) {
                    System.out.println("Key: " + i + ", Value: " + cusRecord.get(i));
                }
            }
        }
        else if (cusRecord.size() == 5 ) {
            System.out.println("Session is filled up");
        }

    }
    public void spin7th(String bookingID){
        HashMap<String, String> cusRecord = new HashMap<String, String>();
        cusRecord.put("Waje"    , "Spin Evening Session 21st January");
        cusRecord.put("\nDele"     , "Spin Evening Session 21st January" );
        cusRecord.put("\nHenry"    , "Spin Evening Session 21st January");
        cusRecord.put("\nQueen"    , "Spin Evening Session 21st January");

        if (cusRecord.size() < 5 ){
            cusRecord.put( bookingID , "Spin Evening Session 14th");
            if( cusRecord.containsKey(bookingID) ){
                System.out.println("You cannot be added to a session twice");
            }
            else {
                System.out.println("Session is successfully Added");
                System.out.println(cusRecord);
            }
        }
        else if (cusRecord.size() == 5 ) {
            System.out.println("Session is filled up");
        }
    }

        // This test if the customer record is found or not

        //System.out.println(cusRecord);    */
}


