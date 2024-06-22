import java.util.*;
public class Ragaman {
	static int[] afreq;
	static int[] bfreq;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		afreq = new int[256];
		bfreq = new int[256];
		String a = sc.next();
		String b = sc.next();
		for(int i=0;i<a.length();i++) {
			afreq[a.charAt(i)]++;	//automatically converted to int
		}
		for(int i=0;i<b.length();i++) {
			bfreq[b.charAt(i)]++;	//what she said there
		}
		int count = 0;	//total difference
		for(int i=0;i<256;i++) {
			if(i!=(int)('*')) {
				if(afreq[i] != bfreq[i]) {
					count += Math.abs(afreq[i]-bfreq[i]);
				}
			}		
		}
		String ans = "N";
		if(count == bfreq['*']) System.out.println("A");
		else System.out.println(ans);

	}

}
