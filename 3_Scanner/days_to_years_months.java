import java.util.*;
public class days_to_years_months {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Days: ");
    int days=sc.nextInt();

    float years=days/365;
    float months=years*12;
    int weeks=days/7;

    System.out.println("Days   : "+days);
    System.out.println("Years  : "+years);
    System.out.println("Months : "+months);
    System.out.println("Weeks  : "+weeks);
    sc.close();
  }
}
