import java.util.*;
public class KnightHop { //https://dmoj.ca/problem/ccc10j5
	
	static int[][] move = {{2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1}};
	static int[][] grid = new int[9][9];
	static boolean[] visited;
	static Map<Integer, LinkedList<Integer>> map;
	static int start;
	static int end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startx = sc.nextInt();
		int starty = sc.nextInt();
		int endx = sc.nextInt();
		int endy = sc.nextInt();
		
		start = startx*8+starty;
		end = endx*8+endy;
		visited = new boolean[80];
		map = new HashMap<>();
		
		Arrays.fill(visited, false);
		for(int i=1;i<9;i++) {
			for(int j=1;j<9;j++) {
				map.put(i*8+j, new LinkedList<Integer>());
			}
		}
		
		for(int i=1;i<9;i++) {
			for(int j=1;j<9;j++) {
				for(int x=0;x<8;x++) {
					int nr = i+move[x][0];
					int nc = j+move[x][1];
					if( nr<1||nr>=9||nc<1||nc>=9) continue;
					map.get(i*8+j).add(nr*8+nc);
				}
			}
		}
		if(start == end) { System.out.println(0);}
		else{
			int steps = BFS();
			System.out.println(steps);
		}
	}
	public static int BFS(){
	    Queue<Integer> qu = new LinkedList<Integer>();
	    qu.add(start);
	    visited[start] = true;
	    int level = 0;
	    while(!qu.isEmpty()) {
	    	int size = qu.size();
	    	level++;
	    	for(int i=0;i<size;i++) {
	    		int cur = qu.poll();
	    		LinkedList<Integer> kids = map.get(cur);
	    		for(int kid:kids) {
	    			if(visited[kid]) continue;
	    			if(kid == end) return level;
	    			qu.add(kid);
	    			visited[kid] = true;
	    		}
	    	}
	    }
	    return level;
	}
}
