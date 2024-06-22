import java.util.*;
public class CyclicShift {

	static String str;
	static String sub;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		
		str = sc.nextLine();
		sub = sc.nextLine();

		for(int i=0;i<sub.length();i++) {
			String front = sub.substring(0,i);
			String back = sub.substring(i);
			String stringy = back+front;
			set.add(stringy);
		}
		//System.out.println(set);
		boolean ans = false;
		String window = "";
		for(int i=0;i<=str.length()-sub.length();i++) {
			window = str.substring(i,i+sub.length());
			if(set.contains(window)) {
				ans = true;
				break;
			}
		}
		if(ans) {System.out.println("yes");}
		else { System.out.println("no");}
	}
}
