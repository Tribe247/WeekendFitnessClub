package groupFitnessLesson;

import java.util.HashMap;

import java.util.Arrays;

public class ChamMonthData {

    public void janChamp() {
        HashMap<String, Integer> cusRecord = new HashMap<String, Integer>();
        //Set<Entry<String, String>> mappings = cusRecord.entrySet();
        cusRecord.put("Spin 7th "        ,  3);
        cusRecord.put("Zumba 12th"       ,  2);
        cusRecord.put("Body Fit 1st"     ,  4);
        cusRecord.put("Aquasize 2nd"     ,  8);
        cusRecord.put("Bodysculpt 3rd"   ,  12);
        cusRecord.put("Spin 8th "        ,  3);
        cusRecord.put("Zumba 21th"       ,  2);
        cusRecord.put("Body Fit 15st"    ,  4);
        cusRecord.put("Aquasize 17nd"    ,  8);
        cusRecord.put("Bodysculpt 11rd"  ,  12);


        System.out.println(cusRecord.size());

        System.out.println(cusRecord.get("Spin"));

        for (String i : cusRecord.keySet()) {
            System.out.println(i);
        }
        for (Integer i : cusRecord.values()) {
            System.out.println(i);
        }

    }

    public void testArr() {

        double total = 0;

        double[] cafePrice = new double[5];
        cafePrice[0] = 6.99;
        cafePrice[1] = 5.99;
        cafePrice[2] = 2.99;
        cafePrice[3] = 1.50;
        cafePrice[4] = 2.50;

        //Menu item array
        String[] cafeDrink = new String[5];
        cafeDrink[0] = "Macchiato";
        cafeDrink[1] = "Latte";
        cafeDrink[2] = "Americano";
        cafeDrink[3] = "Tea";
        cafeDrink[4] = "Cappichino";

        //Welcome user and gather their menu selection
        System.out.println("Welcome to our cafe! Please enjoy!");
        System.out.println("Please enter a menu selection:\n"
                + "0. Macchiato -- $6.99\n"
                + "1. Latte -- $5.99\n"
                + "2. Americano -- $2.99\n"
                + "3. Tea -- $1.50\n"
                + "4. Cappichino -- $2.50");

        for (double i = 0; i < 10; i++) {
            if (i==4) {
                break;
            }
            System.out.println(i);
            }




        //Add up the total
        //for (int i = 0; i < cafePrice.length; i++) {
        //    total += cafePrice[i];

        //    System.out.println(total);
        //}

        //for (double i : cafePrice){
        //    System.out.println(cafePrice);
        //}



    }

    public void myWay(){

    }

}
