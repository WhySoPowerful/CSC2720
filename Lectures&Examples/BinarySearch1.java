import java.io.*;

class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 20, 40, 50};
        int k = 40;
        System.out.println(binarySearch(arr, k));
    }

    public static boolean binarySearch(int[] numbers, int k) {
    	return binarySearchRecursive(numbers, k, 0, numbers.length-1);
    }

    private static boolean binarySearchRecursive(int[] numbers, int k, int lowerBound, int upperBound) {
    	// base case
    	if (lowerBound > upperBound) {
    		return false;
    	}

    	// recursive step
    	int guess = (lowerBound + upperBound) / 2;
    	if (numbers[guess] < k) {
    		return binarySearchRecursive(numbers, k, guess+1, upperBound);
    	} else if (numbers[guess] > k) {
    		return binarySearchRecursive(numbers, k, lowerBound, guess-1);
    	} else {
    		return true;
    	}
    }
}
