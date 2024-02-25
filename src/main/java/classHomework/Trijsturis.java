package classHomework;

public class Trijsturis {



        int a;
        int b;
        int c;
        int laukums;

        public Trijsturis() {this(9, 6, 9);
            System.out.println("Mēs veidojam jaunu trijstūri...");
        }

        public Trijsturis(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;


        }

        public boolean irVienadmalu() {return a == b && b == c;}


        public boolean irVienadsanu() {
            return a == b || b == c || a == c;
        }

        int laukumsHeronaFormula() {
            // Heron's formula
            int p = (a + b + c) / 2;
            return (int) Math.sqrt((p * (p - a) * (p - b) * (p - c)));

        }

}





