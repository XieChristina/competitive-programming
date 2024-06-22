import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int place = num1;
    int place2 = num2;
    int count = 0;
    while (num1>num2 || num2 == num1){
      count = count+1;
      num1 = num2;
      num2 = place-place2;
      place = num1;
      place2 = num2;
    
      //System.out.println(num2);

    }
    System.out.println(count+2);
  }
}
