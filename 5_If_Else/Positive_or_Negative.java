import java.util.*;
public class Positive_or_Negative {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    if(num>0) {
      System.out.println("It is a Positive Number.");
    }
    else {
      System.out.println("It is a Negative Number.");
    }
    sc.close();
  }
}