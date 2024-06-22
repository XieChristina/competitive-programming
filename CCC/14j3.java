import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p1 = 100;
    int p2 = 100;
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      int r1 = sc.nextInt();
      int r2 = sc.nextInt();
      if(r1<r2){
        p1 = p1-r2;
      }
      if(r2<r1){
        p2=p2-r1;
      }
      continue;
    }
    System.out.println(p1);
    System.out.println(p2);
  }
}
