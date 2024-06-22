import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = "";
    while(true) {
      
      a = sc.next();
      if( a.equals("halt")){ break;}
      method(a);
    }
    sc.close();
  }
  public static void method(String a){
    HashMap<Character,Integer> map = new HashMap<>();
    
      map.put('a', 1);
      map.put('b', 1);
      map.put('c', 1);
      map.put('d', 2);
      map.put('e', 2);
      map.put('f', 2);
      map.put('g', 3);
      map.put('h', 3);
      map.put('i', 3);
      map.put('j', 4);
      map.put('k', 4);
      map.put('l', 4);
      map.put('m', 5);
      map.put('n', 5);
      map.put('o', 5);
      map.put('p', 6);
      map.put('q', 6);
      map.put('r', 6);
      map.put('s', 6);
      map.put('t', 7);
      map.put('u', 7);
      map.put('v', 7);
      map.put('w', 8);
      map.put('x', 8);
      map.put('y', 8);
      map.put('z', 8);
    HashMap<Character, Integer> map2 = new HashMap<>();
    
      map2.put('a', 1);
      map2.put('b', 2);
      map2.put('c', 3);
      map2.put('d', 1);
      map2.put('e', 2);
      map2.put('f', 3);
      map2.put('g', 1);
      map2.put('h', 2);
      map2.put('i', 3);
      map2.put('j', 1);
      map2.put('k', 2);
      map2.put('l', 3);
      map2.put('m', 1);
      map2.put('n', 2);
      map2.put('o', 3);
      map2.put('p', 1);
      map2.put('q', 2);
      map2.put('r', 3);
      map2.put('s', 4);
      map2.put('t', 1);
      map2.put('u', 2);
      map2.put('v', 3);
      map2.put('w', 1);
      map2.put('x', 2);
      map2.put('y', 3);
      map2.put('z', 4);
    int count = 0;
    int len = a.length();

    for(int k=0;k<len;k++){
      count = count + map2.get( a.charAt(k));
      if(k>0 && (map.get( a.charAt(k-1) ) == map.get( a.charAt(k)) ) ) {
        count = count+2;
    }
  }
  System.out.print(count);
    System.out.println(); 
    count = 0;
}
}

// Map group

// 'a' -> 1
// 'b' -> 1
// 'c' -> 1
// 'd' -> 2

// m.get(ch) == m.get(ch2) 

// Map delay 
// 'a' -> 1
// 'b' -> 2
// 'c' -> 3
