import java.util.*;
public class IsItATree {

  public static LinkedList<Integer>graph[];
  public static boolean visited[];
  
  public static void dfs(int curNode){
      visited[curNode] = true;
      for(int child: graph[curNode]){
          if(!visited[child]){
              dfs(child);
          }
      }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    graph = new LinkedList[4];
    visited = new boolean[4];

    for(int i=0;i<4;i++){
        graph[i] = new LinkedList<Integer>();
        visited[i] = false;
    }

    int count = 0;

    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            int num = sc.nextInt();
            if(num == 1){
                graph[i].add(j);
                graph[j].add(i);
                count++;
            }
        }
    }
    count = count/2;
    if(count != 3){
        System.out.println("No");
        return;
    }
    dfs(0);
    for(int i=0;i<4;i++){
        if(!visited[i]){
            System.out.println("No");
            return;
        }
    }
    System.out.println("Yes");
  }
}
