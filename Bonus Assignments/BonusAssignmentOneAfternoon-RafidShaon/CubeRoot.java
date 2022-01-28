import java.io.*;
import java.util.*;

class CubeRoot {
  static int cuberoot(int number) {
    int left = 1;
    int right = number;

    int ans = 0;
    while (left <= right) {

      int mid = left + (right - left) / 2;
      if (mid * mid * mid == number) {
        return mid;
      }

      if (mid * mid * mid < number) {
        left = mid + 1;
        ans = mid;
      } else {
        right = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int number = 27;
    System.out.println(cuberoot(number));
  }
}