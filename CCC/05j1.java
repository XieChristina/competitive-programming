import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
	  int eve = sc.nextInt();
		int week = sc.nextInt();
    double a;
    double b;
    if(day>100){
      a = ((day-100)*0.25) + (eve*0.15) + (week*0.20);
    }
    else{
      a = (eve*0.15) + (week*0.20);
    }
    if(day>250){
      b = ((day-250)*0.45) + (eve*0.35) + (week*0.25);
    }
    else{
      b = (eve*0.35) + (week*0.25);
    }
	
		
		if(a>b){
		  System.out.format("Plan A costs %.2f", a);
      System.out.println();
		   System.out.format("Plan B costs %.2f", b);
       System.out.println();
		  System.out.println("Plan B is cheapest.");
		}
		if(b>a){
		   System.out.format("Plan A costs %.2f", a);
       System.out.println();
		  System.out.format("Plan B costs %.2f", b);
      System.out.println();
		  System.out.println("Plan A is cheapest.");
		}
		if(b == a){
		   System.out.format("Plan A costs %.2f", a);
       System.out.println();
		   System.out.format("Plan B costs %.2f", b);
       System.out.println();
		  System.out.println("Plan A and B are the same price.");
}
	}
}
