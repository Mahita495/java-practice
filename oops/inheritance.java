// inheritance is the process of creating subclasses inside a parent class. methods in sub class can be inherited from parent class

package oops;

class Vehicle{
    public void startEngine(){
        System.out.println("Engine started");
    }

}

class Car extends Vehicle{
    public void drive(){
        System.out.println("car is driving");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
    }
    
}
