import java.util.*;
public class ANoisyClass {

	static int N;
	static int M;
	static int count;
	static int[] inDegree;
	static Map<Integer, LinkedList<Integer>> map = new HashMap<>();
	static Queue<Integer> qu = new LinkedList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		inDegree = new int[N+1];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			inDegree[b]++;
			if(!map.containsKey(a)) {
				map.put(a, new LinkedList<>());
			}
			map.get(a).add(b);
		}
		for(int i=1;i<inDegree.length;i++) {
			if(inDegree[i] == 0) {
				qu.add(i);
			}
		}
		DAG();
		if(count == N) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
	}
	public static void DAG() {
		while(!qu.isEmpty()) {
			int size = qu.size();
			for(int i=0;i<size;i++) {
				int cur = qu.poll();
				count++;
				LinkedList<Integer> kids = map.get(cur);
				if(kids!=null) {
					for(int kid: kids) {
						inDegree[kid]--;
						if(inDegree[kid] == 0) {
							qu.add(kid);						
						}
					}
				}
			}
		}
	}

}
