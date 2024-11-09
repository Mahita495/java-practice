import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
        
    }

    public static boolean check(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
