import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String[] n = new String[num];

    for(int i=0;i<num;i++){
      n[i] = sc.next();
    }
    String[] m = new String[num];

    for(int i=0;i<num;i++){
      m[i] = sc.next();
    } 

    int count = 0;
    for(int i=0;i<num;i++){
      if(n[i].equals(m[i]) ){
        count = count+1;
      }
    }
    System.out.println(count);
  }
}
