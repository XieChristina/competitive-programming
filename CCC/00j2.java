import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int num2 = sc.nextInt(); sc.close();
		int count = 0;
		for(int i = num; i <= num2; i++) {
			String st = i+"";
			int len = st.length();
			boolean flag = true;
			for(int ii = 0; ii <= len/2; ii++) {
				char ch = st.charAt(ii);
				char ch2 = st.charAt(len-ii-1);
				if(!((ch=='6'&&ch2=='9')||(ch=='9'&&ch2=='6')||(ch=='1'&&ch2=='1')||(ch=='0'&&ch2=='0')||(ch=='8'&& ch2=='8'))) {
					flag = false; break;
			    }
			}
			if(flag) count++;		
		}
		System.out.println(count);
	}
}
