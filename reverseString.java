import java.util.*;

public class reverseString{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);


        int num = sc.nextInt();
        String s = Integer.toString(num);
        System.out.println(reverse(s));
    }

    public static String reverse(String in){
        if (in == null)
			throw new IllegalArgumentException("Null is not valid input");
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();

        for (int i= chars.length-1; i>=0; i--){
            out.append(chars[i]);
        }
        return out.toString();
    }
    
}