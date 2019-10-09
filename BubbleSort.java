import java.util.*;
public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){                                  
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1] = arr[j]-arr[j-1];
                    arr[j] =arr[j]-arr[j-1];                         
              	}       
            }  
        }   
    }  
    public static void main(String[] args) {  
                
                Scanner sc = new Scanner(System.in);
                 
                System.out.println("Enter the number of element"); 
                int n = sc.nextInt(); 
                System.out.println("Enter the element of array"); 
                int arr[] =new int[n];
                for(int i=0; i <n; ){  
                        arr[i++]=sc.nextInt();  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//Using function
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i <n; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}