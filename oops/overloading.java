package oops;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}

public class overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("sum of 2 nums = "+calc.add(3,4));
        System.out.println("sum of 3 nums = "+calc.add(4,5,6));
        System.out.println("sum of double nums = "+calc.add(2.4, 5.6));
    }
    
}
