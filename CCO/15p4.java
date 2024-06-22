import java.util.*;
public class CarsOnIce {
	static int N;
	static int M;
	static String[][] arr;
	static int[] inDegree;
	static int max;
	static Queue<Integer> qu = new LinkedList<>();
	//static Map<Integer, LinkedList<Integer>> map = new HashMap<>();
	static ArrayList<LinkedList<Integer>> map ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		max = Math.max(N, M);
		inDegree = new int[N*max+M];
		arr = new String[N][M];
		map = new ArrayList<>(M*N);
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = s.charAt(j)+"";
				map.add(i*max+j, new LinkedList<Integer>() );
				//if(!arr[i][j].equals(".")) {
				//	if(!map.containsKey(i*max+j)) {
				//		map.put(i*max+j, new LinkedList<Integer>());
				//	}
				//}
			}
		}
		
		int idx = -1;
		for(int j=0;j<N;j++) {
			for(int i=M-1;i>=0;i--) {	//W
				if(arr[j][i].equals("W")) {
					if(idx != -1) {
						map.get(max*j+i).add(idx);
						inDegree[idx]++;
					}
					idx = max*j+i;
				}
				else if(idx != -1 && !arr[j][i].equals(".")) {
					map.get(max*j+i).add(idx);
					inDegree[idx]++;
				}
			}
			idx = -1;
		}

		for(int j=0;j<N;j++) {
			for(int i=0;i<M;i++) {	//E
				if(arr[j][i].equals("E")) {
					if(idx != -1) {
						map.get(max*j+i).add(idx);
						inDegree[idx]++;
					}
					idx = max*j+i;
				}
				else if(idx != -1 && !arr[j][i].equals(".")) {
					map.get(max*j+i).add(idx);
					inDegree[idx]++;
				}
			}
			idx = -1;
		}
		
		for(int j=0;j<M;j++) {
			for(int i=N-1;i>=0;i--) {	//N
				if(arr[i][j].equals("N")) {
					if(idx != -1) {
						map.get(max*i+j).add(idx);
						inDegree[idx]++;
					}
					idx = max*i+j;
				}
				else if(idx != -1 && !arr[i][j].equals(".")) {
					map.get(max*i+j).add(idx);
					inDegree[idx]++;
				}
			}
			idx = -1;
		}
		
		for(int j=0;j<M;j++) {
			for(int i=0;i<N;i++) {	//S
				if(arr[i][j].equals("S")) {
					if(idx != -1) {
						map.get(max*i+j).add(idx);
						inDegree[idx]++;
					}
					idx = max*i+j;
				}
				else if(idx != -1 && !arr[i][j].equals(".")) {
					map.get(max*i+j).add(idx);
					inDegree[idx]++;
				}
			}
			idx = -1;
		}

		for(int i=0;i<map.size();i++){
			if(inDegree[i] == 0 && !arr[i/max][i%max].equals(".")) {
				qu.add(i);
			}
		}
		DAG();
	}
	public static void DAG() {
		while(!qu.isEmpty()) {
				int cur = qu.poll();
				System.out.println("("+cur/max+","+cur%max+")");
				LinkedList<Integer> kids = map.get(cur);
				if(kids==null) { continue;} 
				for(int kid: kids) {
					inDegree[kid]--;
					if(inDegree[kid] == 0) {qu.add(kid);}						
						
				}
			}

    }
}
