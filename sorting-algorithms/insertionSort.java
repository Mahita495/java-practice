import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter length of arr");
        int n= sc.nextInt();   
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("before sorting"+Arrays.toString(arr)); 
        
        System.out.println("after sorting" + Arrays.toString(insert(arr)) );
        
    }
    public static int[] insert(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    
}
