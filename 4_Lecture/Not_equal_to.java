import java.util.*;
public class Not_equal_to {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of x: ");
    int x=sc.nextInt();
    System.out.print("Enter the value of y: ");
    int y=sc.nextInt();
    System.out.println(x!=y);
    sc.close();
  }
}
