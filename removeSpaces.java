import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remove(s));
        
    }
    public static String remove(String s){
        StringBuilder out = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(char c:charArray){
            if(!Character.isWhitespace(c)){
                out.append(c);
            }
        }
        return out.toString();
    }
}
