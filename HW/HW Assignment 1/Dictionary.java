import java.lang.UnsupportedOperationException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Dictionary {
  public static final String MIN_METHOD_NAME = "MIN";
  public static final String MAX_METHOD_NAME = "MAX";
  public static final String RANGE_METHOD_NAME = "RANGE";
  public static final String AVERAGE_METHOD_NAME = "AVERAGE";
  public static final String MODE_METHOD_NAME = "MODE";

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    String methodName = sc.nextLine();

    int numWords = Integer.parseInt(sc.nextLine());

    String[] words = new String[numWords];
    for (int i = 0; i < numWords; i++) {
      words[i] = sc.nextLine();
    }

    switch (methodName) {
      case MIN_METHOD_NAME:
        System.out.println(minWordLength(words));
        break;
      case MAX_METHOD_NAME:
        System.out.println(maxWordLength(words));
        break;
      case RANGE_METHOD_NAME:
        System.out.println(wordLengthRange(words));
        break;
      case AVERAGE_METHOD_NAME:
        System.out.println(averageWordLength(words));
        break;
      case MODE_METHOD_NAME:
        System.out.println(mostCommonWordLength(words));
        break;
      default:
        throw new UnsupportedOperationException();
    }
  }

  public static int minWordLength(String[] words) {
    int min = words[0].length();
    for (int i = 1; i < words.length; i++) {
      if (words[i].length() < min) {
        min = words[i].length();
      }
    }
    return min;
  }

  public static int maxWordLength(String[] words) {
    int max = words[0].length();
    for (int i = 1; i < words.length; i++) {
      if (words[i].length() > max) {
        max = words[i].length();
      }
    }
    return max;
  }

  public static int wordLengthRange(String[] words) {
    return 0;
  }

  public static String averageWordLength(String[] words) {
    double sum = 0;
    for (int i = 0; i < words.length; i++) {
      sum += words[i].length();
    }
    double average = sum / words.length;
    DecimalFormat df = new DecimalFormat("####0.00");
    return String.valueOf(df.format(average));
  }

  public static int mostCommonWordLength(String[] words) {
    int a[] = new int[maxWordLength(words) + 1];
    for (int i = 0; i < a.length; i++) {
      a[i] = 0;
    }
    for (String i : words) {
      a[i.length()] = a[i.length()] + 1;
    }
    int max = a[0];
    int index = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
        index = i;
      }
    }
    int maxCount = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == max)
        maxCount++;
    }
    if (maxCount > 1)
      return -1;
    return index;
  }
}