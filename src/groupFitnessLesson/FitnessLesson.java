package groupFitnessLesson;

import java.util.HashMap;
import java.util.Scanner;

public class FitnessLesson {

    Launcher lh1 = new Launcher();

    Scanner ftScanner = new Scanner(System.in);
    public void customerID() {
    }

    public void yoga7th(String bookingID){
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

        //System.out.println(cusRecord);
}


