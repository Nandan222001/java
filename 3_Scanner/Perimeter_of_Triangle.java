import java.util.*;
public class Perimeter_of_Triangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First side: ");
    int side1=sc.nextInt();
    System.out.print("Enter Second side: ");
    int side2=sc.nextInt();
    System.out.print("Enter Third side: ");
    int side3=sc.nextInt();
    int perimeter=side1+side2+side3;
    System.out.println("Perimeter of Triangle is: "+perimeter);
  }
}
