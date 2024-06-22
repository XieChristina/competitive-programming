import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=n+1;true;i++){
      if(d(i) == false){
        System.out.println(i);
        break;
      }
    }
    
    
  
  }

  public static boolean d(int year) {
      String sy = year+"";
      // if(sy.charAt(1) == sy.charAt(2)){
      //   return true;
      // }
      // if(sy.charAt(0) == sy.charAt(2)){
      //   return true;
      // }
      // if(sy.charAt(1) == sy.charAt(3)){
      //   return true;
      // }
      // if(sy.charAt(0) == sy.charAt(3)){
      //   return true;
      // }
      // if(sy.charAt(2) == sy.charAt(3)){
      //   return true;
      // }
      for(int k=0;k<sy.length()-1;k++){
        for(int j=k+1;j<sy.length();j++){
          if(sy.charAt(k) == sy.charAt(j)){
            return true;
          }
          
        }
        
      }
      return false;
  }
}

/// 31426526345642
