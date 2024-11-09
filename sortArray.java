import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list");
        int n= sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers");
        for(int i=0; i<n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        System.out.println(list);
    }
    
}
