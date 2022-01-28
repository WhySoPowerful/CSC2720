import java.util.LinkedList;
import java.util.Queue;

//Node class
class Node {
  public int data;
  public Node left, right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

// BST class
public class BST {
  private Node root;

  public BST() {
    root = null;
  }

  // returns the root
  public Node getRoot() {
    return root;
  }

  // sets the root
  public void setRoot(Node root) {
    this.root = root;
  }

  // insertHelper() method uses the recursion to inserts the data into the tree
  public Node insertHelper(int data, Node head) {
    if (head == null) {
      return new Node(data);
    } else if (head.data < data) {
      head.right = insertHelper(data, head.right);
      return head;
    } else {
      head.left = insertHelper(data, head.left);
      return head;
    }
  }

  // inserts the data into the tree it will calls the insertHelper() method to
  // insert
  public void insert(int data) {
    root = insertHelper(data, root);
  }

  // prints the tree in the level order traversal manner
  public void print() {
    Node temp = root;
    Queue<Node> q = new LinkedList<Node>();
    if (temp == null) {
      System.out.println("[]");

    } else {
      System.out.print("[" + temp.data);
      q.add(temp);
      while (!q.isEmpty()) {
        temp = q.poll();
        if (temp.left != null || temp.right != null) {
          System.out.print(",");
          if (temp.left != null) {
            System.out.print(temp.left.data + ",");
            q.add(temp.left);
          } else {
            System.out.print("null" + ",");

          }
          if (temp.right != null) {
            System.out.print(temp.right.data);
            q.add(temp.right);
          } else {
            System.out.print("null");

          }
        }
      }

      System.out.println("]");
    }
  }

  // returns the inorder successor of the tree
  public Node getInorderSuccessor(Node head) {
    while (head.left != null) {
      head = head.left;
    }
    return head;
  }

  // deletes the key from the tree and returns the root of the tree
  public Node delete(Node head, int key) {
    if (head == null) {
      return head;
    } else if (head.data < key) {
      head.right = delete(head.right, key);
      return head;
    } else if (head.data > key) {
      head.left = delete(head.left, key);
      return head;
    } else {
      if (head.left == null) {
        return head.right;
      } else if (head.right == null) {
        return head.left;
      } else {
        head.data = getInorderSuccessor(head.right).data;
        head.right = delete(head.right, head.data);
      }
    }
    return head;
  }

  public static void main(String[] args) {
    // test case
    BST tree = new BST();
    tree.insert(5);
    tree.insert(3);
    tree.insert(6);
    tree.insert(2);
    tree.insert(4);
    tree.insert(7);
    System.out.print("Input: ");
    tree.print();
    tree.setRoot(tree.delete(tree.getRoot(), 3));
    System.out.print("Output: ");
    tree.print();

  }

}