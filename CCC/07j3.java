import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] n = new int[num];
    for(int i=0;i<num;i++){
      n[i] = sc.nextInt();
    }
    int offer = sc.nextInt();
    if(num == 5){
        System.out.println("no deal");
    }
    else{
    HashMap<Integer, Integer > map = new HashMap<>();
    map.put(1, 100);
    map.put(2, 500);
    map.put(3, 1000);
    map.put(4, 5000);
    map.put(5, 10000);
    map.put(6, 25000);
    map.put(7, 50000);
    map.put(8, 100000);
    map.put(9, 500000);
    map.put(10, 1000000);
    int total = 100+500+1000+5000+10000+250000+500000+100000+500000+1000000;
    //int total = 1691600;
    int average = 0;
    int t = 0;
    for(int i=0;i<num;i++){
      t = t+map.get(n[i]);
      average = average+(t);
    }
    int a = total-average;
    a = a/(10-num);
    if(a<offer){
      System.out.println("deal");
    }
    else{
      System.out.println("no deal");
    }
    }
  }
}
