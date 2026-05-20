//i) The abstraction class in java cannot be instantiated(we cannot create objects of the abstract classes ). we use the abstract keyword to declare an abstract class .
//ii) An abstract class can have both the regular methods and abstract methods.
//iii) A method that doesn't have its body is known as an abstract method
//iv) Though abstract classes cannot be instantiated, we can create subclasses from it. we can than access members of the abstract class using the object of the subclass
//v)If the abstract class includes any abstract method , then all the child classes inherited from the abstract superclass must provide the implementation the abstract method

public class LearnAbstract {

    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle() ; //Vehicle' is abstract; cannot be instantiated
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }

}
class Human{

    void speak(){

    }

  //  abstract void eat(){ // this is an abstract method it gives error because class is in normal formate

   // }
}

class Scooter extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int brakes(int wheels) {
        return 0;
    }
}

abstract class Vehicle{

    abstract void accelerate();

    abstract int brakes(int wheels);

    void honks(){
        System.out.println("Vehicle honks");

    }
}

class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("car is accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("car breaks are pushed");
        return wheels;
    }
}