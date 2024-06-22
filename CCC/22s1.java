import java.util.*;
public class S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=0;i<=num/4;i++) {
			if((num-(4*i))%5 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
