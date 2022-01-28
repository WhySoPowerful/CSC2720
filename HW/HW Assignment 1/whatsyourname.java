import java.util.*;

public class whatsyourname {

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("What is your name? ");
      String fname = input.nextLine();
      while (fname.equals("")) {

        System.out.print("What is your name? ");
        fname = input.nextLine();
      }

      System.out.print("Hello, " + fname + "!");
      System.out.println();
    }
  }
}