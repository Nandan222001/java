import java.util.*;
public class Area_of_Triangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Base: ");
    int base=sc.nextInt();
    System.out.println("Enter Height: ");
    int height=sc.nextInt();
    int area=(base+height)/2;
    System.out.println("Area of Triangle: "+area);
  }
}
