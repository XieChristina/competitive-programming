import java.util.*;
public class CoolNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
	     int b = sc.nextInt();
	     int count = 0;
	        for(int i=1; i*i*i*i*i*i<= b; i++) {
	            if(i*i*i*i*i*i>=a) count++;
	        }
	     System.out.println(count);
	}
		

	

}
