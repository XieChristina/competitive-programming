import java.util.*;
public class Itscoldhere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		String s = "";
		int current =10000;
		while(!s.equals( "Waterloo")) {
			s = sc.next();
			int N = sc.nextInt();
			map.put(N, s);
			sc.nextLine();
			if(N<current) current = N;
		}
		System.out.println(map.get(current));
		

	}

}
