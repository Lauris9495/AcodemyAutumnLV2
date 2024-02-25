package lekcijaCetri;

import java.util.ArrayList;

public class Home {
    double paltiba;
    int stavi;
    int loguSkaits;
    int sienuSkaits;
    String ielasNosaukums;
    int majasnumurs;
    int tirgusVertiba;
    int istabuSkaits;
    ArrayList<String> apdaresMateriali;

    public void printAdress(){
        System.out.println(ielasNosaukums + " " + majasnumurs);
    }
}
