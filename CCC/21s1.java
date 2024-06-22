import java.util.Scanner;
public class CrazyFencing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N+1];
		int[] w = new int[N+1];
		
		for(int i=0;i<N+1;i++) {
			h[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			w[i] = sc.nextInt();
		}
		
		double total = 0.0;
		for(int i=0;i<N;i++) {
			total += (w[i]*(h[i]+h[i+1]))/2.0;
			//System.out.println(total+" " +w[i]+" "+h[i]+" "+h[i+1]);
		}
		
		System.out.println(total);
	}

}
