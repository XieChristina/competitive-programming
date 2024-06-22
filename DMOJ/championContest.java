import java.util.*;

public class ChampionContest {
	
	public static class OrderPair implements Comparable<OrderPair>{
		int x;
		int y;
		
		public OrderPair(int x, int y){ 
			this.x = x; 
			this.y = y;
		}
		
		public int compareTo(OrderPair other) {
			if( x > other.x ) return 1;
			//if( x == other.x && y > other.y ) return 1;
			return -1;
		}
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int friend = sc.nextInt();
    	
    	int[] arr = new int[N];
    	OrderPair[] list = new OrderPair[N];
    	for( int k = 0 ; k<N; k++) {
    		int input = sc.nextInt();
    		list[k] = new OrderPair(input, k);
    		arr[k] = input;
    	}
    	
    	Arrays.sort( list );
    	
    	int[] result = new int[N];

    	result[ list[0].y ] = 0;

    	for(int k=1; k<N; k++){
    		if( list[k].x == list[k-1].x ){ result[ list[k].y ] = result[ list[k-1].y ]; }
    	        else{ result[ list[k].y ] = k ; }	
    	}
    	
// 
//    	for(int i=0;i<N;i++) {
//    		System.out.print(result[i]+" ");
//    	}
    	
    	for(int i=0;i<friend;i++) {
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		if(arr[b]>arr[a]) {result[b]--;}
    		else { result[a]--;}
    	}
    	
    	for(int i=0;i<N;i++) {
    		System.out.print(result[i]+" ");
    	}
    	
    }

}
