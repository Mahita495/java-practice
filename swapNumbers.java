import java.util.Scanner;

public class swapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int[] numbers={a,b};
        System.out.println("Before swapping "+a+" "+b);
        swap(numbers);
        System.out.println("After swapping "+numbers[0]+" "+numbers[1]);
        
    }

    public static void swap(int[] numbers){

        numbers[0]=numbers[0]+numbers[1];
        numbers[1]=numbers[0]-numbers[1];
        numbers[0]=numbers[0]-numbers[1];

    }
    

    
}
