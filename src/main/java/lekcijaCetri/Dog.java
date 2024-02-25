package lekcijaCetri;

import homework.Calculator;

public class Dog {

    public int kepuSkaits=4;
    private String name;
    private int age;
    private double weight;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    Dog(String name, int age, double weight, String breed){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.breed = breed;

}
public Dog(){

}
    public void makeSound(){
        System.out.println("VAU VAU!!!");
    }
    public void printDog(){
        System.out.println("Suņa vārds ir: "+name);
        System.out.println("Suņa vecums ir: "+age);
        System.out.println("Suņa svars ir: "+weight);
        System.out.println("Suņa suga ir: "+breed);
    }
}
