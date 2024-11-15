

class Merge {  
  
    /* Function to merge the subarrays of a[] */  
    void merge(int a[], int beg, int mid, int end)    
    {    
        int i, j, k;  
        int n1 = mid - beg + 1;    
        int n2 = end - mid;    
          
       /* temporary Arrays */  
            int LeftArray[] = new int[n1];  
            int RightArray[] = new int[n2];  
          
        /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
        LeftArray[i] = a[beg + i];    
        for (j = 0; j < n2; j++)    
        RightArray[j] = a[mid + 1 + j];    
          
        i = 0; /* initial index of first sub-array */  
        j = 0; /* initial index of second sub-array */   
        k = beg;  /* initial index of merged sub-array */  
          
        while (i < n1 && j < n2)    
        {    
            if(LeftArray[i] <= RightArray[j])    
            {    
                a[k] = LeftArray[i];    
                i++;    
            }    
            else    
            {    
                a[k] = RightArray[j];    
                j++;    
            }    
            k++;    
        }    
        while (i<n1)    
        {    
            a[k] = LeftArray[i];    
            i++;    
            k++;    
        }    
          
        while (j<n2)    
        {    
            a[k] = RightArray[j];    
            j++;    
            k++;    
        }    
    }    
      
    void mergeSort(int a[], int beg, int end)  
    {  
        if (beg < end)   
        {  
            int mid = (beg + end) / 2;  
            mergeSort(a, beg, mid);  
            mergeSort(a, mid + 1, end);  
            merge(a, beg, mid, end);  
        }  
    }  
      
    /* Function to print the array */  
    void printArray(int a[], int n)  
    {  
        int i;  
        for (i = 0; i < n; i++)  
            System.out.print(a[i] + " ");  
    }  
      
    public static void main(String args[])  
    {  
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
        int n = a.length;  
        Merge m1 = new Merge();  
        System.out.println("\nBefore sorting array elements are - ");  
        m1.printArray(a, n);  
        m1.mergeSort(a, 0, n - 1);  
        System.out.println("\nAfter sorting array elements are - ");  
        m1.printArray(a, n);  
        System.out.println("");  
    }  
      
      }  

// public class mergeSort {

//     public static void main(String[] args) {
//         int arr[] ={11,30,24,33,5,66,4,59,41};
//         int n=arr.length;
//         mergeSort m1 = new mergeSort();
//         System.out.println("before sorting");
//         m1.printArray(arr, n);
//         m1.mergesort(arr, 0, n-1);
//         System.out.println("after sorting");
//         m1.printArray(arr, n);   
//         System.out.println("");     
//     }

//     void merge(int[] arr, int beg, int mid, int end){
//         int i,j,k;
//         int n1=mid-beg-1;
//         int n2=end-mid;

//         int[] left= new int[n1];
//         int[] right=new int[n2];

//         for(i=0; i<n1; i++){
//             left[i]=arr[beg+i];
//         }
//         for(j=0; i<n2; j++){
//             right[j]=arr[mid+1+j];
//         }

//         i=0;
//         j=0;
//         k=beg;

//         while(i<n1 && j<n2){
//             if (left[i]<=right[j]){
//                 arr[k]=left[i];
//                 i++;
//             }
//             else{
//                 arr[k]=right[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<n1){
//             arr[k]=left[i];
//             i++;
//             k++;
//         }
//         while(j<n2){
//             arr[k]=right[j];
//             j++;
//             k++;
//         }

//     }

//     void mergesort(int[] arr, int beg,int end){
//         if(beg<end){
//             int mid =(end+beg)/2;
//             mergesort(arr, beg, mid);
//             mergesort(arr, mid+1, end);
//             merge(arr, beg,mid,end);


//         }

//     }

//     void printArray(int arr[], int n)  
// {  
//     int i;  
//     for (i = 0; i < n; i++)  
//         System.out.print(arr[i] + " ");  
// }  
  
    
// }