package homework;

import java.util.Scanner;

class LielaksParNulli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saņem veselu skaitli no lietotāja
        System.out.println("Ievadiet veselu skaitli: ");
        int skaitlis = scanner.nextInt();

        // Pārbauda, vai skaitlis ir lielāks par nulli
        if (skaitlis > 0) {
            System.out.println("Skaitlis ir lielāks par nulli.");
        } else {
            System.out.println("Skaitlis nav lielāks par nulli.");
        }
    }
}
