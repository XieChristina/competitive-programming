import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    for(int i=0;i<num;i++){
      String s = sc.nextLine();
      method(s);
     
    }
    sc.close();
  }
  
  public static void method(String s){
    int count = 0;
    char ch = s.charAt(0);
    for(int k=0;k<s.length();k++){
      char ch2 = s.charAt(k);
      if(ch != ch2){
        System.out.print(count +" "+ch+" ");
        count = 0;
        ch = ch2;
      }
      count++;
    }
    System.out.print(count+" "+ch+" ");
    System.out.println();
  }
}
