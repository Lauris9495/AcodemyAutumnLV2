package lekcijaCetri;

import java.util.ArrayList;

public class DarbibaArKlasem {
    public static void main(String[] args) {
        Dog mansSuns = new Dog();
        System.out.println("Ķepu skaits manam sunim: " +mansSuns.kepuSkaits);
        mansSuns.kepuSkaits = 4;
        mansSuns = new Dog();
        mansSuns.setName("Reksis");
        mansSuns.setAge(5);
        mansSuns.setWeight(12.3);
        mansSuns.setBreed("Husky");
        mansSuns.makeSound();
        mansSuns.printDog();

//Dog kaiminuSuns = new Dog();
//kaiminuSuns.name = "Duksis";
//kaiminuSuns.age = 8;
//kaiminuSuns.weight = 15.7;
//kaiminuSuns.breed = "Rotveiler";
//       kaiminuSuns.printDog();
//       kaiminuSuns.makeSound();

        Home manaMaja = new Home();
        manaMaja.ielasNosaukums = "Atbrīvošanas aleja";
        manaMaja.majasnumurs = 148;
        manaMaja.printAdress();

        ArrayList<String> materiali = new ArrayList<>();
        materiali.add("Parkets");
        materiali.add("Flīzes");

        manaMaja.apdaresMateriali = materiali;

        Circle rinkis1 = new Circle(89);
//       rinkis1.r = 34;
        System.out.println("Riņķa laukums ir: " + rinkis1.calculateArea());
        System.out.println("Riņķa diametrs ir: " + rinkis1.calculateDiameter());


    }
}
