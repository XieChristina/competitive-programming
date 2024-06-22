import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i=0;i<=5;i++) {
			if(N-i<=5 && N-i>=i) count++;
		}
		System.out.println(count);
	}

}
