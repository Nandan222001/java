import java.util.*;
public class doller_to_rupees {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Dollers: ");
    int doller=sc.nextInt();
    float rupees=doller*83;
    if(doller==1) {
      System.out.println("$"+doller+" US Doller means "+rupees+" RS Indian Rupees.");
    }
    else {
      System.out.println("$"+doller+" US Dollers means "+rupees+" RS Indian Rupees.");
    }
    sc.close();
  }
  
}
