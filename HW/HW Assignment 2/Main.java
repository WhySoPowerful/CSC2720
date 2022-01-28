import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Question1();
    Question2();
    int arr[] = { 1, 4, 2, 3 };
    arrayPrinter(Question3(arr));
  }

  public static int userInput(String message) {
    System.out.println(message);
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    return n;
  }

  public static int[] userInputArray(String msg, int n) {
    int[] numbers = new int[n];
    int i = 0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println(msg);
    String[] str = sc.nextLine().split(" ");
    while (n > 0) {
      numbers[i] = Integer.parseInt(str[i]);
      n--;
      i++;
    }

    return numbers;
  }

  public static void Question1() {
    {
      // Read in the value of k
      int k = userInput("Please enter a value to find pairs of? ");

      // Read in the value of n
      int n = userInput("Enter size of array? ");
      
      // int[] numbers = new int[n];
      int[] numbers = userInputArray("Enter some numbers space seperated? ", n);

      System.out.println("Pairs found: " + findPairs(numbers, k));
    }
  }

  private static int findPairs(int[] numbers, int k) {

    Arrays.sort(numbers);
    int start = 0;
    int end = numbers.length - 1;
    int count = 0;
    while (start <= end) {

      int total = numbers[start] + numbers[end];
      if (total == k) {
        count++;
        start++;
        end--;
      } else if (total > k)
        end--;
      else
        start++;

    }
    return count;
  }

  public static void Question2() {
    {
      int size1, size2, size3;
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements you want to store in array 1: ");
      // reading the number of elements from the that we want to enter
      size1 = sc.nextInt();
      // creates an array in the memory of length 10
      int[] arr1 = new int[size1];
      System.out.print("Enter the elements of arr1: ");
      for (int i = 0; i < size1; i++) {
        // reading array elements from the user
        arr1[i] = sc.nextInt();
      }
      System.out.print("Enter the number of elements you want to store in array 2: ");
      // reading the number of elements from the that we want to enter
      size2 = sc.nextInt();
      // creates an array in the memory of length 10
      int[] arr2 = new int[size2];
      System.out.print("Enter the elements of arr2: ");
      for (int i = 0; i < size2; i++) {
        // reading array elements from the user
        arr2[i] = sc.nextInt();
      }
      System.out.print("Enter the number of elements you want to store in array 3: ");
      // reading the number of elements from the that we want to enter
      size3 = sc.nextInt();
      // creates an array in the memory of length 10
      int[] arr3 = new int[size3];
      System.out.print("Enter the elements of arr3: ");
      for (int i = 0; i < size3; i++) {
        // reading array elements from the user
        arr3[i] = sc.nextInt();
      }
      int z1 = 0, z3 = 0;
      int arr1sp[] = new int[size1 - size2];
      int arr3sp[] = new int[size3 - size2];
      for (int i = 0; i < size1; i++) {
        int flag = 1;
        for (int j = 0; j < size2; j++) {
          if (arr1[i] == arr2[j]) {
            flag = 0;
            break;
          }
        }
        if (flag == 1) {
          arr1sp[z1] = arr1[i];
          z1++;
        }

      }
      for (int i = 0; i < size3; i++) {
        int flag = 1;
        for (int j = 0; j < size2; j++) {
          if (arr3[i] == arr2[j]) {
            flag = 0;
            break;
          }
        }
        if (flag == 1) {
          arr3sp[z3] = arr3[i];
          z3++;
        }

      }
      int temp = 0;
      // Sort the array in ascending order
      for (int i = 0; i < arr1sp.length; i++) {
        for (int j = i + 1; j < arr1sp.length; j++) {
          if (arr1sp[i] > arr1sp[j]) {
            temp = arr1sp[i];
            arr1sp[i] = arr1sp[j];
            arr1sp[j] = temp;
          }
        }
      }
      // Sort the array in ascending order
      for (int i = 0; i < arr3sp.length; i++) {
        for (int j = i + 1; j < arr3sp.length; j++) {
          if (arr3sp[i] > arr3sp[j]) {
            temp = arr3sp[i];
            arr3sp[i] = arr3sp[j];
            arr3sp[j] = temp;
          }
        }
      }
      int finalsize = size2 + (size1 - size2) + (size3 - size2);
      int finalarr[] = new int[finalsize];
      int count = 0;
      for (int i = 0; i < size3 - size2; i++) {
        finalarr[count] = arr3sp[i];
        count++;
      }
      for (int i = 0; i < size2; i++) {
        finalarr[count] = arr2[i];
        count++;
      }
      for (int i = 0; i < size1 - size2; i++) {
        finalarr[count] = arr1sp[i];
        count++;
      }
      System.out.print("The final array output is: ");
      for (int i = 0; i < finalsize; i++) {
        System.out.print(finalarr[i] + " ");
      }

    }
  }

  public static int[] Question3(int arr[]) {
    int left = 0, right = arr.length - 1;
    Question3Helper(arr, left, right);
    return arr;
  }

  private static void Question3Helper(int[] arr, int left, int right) {
    while (left < right) {
      while (arr[left] % 2 == 0 && left < right)
        left++;
      while (arr[right] % 2 == 1 && left < right)
        right--;

      if (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
  }

  public static void arrayPrinter(int[] arr) {
    System.out.println("\nMy array will return evens first and odds next: " + Arrays.toString(arr));
  }
}