import java.text.DecimalFormat;

public class Perimeter_of_Circle {
  public static void main(String[] args) {
    int radius=5;
    double pi=3.14, perimeter;
    perimeter=2*pi*radius;
    System.out.println("The perimeter of the circle is "+perimeter);

    DecimalFormat answerPerimeter = new perimeter("#.00");
    System.out.println(answerPerimeter.format(perimeter));
  }
  
}
