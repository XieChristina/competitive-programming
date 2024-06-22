import java.util.*;
public class PrettyAveragePrimes {
	static int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int num = sc.nextInt();
			for(int j=num;j>=2;j--) {
				int a = j;
				int b = 2*num-j;
				if(isprime(j) && isprime(b)) {
					System.out.println(j+" "+b);
					break;
				}
			}
		}
	}
	public static boolean isprime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if (num % i == 0) {
		        return false;
		    }
		}
		return true;
	}
}
