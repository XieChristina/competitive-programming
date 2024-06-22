import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int time = sc.nextInt();
    int num = sc.nextInt();
    int[] n = new int[num];
    
    for(int i=0;i<num;i++){
      n[i] = sc.nextInt();
    }
    Arrays.sort(n);
    int count = 0;
    int number = 0;
    // String str = "";
    // for(int j=0;j<num;j++){
    //   str = str+(n[j]+"")+" ";
    // }
    // System.out.println(str);
    for(int k=0;k<num;k=k+1){
        // System.out.println("  "+(str.charAt(k)));
        number = number+(n[k]);
        // if(number>time){
        //   number = 0;
        // }
        if(number<=time){
            count = count+1;
        }
        //number = 0;
      
    }
    System.out.println(count);

  }
}
