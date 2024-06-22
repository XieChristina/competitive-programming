import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++){
      b[i] = sc.nextInt();
    }
    Arrays.sort(b);
    
    if(q == 1){
      int count = 0;
      for(int i=0;i<n;i++){
        if(a[i]>b[i]){
          count = count+a[i];
        }
        else{
          count = count+b[i];
        }
      }
      System.out.println(count);
    }
    if(q == 2){
       int count = 0;
      for(int i=0, j=n-1;i<n && j>=0;i++,j--){
        if(a[i]>b[j]){
          count = count+a[i];
        }
        else{
          count = count+b[j];
        }
      }
      System.out.println(count);
    }
  }
}
