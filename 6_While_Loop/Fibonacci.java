// import java.util.*;

public class Fibonacci {
  public static void main(String[] args) {
    int i = 0;
    int n = 10;
    int num1 = 0, num2 = 1;
    while (i<10) {
      int num3 = num2 + num1;
      num2 = num3;
      num1 = num2;
      System.out.println(num3);
      i++;
    }
  }
  
}