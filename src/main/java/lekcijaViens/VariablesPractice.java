package lekcijaViens;

import java.lang.invoke.StringConcatFactory;

public class VariablesPractice {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Definejam mainigos
        //[mainiga tips] [mainiga nosaukums] = [mainiga vertiba];
        //Suna vards
        String name = "Reksis";
        System.out.print("Suņa vārds: ");
        System.out.println(name);
        //vecums
        int age = 5;
        System.out.print("Suņa vecums: ");
        System.out.println(age);
        //svars
        double weight = 10.3;
        String svaraMervieniba = "kg";
        System.out.print("Suņa svars: ");
        System.out.println(weight+svaraMervieniba);
        //skirne
        //izsalkums
        boolean isHungry = true;
        System.out.print("Suņa izsalkums: ");
        System.out.println(isHungry);

        //Apraksts par sevi:
        //vards
        //uzvards
        //hobijs
        //autovaditaja aplieciba
        //vecums
        //milakais ediens

        String vards = "Lauris";
        String uzvards = "Lavrinovičs";
        String hobijs = "AutoCulture";
        boolean autovaditajaAplieciba = true;
        int vecums = 29;
        String milakaisEdiens= "Plovs";
        System.out.println("Vārds:"+ vards+"\n" +"Uzvārds:" +uzvards+"\n" +"Hobijs:" + hobijs+"\n" +"Autovadītāja apliecība: "+autovaditajaAplieciba+"\n"+"Vecums: "+vecums+"\n"+"Mīļākais ēdiens: "+milakaisEdiens);

        //primitive data types. small letters, small memory size
        //vesels skaitlis  - byte/short/int/long
        byte vecums2 = 125;
        System.out.println(vecums2);
//        byte gadaDienas = 361; (nevar jau šādi) (-128...127)

        //dalskaitli
        float temp = 36.6F;
        double garums = 182.2;

        byte vecumsDivi = 125;
        System.out.println(vecumsDivi);

        short test = 5000;
        int lielskaitlis=  2147483647;

        long earthPopulation = 8087822694L;
        long vecumsMans = 1L;
        System.out.println("Zemes iedzivotaju skaits: " + earthPopulation);

        //logiskais/boolean
        boolean vaiIrDarbaDiena = true;

        //
        char autoVadKategorija = 'A';
        String VadKat = "Kategorija A un B";
        int skaitlisA = 5;
        int skaitlisB = 10;
        int skaitlisC;
        skaitlisC = skaitlisA+skaitlisB;
        System.out.println("Skaitlis C ir: " +skaitlisC );

        int a = 5;
        int b = 10;
        int summa = a +b;

        System.out.println("A + B = " + summa );
        System.out.println("A - B = " + (a-b) );

        int reizinajums = a*b;
        System.out.println("Reizinājums A*B = " +reizinajums);

        System.out.println("Reizinājums dalīts ar summa = " +(reizinajums/summa));

        System.out.println("Reizinājums dalīts ar summa atlikums ir = " +(reizinajums%summa));
        int x = 5;
        int atlikums = x%2;
        //ja atlikums ir 0 tad skaitlis ir para
        



    }
}
