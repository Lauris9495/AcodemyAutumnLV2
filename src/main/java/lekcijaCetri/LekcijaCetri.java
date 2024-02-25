package lekcijaCetri;

import java.util.ArrayList;

public class LekcijaCetri {
    public static void main(String[] args) {

//        Masivs ar trim elementiem
        String[]cars = {"BMW","Seat","Bentley"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        for (String car : cars){
            System.out.println(car);
        }

//        arraylist ar 3 elementiem
        ArrayList<String> cars2 = new ArrayList<>();

        cars2.add("Mercedes");
        cars2.add("Bugatti");
        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));
        System.out.println("!For Cikls!");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }
        System.out.println("!For each Cikls!");
        for (String s : cars2) {
            System.out.println(s);

        }
cars2.remove(0);
        System.out.println("For each Cikls ar remove 0");
        for (String s : cars2){
            System.out.println(s);
        }
        System.out.println(cars2.get(0));

//        cars2.set(0,"Volvo");
//        System.out.println();

        cars2.remove("Mercedes");

        System.out.println("VAI SARAKSTS SATUR VARDU BMW? " +cars2.contains("BMW"));
    }

}
