package lekcijaTris;

public class Metodes {
    public static void main(String[] args) {

            printInfoAboutDog();
        printInfoAboutDog();
        printInfoAboutDog();

        aprekinatTaisnsturaLaukumu(3, 9);
        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(3, 9);
        System.out.println("Laukums ir: " +aprekinataisLaukums);

        printInfoAboutDog2("Duksis",5,15.8);

        String name1 = "Dusksis2";
        int age1 = 16;
        double weight1 = 87;

        printInfoAboutDog2(name1,age1,weight1);

//        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(vienaMala, otraMala);
//        System.out.println("laukumns ir: " + aprekinataisLaukums);

    }

    static void printInfoAboutDog(){
        String dogName = "Rižiks";
        int dogAge = 8;
        double dogWeight = 15;

        System.out.println("Mans suņa vārds ir: " + dogName);
        System.out.println("Mana suņa vecums ir: " +dogAge);
        System.out.println("Mana suņa svars ir: " + dogWeight);
        System.out.println("\n");

    }

    static int aprekinatTaisnsturaLaukumu (int a, int b){
        int laukums = a*b;
        return laukums;
    }

    static void printInfoAboutDog2(String name, int age, double weight){
        System.out.println("Mans suņa vārds ir: " + name);
        System.out.println("Mana suņa vecums ir: " +age);
        System.out.println("Mana suņa svars ir: " + weight);
        System.out.println("\n");
    }

    static double aprekinatRinkaLaukumu(int radiuss) {
        return 3.14 * (radiuss * radiuss);
    }
}




