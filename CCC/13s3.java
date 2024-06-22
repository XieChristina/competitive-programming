import java.util.*;

public class ChancesOfWinning2 {

	static int[] state = {12,13,14,23,24,34};
	static Set<Integer> visit = new HashSet<>();
	static int[] record = {0,0,0,0,0};
	static int count = 0;
	static int team;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		team = sc.nextInt();
		int games = sc.nextInt();
		for(int i=0;i<games;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ap = sc.nextInt();
			int bp = sc.nextInt();
			if( ap > bp) { record[a]+=3;}
			if( ap < bp) { record[b] += 3; }
			if( ap==bp) { record[a]+=1; record[b]+=1;}
			if( a>b) {visit.add( b*10+a);}
			else { visit.add(a*10+b);}
		}
		dfs(0);
		System.out.println(count);
	}
	
	public static void dfs(int next) {
		if( next >= 6) {  //base case, find who wins
			int largest = 0;
			int idx = 0;
			for(int i=1;i<5;i++) {
				if(i == team) continue;
				if(record[team]<=record[i]) return;
			}
			count++;
			return;
		}
		
		int A = state[next]/10;
		int B = state[next]%10;
		//System.out.println(A+" "+B);
		if(visit.contains(A*10+B) ) { dfs(next+1);return;}
		visit.add(A*10+B);
		record[A]+=3;
		dfs(next+1);
		record[A]-=3;
		record[B]+=3;
		dfs(next+1);
		record[B]-=3;
		record[A]+=1;
		record[B]+=1;
		dfs(next+1);
		record[A]-=1;
		record[B]-=1;
		visit.remove(A*10+B);
		return;
		
	}
}
