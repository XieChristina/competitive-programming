import java.util.*;
public class Main {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();

    String[] aa = a.split(" ");
    String[] bb = b.split(" ");

    String q = "";
    String w = "";

    for(int i=0;i<aa.length;i=i+1){
        q = q+ aa[i];
    }
    for(int i=0;i<bb.length;i=i+1){
        w = w+ bb[i]; 
    }
    for(int i=0;i<q.length();i++){
      if(map.containsKey(q.charAt(i))){
        int beee = map.get(q.charAt(i));
        map.replace(q.charAt(i), beee, beee+1);
      }
      else{
        map.put(q.charAt(i), 1);
      }
    }
    boolean y;
    for(int i=0;i<w.length();i++){
      if(map.containsKey(w.charAt(i))){
        int bee = map.get(w.charAt(i));
        map.replace(w.charAt(i), bee, bee+1);
        y = true;
      }
      else{
        y = false;
        System.out.println("Is not an anagram.");
        return;
      }
    }

    for(int i=0;i<q.length();i++){
      int hello = map.get(q.charAt(i));
      if(hello%2 ==0){
         y = true;
      }
      if(hello%2 !=0){
        System.out.println("Is not an anagram.");
        return;
      }
    }
    if(y = true){
      System.out.println("Is an anagram.");
    }

    sc.close();

    
  }
}
