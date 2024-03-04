import java.util.*;
public class Perimeter_of_Rectangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Length: ");
    int length=sc.nextInt();
    System.out.print("Enter Breadth: ");
    int breadth=sc.nextInt();
    int perimeter=2*(length+breadth);
    System.out.println("Perimeter of Rectangle: "+perimeter);
    sc.close();
  }
}
