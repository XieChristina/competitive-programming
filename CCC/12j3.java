import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      for(int j=0;j<num;j++){
        System.out.print("*");
      }
      for(int k=0;k<num;k++){
        System.out.print("x");
      }
      for(int m=0;m<num;m++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int q=0;q<num;q++){
      for(int w=0;w<num;w++){
        System.out.print(" ");
      }
      for(int e=0;e<num*2;e++){
        System.out.print("x");
      }
      System.out.println();
    }
    for(int a=0;a<num;a++){
      for(int s=0;s<num;s++){
        System.out.print("*");
      }
      for(int d=0;d<num;d++){
        System.out.print(" ");
      }
      for(int f=0;f<num;f++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
