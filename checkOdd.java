import java.util.*;

public class checkOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n= sc.nextInt();

        System.out.print("Enter the integers ");
        for(int i=0; i<n; i++){
            int num= sc.nextInt();
            list.add(num);
        }
        System.out.println(odd(list));
    }
    public static boolean odd(List<Integer> list){
        for(int i:list){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }
    // if list is very large, use parallel stram for fast processing

    // public static boolean odd1(List<Integer> list){
    //     return list.parallelStream().anyMatch(x -> x%2!=0);
    // }

}
