import java.util.*;
public class TheSumGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] sum1 = new int[N];
		int[] sum2 = new int[N];
		int count = 0;
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			sum1[i] = num+count;
			count = sum1[i];
		}
		count = 0;
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			sum2[i] = num+count;
			count = sum2[i];
		}

		
		int ans = 0;
		for(int i=N-1;i>=0;i--) {
			if(sum1[i] == sum2[i]) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);

	}

}
