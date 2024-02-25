package lekcijaDivi;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String istaParole = "password1234";
        System.out.println("Ievadi savu paroli...");
        Scanner scanner = new Scanner(System.in);

        String ievaditaParole = scanner.nextLine();

        if (!ievaditaParole.equals(istaParole)) {
            System.out.println("Parole nepareiza. Pieeja liegta!");
        } else {
            System.out.println("Parole ir pareiza!");
            System.out.println("programmas beigas");
        }
    }
}

