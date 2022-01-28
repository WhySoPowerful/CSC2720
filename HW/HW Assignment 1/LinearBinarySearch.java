// java
import java.util.Scanner;       

public class LinearBinarySearch{
	
	public static int LinearSearch(int arr[], int n, int target){
     for(int i = 0; i < n; i++){
         if (arr[i] == target){
             return i;
         }
     }
     return -1;
 }

 public static int BinarySearch(int arr[],int left, int right, int target){

     while(left <= right) {
         int mid = left + (right - left) / 2;
         if (arr[mid] == target){
             return mid;

         }
         if (arr[mid] < target){
             left = mid + 1;
         }
         else
             right = mid - 1;
     }
     return -1;
 }


 public static void main(String[] args){

     @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
     System.out.print("How many elements : ");
     int n = in.nextInt();
     int numArray[] = null;

     numArray = new int[n];           

     System.out.println("\nEnter elements in sorted order...\n");
     
     for(int i = 0; i < n; i++){

         System.out.print("\tEnter " + (i+1) + " Element: ");

         numArray[i] = in.nextInt();

     }

     System.out.print("\nEnter Target Value: ");

     int target = in.nextInt();

     System.out.println("\nArray Values: ");

     for(int i = 0; i < n; i++){

         System.out.print(numArray[i] + " ");

     }

     System.out.println("\n\nTarget Value: " + target);

     int resultLinear = LinearSearch(numArray, n, target);

     int resultBinary = BinarySearch(numArray, 0, n -1, target);

     System.out.println("Result by Linear Search: " + resultLinear);

     System.out.println("Result by Binary Search: " + resultBinary);
     
 }

}