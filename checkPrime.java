import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check(num));
    }
    public static boolean check(int x){
        if(x==0 || x==1){
            return false;
        }
        if(x==2){
            return true;
        }
        
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
        
    }
}
