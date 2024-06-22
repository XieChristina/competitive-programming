import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] row = new int[M];
    int[] col = new int[N];

    Arrays.fill(row, 0);
    Arrays.fill(col,0);

    sc.nextLine();

    for(int i=0;i<K;i++){
      String[] s = sc.nextLine().split(" ");
      String str = s[0];
      int num = Integer.parseInt(s[1]);

      if(str.equals("R")){
        row[num-1]++;
      }
      else{
        col[num-1]++;
      }
    }  

    int count = 0;
    for(int i=0;i<M;i++){
      for(int j=0;j<N;j++){
        if((row[i]+col[j])%2 != 0){
          count++;
        }
      }
    }

    System.out.println(count);

  }
}
