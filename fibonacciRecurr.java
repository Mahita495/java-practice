import java.util.Scanner;

public class fibonacciRecurr {
    // public static void main(String[] args) {

    //     Scanner sc= new Scanner(System.in);
    //     int x=sc.nextInt();
    //     fibo(x);
        
    // }
    // public static void fibo(int count){
    //     int a=0;
    //     int b=1;
    //     int c=1;
    //     for(int i=1; i<=count; i++){
    //         System.out.print(a+" ");
    //         a=b;
    //         b=c;
    //         c=a+b;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0; i<x ;i++){
            System.out.print(fiboRec(i)+" ");
        }

        
    }
    public static int fiboRec(int count){
        if (count<=1){
            return count;
        }
        return fiboRec(count-1)+fiboRec(count-2);
    }
    

}
