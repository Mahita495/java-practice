//polymorphism is the ability of object to show multiple forms
//compile time polymporhism includes multiple menthods with same name and differenet parameter
//runtime polymorphism can override methods in sub class from parent class


package oops;

class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}

public class polymorphism {

    public static void main(String[] args) {
         Shape circle = new Circle();
         Shape rect = new Rectangle();
         
         circle.draw();
         rect.draw();
    }
    
}
