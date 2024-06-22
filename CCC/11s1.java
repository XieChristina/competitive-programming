import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int s = 0;
    int t = 0;
    for(int i=0;i<N;i++){
      String str = sc.nextLine();
      str = str.toLowerCase();
      for(int j=0;j<str.length()-1;j++){
        if(str.substring(j, j+1).equals("s")){
          s++;
        }
        if(str.substring(j, j+1).equals("t")){
          t++;
        }
      }
    }
    if(s>t){
            System.out.println("French");
          }
          else{
            System.out.println("English");
          }
	}

}
