import java.util.*;
public class Fix {	//https://dmoj.ca/problem/ccc04s1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		boolean fix = false;
		for(int i=0;i<N;i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			fix = contains(a, b, c);
			if(fix) System.out.println("Yes");
			else System.out.println("No");
			fix = false;
		}
	}
	
	public static boolean contains(String a, String b, String c) {
		int lena = a.length();
		int lenb = b.length();
		int lenc = c.length();
		if(a.contains(b)) {
			if(a.substring(0, lenb).equals(b)) return false;
			if(a.substring(lena-lenb).equals(b)) return false;
		}
		if(b.contains(a)) {
			if(b.substring(0, lena).equals(a)) return false;
			if(b.substring(lenb-lena).equals(a)) return false;
		}
		if(a.contains(c)) {
			if(a.substring(0, lenc).equals(c)) return false;
			if(a.substring(lena-lenc).equals(c)) return false;
		}
		if(c.contains(a)) {
			if(c.substring(0, lena).equals(a)) return false;
			if(c.substring(lenc-lena).equals(a)) return false;
		}
		if(b.contains(c)) {
			if(c.substring(0, lenc).equals(c)) return false;
			if(c.substring(lenb-lenc).equals(c)) return false;
		}
		if(c.contains(b)) {
			if(c.substring(0, lenb).equals(b)) return false;
			if(c.substring(lenc-lenb).equals(b)) return false;
		}
		return true;
	}


}
