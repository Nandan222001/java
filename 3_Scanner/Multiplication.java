import java.util.*;
public class Multiplication {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a=sc.nextInt();
    System.out.print("Enter the Second Number: ");
    int b=sc.nextInt();
    int mult=a*b;
    System.out.println("Mulriplication: "+mult);
    sc.close();
  }
}
