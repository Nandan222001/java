import java.util.*;
public class Division {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a=sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b=sc.nextInt();
    double div=a/b;
    System.out.println("Division: "+div);
    sc.close();
  }
}
