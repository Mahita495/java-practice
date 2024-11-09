import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num= sc.nextLong();
        System.out.println(fact(num));
        
    }

    public static long fact(long n){
        if(n==1){
            return 1;
        }
        return (n*fact(n-1));

    }
}
