import java.util.*;
public class S102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int G = sc.nextInt();
		int R = sc.nextInt();
		int O = sc.nextInt();
		int sum = sc.nextInt();
		
		int count = 0;
		int min = 999999999;
		
		for(int i=0;i<=sum/P;i++) {
			for(int j=0;j<=sum/G;j++) {
				for(int k=0;k<=sum/R;k++) {
					for(int l=0;l<=sum/O;l++) {
						if((i*P)+(j*G)+(k*R)+(l*O) == sum) {
							System.out.println("# of PINK is "+i+" # of GREEN is "+j+" # of RED is "+k+" # of ORANGE is "+l);
							count++;
							if(i+j+k+l<min) min = i+j+k+l;
						}
					}
				}
			}
		}
		System.out.println("Total combinations is "+count+".");
		System.out.println("Minimum number of tickets to print is "+min+".");

	}

}
