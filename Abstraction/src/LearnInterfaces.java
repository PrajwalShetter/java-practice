//An interface is fully abstract class. It includes a group of abstract methods(methods without a body)
//We use the interface keyword to create an interface in java
//like abstract classes, we cannot cretae objects of interfaces
//to use an interface, other classes must implement it. we use the implements keyword to implement an interface

public class LearnInterfaces {
    public static void main(String[] args) {


//Animal a1 = new Animal() ; //it is not allowed bcz interfaces cannot be an object
Monkey m1 = new Monkey();
m1.eat();
m1.drink();

    }

}
interface Animal{

    public void eat(); //In interface there is no need to mention abstract keyword when defining the method bcz by default it abstract, and accesses specifier also

    public  void drink();
}

interface pet{

    void drink();

    void sings();
}

class Monkey implements Animal, pet{   // implements keyword is similar to extends word , extends is used in classic , in interface term we use implements
    @Override
    public void eat() {
        System.out.println("Monkey eats banana");
    }

    @Override
    public void drink() {
        System.out.println("Monkey drinking");
    }


    public Monkey() {
        super();
    }

    @Override
    public void sings() {

    }
}