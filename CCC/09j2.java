import java.util.*;
public class OldFishinHole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int trout = sc.nextInt();
		int pike = sc.nextInt();
		int pikerel = sc.nextInt();
		int total = sc.nextInt();
		
		int count = 0;
		
		for(int i=0;i<=total/trout;i++) {
			for(int j=0;j<=total/pike;j++) {
				for(int k=0;k<=total/pikerel;k++) {
					if( (i*trout)+(j*pike)+(k*pikerel)<=total) {
						if(i==0 && j==0 && k== 0) {
							continue;
						}
						System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
						count++;
					}
				}
			}
		}
		
		System.out.println("Number of ways to catch fish: "+count);
		
	}

}
