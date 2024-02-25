package lekcijaTris;

import lekcijaPieci.Person;
import org.w3c.dom.ls.LSOutput;

public class Cikli {
    public static void main(String[] args) {
        int i = 0;

        while(i<5){
            System.out.println("Print i: " + i);
            printNameSurname();
//            i = i+1;
            i++;
        }
    }

    static void printNameSurname(){
        System.out.println("###########");
        System.out.println("Lauris");
        System.out.println("Lavrinovičs");
        System.out.println("###########");
    }

//    int a = 0;
//    while ( a < 1000); {
//        System.out.println("A vērtība ir: " + a);
//    a = a +2;
//    }
//
//    for (int j = 0; j <= 10; j++) {
//        System.out.println("Cikls izpildas " + j + "reizi");
//
//    }



}
