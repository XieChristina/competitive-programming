import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
    for(int row=0; row<=n/2; row=row+1){
		  for(int star=0; star<2*row+1; star++){
			  System.out.print("*");	
		  }
		  for(int space=0; space<n*2-(4*row+2); space++){
			  System.out.print(" ");
		  }
		  for(int star=0; star<2*row+1; star++){
			  System.out.print("*");
		  }
		System.out.println();
		}
		for(int row=n/2-1; row>=0; row=row-1){
		  for(int star=0; star<2*row+1; star++){
			  System.out.print("*");	
		  }
		  for(int space=0; space<n*2-(4*row+2); space++){
			  System.out.print(" ");
		  }
		  for(int star=0; star<2*row+1; star++){
			  System.out.print("*");
		  }
		  System.out.println();
		}
  }
}
