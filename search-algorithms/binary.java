import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of arr");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();

        System.out.println(bin(arr, target));
        
    }
    public static int bin(int[] arr, int target){
        int left=0;
        int right=arr.length -1;
        int mid;

        while(left<=right){
           mid = left + (right - left)/2;

           if(arr[mid]==target){
            return mid;
           }
           if(arr[mid]<target){
            mid=left+1;
           }
           else{
            mid=right-1;
           }

        }
        return -1;

    }
    
}
