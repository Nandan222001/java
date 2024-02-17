import java.util.*;

public class Perfect_Number {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int num = sc.nextInt();
    int temp = num;
    int i=1,sum=0;
    sc.close();

    while(i<num) {
      if(num%i==0)
      {
          sum=sum+i;
      }
      i++;
    }

    if (temp == sum) {
      System.out.println(""+temp+" is a Perfect Number.");
    }
    else {
      System.out.println(""+temp+" is not a Perfect Number.");
    }
    
  }
}
