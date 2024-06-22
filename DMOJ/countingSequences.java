import java.util.*;
public class CountingSequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		
		int[] dp = new int[n+1];
		int[] letter = new int[26];
		
		for(int k=1;k<=n;k++) {
			dp[k]=2*dp[k-1];
			
			char ch = s.charAt(k-1);
			if(letter[ch-97] != 0) {
				dp[k] -= dp[ letter[ch-97] -1];
			}
			else {
				dp[k] +=1;
			}
			letter[ch-97]=k; 
			dp[k] %= 10007;
		}

		
		System.out.println(dp[n]);
		
		
	}

}
