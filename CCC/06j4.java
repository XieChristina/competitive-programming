import java.util.*;
public class Main {

  static Map<Integer, LinkedList<Integer>> map = new HashMap<>();
  static int[] indeg = new int[8];
  static PriorityQueue<Integer>qu = new PriorityQueue<>();
  static String str = "";
  static int count = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    map.put(1, new LinkedList<>());
    map.get(1).add(7);
    indeg[7]++;
    map.get(1).add(4);
    indeg[4]++;
    map.put(2, new LinkedList<Integer>());
		map.get(2).add(1);
		indeg[1]++;
		map.put(3, new LinkedList<Integer>());
		map.get(3).add(4);
		indeg[4]++;
		map.get(3).add(5);
		indeg[5]++;
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    while(x!=0 && y!=0){
      if(!map.containsKey(x)){
        map.put(x, new LinkedList<>());
      }
      map.get(x).add(y);
      indeg[y]++;
      x = sc.nextInt();
      y = sc.nextInt();
    }
    for(int i=1;i<indeg.length;i++){
      if(indeg[i] == 0){
        qu.add(i);
      }
    }
    DAG();
    if(count<7){
      System.out.println("Cannot complete these tasks. Going to bed.");
    }
    else{
      System.out.println(str);
    }

  }
  public static void DAG(){
    while(!qu.isEmpty()){
      int cur = qu.poll();
      count++;
      str += cur+" ";
      LinkedList<Integer> kids = map.get(cur);
      if(kids!=null){
        for(int kid: kids){
          indeg[kid]--;
          if(indeg[kid] == 0){
            qu.add(kid);
          }
        }
      }
    }
  }
}
