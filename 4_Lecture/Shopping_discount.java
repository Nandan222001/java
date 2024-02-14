import java.util.*;
public class Shopping_discount {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount spend: ");
    float spend=sc.nextInt();
    if(spend<1000 && spend>=500) {
      float discount=(spend*10)/100;
      System.out.println("You will get 10% discount.");
      System.out.println("Discounted amount: "+discount+" rs");
      System.out.println("Final amount: "+(spend-discount)+" rs");
    }
    else if(spend>=1000 && spend<10000) {
      float discount=(spend*20)/100;
      System.out.println("You will get 20% discount.");
      System.out.println("Discounted amount: "+discount+" rs");
      System.out.println("Final amount: "+(spend-discount)+" rs");
    }
    else if(spend>10000 && spend<20000) {
      float discount=(spend*20)/100;
      System.out.println("You will get 20% discount.");
      System.out.println("Discounted amount: "+discount+" rs");
      System.out.println("Final amount: "+(spend-discount)+" rs");
    }
    else if(spend>20000 && spend<40000) {
      float discount=(spend*25)/100;
      System.out.println("You will get 35% discount.");
      System.out.println("Discounted amount: "+discount+" rs");
      System.out.println("Final amount: "+(spend-discount)+" rs");
    }
    else {
      System.out.println("You will get no discount.");
      System.out.println("Final amount: "+spend+" rs");
    }
  }
}
