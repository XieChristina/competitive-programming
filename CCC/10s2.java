import java.util.*;
public class HuffmanEncoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			String a = sc.next();
			String b = sc.next();
			sc.nextLine();
			map.put(b, a);
		}
		String str = sc.nextLine();
		String t = "";
		for(int i=0;i<str.length();i++) {
			t = t+ str.charAt(i);
			if(map.containsKey(t)) {
				System.out.print(map.get(t));
				t="";
			}

		}
		sc.close();
	}
	

}
