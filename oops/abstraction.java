//abstraction is a form of hiding the implementation details and deisplaying only the necessary information

package oops;

abstract class Animal{
    public abstract void sound();

}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
    }
    
}
