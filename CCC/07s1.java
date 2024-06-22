import java.util.*;
public class FederalVotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] n = new int[num][3];
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				n[i][j]	 = sc.nextInt();
			}
		}
		
		for(int i=0;i<num;i++) {
			int age = 2007-n[i][0];
			
			if(age<18) {
				System.out.println("No");
			}
			else if(age>18) {
				System.out.println("Yes");
			}
			else if(age == 18) {
				if(n[i][1] < 2) {
					System.out.println("Yes");
				}
				else if(n[i][1] == 2) {
					if(n[i][2] <= 27) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}
				
				else {
					System.out.println("No");
				}
			}
			
		}
		
	}

}
