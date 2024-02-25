package lekcijaPieci;

import lekcijaCetri.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void calculateDiametrTest(){
        Circle rinkis = new Circle(3);
//        double laukums = rinkis.calculateArea();
        double diametrs = rinkis.calculateDiameter();

        Assert.assertEquals(diametrs,6,"Kļūda ir te!!!");
//        Assert.assertEquals(laukums,28.26,"Laukums ir nepareizs!!!");


    }
    @Test
    public void calculateAreTest(){
        Circle rinkis = new Circle(3);
        double laukums = rinkis.calculateArea();
        Assert.assertEquals(laukums,28.26,"Laukums ir nepareizs!!!");
    }
}
