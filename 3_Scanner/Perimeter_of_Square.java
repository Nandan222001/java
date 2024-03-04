import java.util.*;
public class Perimeter_of_Square {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter side: ");
    int side=sc.nextInt();
    int perimeter=4*side;
    System.out.println("Perimeter of Square: "+perimeter);
    sc.close();
  }
}
