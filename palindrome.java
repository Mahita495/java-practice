import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
        
    }
    public static boolean check(String s){
        boolean res=true;
        int len = s.length();
        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)){
                res=false;
                break;
            }

        }
        return res;
    }
}
