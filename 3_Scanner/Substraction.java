import java.util.*;
public class Substraction {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the First Number: ");
    int a=sc.nextInt();
    System.out.print("Enter the Second Number: ");
    int b=sc.nextInt();
    int sub=a-b;
    System.out.println("Sub: "+sub);
    sc.close();
  }
}
