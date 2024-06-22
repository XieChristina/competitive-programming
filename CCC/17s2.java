import java.util.*;
public class HighTideLowTide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Stack<Integer> low = new Stack<>();
		Queue<Integer> high = new LinkedList<>();
		
		int middle = (int) Math.ceil(N/2.0); //the decimal cutoff
		
		for(int i=0;i<middle;i++) {
			low.add(arr[i]);
		//	System.out.println(arr[i]);
		}

		//System.out.println();
		for(int i=middle;i<N;i++) {
			high.add(arr[i]);
		//	System.out.println(arr[i]);
		}
		int[] ans = new int[N];
		
		int highsize = high.size();
		int lowsize = low.size();
		int idx = 1;
		for(int i=0;i<highsize;i++) {
			//System.out.println(qu.peek());
			ans[idx] = high.peek();
			high.remove();
			idx += 2;
		}
		idx = 0;
		for(int i=0;i<lowsize;i++) {
			ans[idx] = low.peek();
			low.pop();
			idx += 2;
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
