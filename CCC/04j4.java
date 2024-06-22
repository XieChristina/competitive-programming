import java.util.*;
public class SimpleEncryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		String str = sc.nextLine();
		String newstr = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch<= 'Z') {newstr +=ch;}
		}
		int len = key.length();
		for(int i=0;i<newstr.length();i++) {
			char ch = newstr.charAt(i);
			char keych = key.charAt(i%len);
			char newch = (char)(((ch-'A')+(keych-'A'))%26+'A');
			System.out.print(newch);
		}

	}

}
