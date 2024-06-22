import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;

    for(int i=0;i<b;i++){
      for(int j=0;j<b;j++){
        if(a*i == b*j+1){
          ans = i;
        }
      }
    }
    if(ans == 0){
      System.out.println("No such integer exists.");
    }
    else{
      System.out.println(ans);
    }
  }
}
