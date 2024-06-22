import java.util.*;
public class PenniesInTheRing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		
	    while(rad != 0){
	      int count = 0;
	      
	      for(int x=1; x<=rad; x++){
	        for(int y=1;(x*x)+(y*y)<=(rad*rad);y++) {
	        	count++;
	        }
	      }
	      
	      System.out.println((count*4)+(rad*4)+1);
	      rad = sc.nextInt();
	    }
	}

}
