package Pattern;
import java.util.*;
public class Star_Pattern_1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    int i = 1;
    sc.close();

    while (i<=rows) {
      int j = 1;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      i++;
      System.out.println();
    } 
  }
}
