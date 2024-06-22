import java.util.*;
public class Snakesandladders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = -1;
		int count = 1;
		boolean quit = false;
		while(a != 0) {
			a = sc.nextInt();
			if(a == 0) {
				quit = true;
				break;
			}
			count += a;
			
			if(count == 9) count = 34;
			if(count  == 54) count = 19;
			if(count == 40) count = 64;
			if(count == 90) count = 48;
			if(count == 67) count = 86;
			if(count == 99) count = 77;
			if(count>100) count = count-a;
			
			System.out.println("You are now on square "+count);
			
			if(count == 100) {
				System.out.println("You Win!");
				break;
			}
		}
		if(quit) System.out.println("You Quit!");
		
	}

}
