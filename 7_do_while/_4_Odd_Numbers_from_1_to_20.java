public class _4_Odd_Numbers_from_1_to_20 {
  public static void main(String[] args) {
    int i = 1;
    do {
      if(i%2!=0)  //(i%2==1) this condition is also true.
      {
        System.out.println(i);
      }
      i++;
    } while (i <= 20);
  }
}

