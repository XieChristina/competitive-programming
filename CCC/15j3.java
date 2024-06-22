import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //abcdefghijklmnopqrstuvwxyz
    HashMap<Character, Character> m = new HashMap<>();
    m.put('a', 'b');
    m.put('b', 'c');
    m.put('c', 'd');
    m.put('d', 'f');
    m.put('f', 'g');
    m.put('g', 'h');
    m.put('h', 'j');
    m.put('j', 'k');
    m.put('k', 'l');
    m.put('l', 'm');
    m.put('m', 'n');
    m.put('n', 'p');
    m.put('p', 'q');
    m.put('q', 'r');
    m.put('r', 's');
    m.put('s', 't');
    m.put('t', 'v');
    m.put('v', 'w');
    m.put('w', 'x');
    m.put('x', 'y');
    m.put('y', 'z');
    m.put('z', 'z');
    HashMap<Character, Character> map = new HashMap<>();
    map.put('b', 'a');
    map.put('c', 'a');
    map.put('d', 'e');
    map.put('f', 'e');
    map.put('g', 'e');
    map.put('h', 'i');
    map.put('j', 'i');
    map.put('k', 'i');
    map.put('l', 'i');
    map.put('m', 'o');
    map.put('n', 'o');
    map.put('p', 'o');
    map.put('q', 'o');
    map.put('r', 'o');
    map.put('s', 'u');
    map.put('t', 'u');
    map.put('v', 'u');
    map.put('w', 'u');
    map.put('x', 'u'); 
    map.put('y', 'u');
    map.put('z', 'u');


    for(int i=0;i<str.length();i++){
      if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
        System.out.print(str.charAt(i));
        continue;
        
      }
      else{
        System.out.print(str.charAt(i));
        System.out.print(map.get(str.charAt(i)));
        System.out.print(m.get(str.charAt(i)));

      }

    }
    

  }
}
