import java.util.*;
public class ZeroThatOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int a = sc.nextInt();
			if(a != 0) {
				st.add(a);
			}
			else {
				st.pop();
			}
		}
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.peek();
			st.pop();
		}
		System.out.println(sum);
	}

}
