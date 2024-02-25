package homework;

public class BusinessCardTest {
    public static void main(String[] args) {

        System.out.println("###########");
        System.out.println("Vizītkarte");
        printBusinessCardTwo("Jānis","Kalniņš",+37123232,1992);


        System.out.println("###########");
        System.out.println("Vizītkarte");
        printBusinessCardTwo2("Marija","Bērziņa",+37128238,1994);



    }

    static void printBusinessCardTwo(String name, String surname, int telefonaNumurs, int dateOfBirth) {


        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: +" + telefonaNumurs);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("###########");
        System.out.println("\n");


    }
    static void printBusinessCardTwo2(String name,String surname,int telefonaNumurs, int dateOfBirth){



        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: +" + telefonaNumurs);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("###########");
        System.out.println("\n");
    }
}
