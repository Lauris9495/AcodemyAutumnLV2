package classHomework;

public class Test {
    public static void main(String[] args) {
Trijsturis trijsturisJauns = new Trijsturis();

        System.out.println("Trijstūra laukums ir: " + trijsturisJauns.laukumsHeronaFormula());
        System.out.println("Trijstūris ir vienādmalu: "+ trijsturisJauns.irVienadmalu());
        System.out.println("Trijstūris ir vienādsānu: "+trijsturisJauns.irVienadsanu());

        Trijsturis trijsturisJauns2 = new Trijsturis();

        trijsturisJauns2.a = 6;
        trijsturisJauns2.b = 5;
        trijsturisJauns2.c = 8;

        System.out.println("Trijstūra laukums ir: " + trijsturisJauns2.laukumsHeronaFormula());
        System.out.println("Trijstūris ir vienādmalu: "+ trijsturisJauns2.irVienadmalu());
        System.out.println("Trijstūris ir vienādsānu: "+trijsturisJauns2.irVienadsanu());

    }
}
