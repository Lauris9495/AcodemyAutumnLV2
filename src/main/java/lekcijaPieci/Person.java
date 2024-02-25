package lekcijaPieci;

public class Person {
    private int age;
public Person(int age){
    this.age=age;
}
protected String name;
int height;

//    getter

    public int getAge() {
        return age;
    }

    //    setter

    public void setAge(int age) throws Exception {
        if (age <= 0) {
           throw new Exception("Vecums nedrīkst būt mazāks par 0!!!");
        } else {
            this.age = age;
        }
    }
}
