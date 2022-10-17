import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Array size  ");
        int n = sc.nextInt();
        double []arr = new double[n]; 
        System.out.println("\nEnter Array Elements ");
        for (int index = 0; index < arr.length; index++) {
            arr[index]=sc.nextDouble();
        } 
        // if function avalable use arrays 
        // Arrays.sort(arr);
        selectionSort(arr);
        System.out.println("\nSorted Array "+Arrays.toString(arr));
        System.out.print("Key element : ");
        double key = sc.nextDouble();
        System.out.println("\nIndex of key element : ");
        binarySearch(arr,key);
        // if function avalable use arrays.binarysearch
        System.out.println(Arrays.binarySearch(arr, key));
        sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void selectionSort(double[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            double smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void binarySearch(double [] arr, double key){  
        int low = 0;  
        int high = arr.length - 1;  
        while (low <= high){  
            int mid = (low + high) / 2;  
            if (key == arr[mid]){  
                System.out.println("Element found at index " + mid);  
                return;  
            }  
            if (key < arr[mid]){  
                high = mid - 1;  
            }  
            else{  
                low = mid + 1;  
            }  
        }  
        System.out.println("Element not found");  
    }
}
