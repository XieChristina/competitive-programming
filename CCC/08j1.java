import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double b = sc.nextDouble();
    double bb = b*b;
    double aa = a/bb;
    if(aa>25){
      System.out.println("Overweight");
    }
    if(aa>=18.5&& aa<=25){
      System.out.println("Normal weight");
    }
    if(aa<18.5){
      System.out.println("Underweight");
    }

    }
  }
