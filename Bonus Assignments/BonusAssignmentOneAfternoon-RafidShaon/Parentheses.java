import java.util.Scanner;

public class Parentheses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    BalancedParentheses bp = new BalancedParentheses();
    System.out.println(bp.hasBalancedParentheses(input));
  }
}

class BalancedParentheses {
  public boolean hasBalancedParentheses(String input) {
    int count = 0;
    char ch;
    for (int i = 0; i < input.length(); i++) {
      ch = input.charAt(i);
      if (ch == '(') {
        count++;
      } else if (ch == ')') {
        if (count == 0) {
          return false;
        }
        count--;
      }
    }
    return count == 0;
  }
}