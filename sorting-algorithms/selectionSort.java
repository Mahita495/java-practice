
import java.util.*;
public class selectionSort {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter length of arr");
        int n= sc.nextInt();   
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("before sorting"+Arrays.toString(arr)); 
        
        System.out.println("after sorting" + Arrays.toString(select(arr)) );
        
    }

    public static int[] select(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i; j<arr.length; j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    
}
