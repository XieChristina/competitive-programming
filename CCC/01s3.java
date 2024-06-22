import java.io.*;
import java.util.*;
public class StrategicBombing {
	
	public static int graph[][];
	public static boolean visited[];
	
	public static void dfs(int curNode) {
		visited[curNode] = true;
//		if(curNode == 1) {
//			System.out.println("see it");
//		}
		for(int kid=0; kid<26; kid++) {
			if(graph[curNode][kid] == 1 && !visited[kid]) {
				dfs(kid);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = " ";
		graph = new int[26][26];
		visited = new boolean[26];
		for(int i=0;i<26;i++) {
			for(int j=0;j<26;j++) {
				graph[i][j] = 0;
			}
		}
		while(!s.equals("**")){
			s = br.readLine();
			if(s.equals("**")) {
				break;
			}
			char n = s.charAt(0);
			char m = s.charAt(1);
			graph[n-'A'][m-'A'] = 1;
			graph[m-'A'][n-'A'] = 1;
		}
//		for(int i=0;i<26;i++) {
//			for(int j=0;j<26;j++) {
//				System.out.print(graph[i][j]+" ");
//			}
//			System.out.println();
//		}
		int count = 0;
		for(int i=0;i<26;i++) {
			for(int j=0;j<i;j++) {
				if(graph[i][j] == 0) {
					continue;
				}
				graph[i][j] = 0;
				graph[j][i] = 0;
				dfs(0);   
//				for(int k=0;k<26;k++) {
//					System.out.print(visited[k]);
//					
//				}
				//System.out.println();
				if(!visited[1]) {
					count++;
					System.out.println((char)(i+'A')+""+(char)(j+'A'));
				}
				Arrays.fill(visited, false);
				graph[i][j] = 1;
				graph[j][i] = 1;
			}
		}
		System.out.println("There are "+count+" disconnecting roads.");
		
		
		
	}
}
