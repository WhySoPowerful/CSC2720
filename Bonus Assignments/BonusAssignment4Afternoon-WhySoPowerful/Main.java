import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // prompt user to enter Tree input
    System.out.println("Please enter Binary Tree input: ");
    @SuppressWarnings("resource")
    Scanner userInput = new Scanner(System.in);

    // parse the input
    int[] binaryTree;
    String inputTree = userInput.nextLine();
    if (inputTree.equals("")) {
      binaryTree = new int[0];
    } else {
      String[] binaryTreeStrings = inputTree.split(" ");
      binaryTree = new int[binaryTreeStrings.length];
      for (int i = 0; i < binaryTreeStrings.length; i++) {
        binaryTree[i] = Integer.parseInt(binaryTreeStrings[i]);
      }
    }

    // print if the tree is binary search tree or not
    System.out.println(isBinarySearchTree(binaryTree));
  }

  // method to check if binary tree is a binary search tree

  private static boolean isBinarySearchTree(int[] binaryTree) {
    return isBinarySearchTreeRec(binaryTree, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  // Recursive method to determine Binary Search Tree
  private static boolean isBinarySearchTreeRec(int[] binaryTree, int index, int lowerBound, int upperBound) {

    if (binaryTree[index] < lowerBound || binaryTree[index] > upperBound) {
      return false;
    }

    if (index * 2 + 1 < binaryTree.length
        && !isBinarySearchTreeRec(binaryTree, index * 2 + 1, lowerBound, binaryTree[index])) {
      return false;
    }

    if (index * 2 + 2 < binaryTree.length
        && !isBinarySearchTreeRec(binaryTree, index * 2 + 2, binaryTree[index], upperBound)) {
      return false;
    }

    return true;
  }

}

// Space complexity is O(n)... O(n) space because of the arrays!
// Time Complexity is O(n)... O(n) runtime for time complexity becasue of
// recursion!