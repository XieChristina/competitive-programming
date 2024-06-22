import java.util.*;
public class Flipper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { {1,2},{3,4}};
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'H') {
				int a = arr[0][0];
				int b = arr[0][1];
				arr[0][0] = arr[1][0];
				arr[0][1] = arr[1][1];
				arr[1][0] = a;
				arr[1][1] = b;
			}
			if(str.charAt(i) == 'V') {
				int a = arr[0][0];
				int b = arr[1][0];
				arr[0][0] = arr[0][1];
				arr[1][0] = arr[1][1];
				arr[0][1] = a;
				arr[1][1] = b;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
