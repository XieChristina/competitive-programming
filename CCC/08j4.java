import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      String input = sc.nextLine();
      if(input.equals("0")) break;
      Stack<String> stack = new Stack<>();
      String[] r  = input.split(" ");
      if(r.length == 1){
        System.out.println(r[0]);
        continue;
      }

      for(int k = r.length-1;k>=0;k--){
        if(r[k].equals("+")|| r[k].equals("-")){
          String x = stack.pop();
          String y = stack.pop();
          stack.push( x+ " "+y+" "+r[k]);

        }
        else{
          stack.push(r[k]);
        }
    }
    System.out.println(stack.pop());
  }
    
}
}
