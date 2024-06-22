import java.util.Scanner;

public class CCC21J4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int numL = 0;
		int numM = 0;
		int numS = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'L') {
				numL++;
			}
			
			if (input.charAt(i) == 'M') {
				numM++;
			}
			
			if( input.charAt(i)=='S') {
				numS++;
			}
		}
		int SinL = 0;
		int MinL = 0;
		int SinM = 0;
		int LinM = 0;
		int MinS = 0;
		int LinS = 0;
		for (int i = 0; i < numL; i++) {
			if (input.charAt(i) == 'M') {
				MinL++;
			}
			if (input.charAt(i) == 'S') {
				SinL++;
			}
		}
		for (int i = numL; i < numL+numM; i++) {
			if (input.charAt(i) == 'L') {
				LinM++;
			}
			if (input.charAt(i) == 'S') {
				SinM++;
			}
		}
		for (int i = numL+numM; i < input.length(); i++) {
			if (input.charAt(i) == 'L') {
				LinS++;
			}
			if (input.charAt(i) == 'M') {
				MinS++;
			}
		}	
		
		int counter = 0;
		int rightL = numL - SinL - MinL;
		int swappedL = 0;
		int min = Math.min(SinL,LinS);
		counter += min;
		swappedL += min;
		min = Math.min(MinL,LinM);
		counter += min;
		swappedL += min;
		min = Math.min(SinM,MinS);
		counter += min;
		
		counter += (numL - rightL - swappedL) * 2;
		System.out.println(counter);
	}
}
