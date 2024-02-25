package homework;

public class VelesanasVecums {
    public static void main(String[] args) {
        System.out.println("programmas sākums");

        int vecums = 56;

        if (vecums >= 18) {
            System.out.println("Drīkst balsot!!!");
            if (vecums > 90) {
                System.out.println("Jāveic veselības pārbaude");
            }
            System.out.println("Drīkst balsot!!!");
        }
        if (vecums < 7) {
            System.out.println("Nav jāiet skolā");
        }

        System.out.println("programmas beigas");
    }
}
