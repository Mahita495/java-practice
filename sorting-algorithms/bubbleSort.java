import java.util.Scanner;
import java.util.*;

public class bubbleSort {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter length of arr");
        int n= sc.nextInt();   
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("before sorting"+Arrays.toString(arr)); 
        
        System.out.println("after sorting" + Arrays.toString(bubSort(arr)) );
    }
    public static int[] bubSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped=false;
            for(int j=0; j<arr.length -1 -i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        return arr;

    }
    
}
