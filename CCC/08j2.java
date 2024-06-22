import java.util.*;
public class DoTheShuffle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    String str = "ABCDE";
		    
		    for(int a=0;true;a=a+1){
		      int k = sc.nextInt();
		      int n= sc.nextInt();
		      if(n==1 && k==4){
		        break;
		      }
		    
		      if(k==1){
		        for(int j=0;j<n;j++){
		          char ch1 = str.charAt(0);
		          String str1 = str.substring(1,5);
		          str = str1+ch1;
		        }
		      }
		      else if(k == 2){
		        for(int i=0;i<n;i++){
		        char ch = str.charAt(4);
		        String str2 = str.substring(0,4);
		        str = ch+str2;
		        }
		      }
		      else if(k == 3){
		        for(int m=0;m<n;m++){
		        char ch2 = str.charAt(0);
		        char ch3 = str.charAt(1);
		        String str3 = str.substring(2,5);
		        str = ""+ch3+ch2+str3;
		        }
		      }
		      
		    }
		    //String[] strr = new String[5];
		    for(int b=0;b<5;b++){
		      
		      char ch = str.charAt(b);
		      System.out.print(ch+ " ");
		    }
		    
	}

}
