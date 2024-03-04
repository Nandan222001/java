import java.util.*;
public class Area_of_square {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Side: ");
    int side=sc.nextInt();
    int area=side*side;
    System.out.print("Area of Square: "+area);
    sc.close();
  }
}
