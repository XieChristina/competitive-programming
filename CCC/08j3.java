import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    HashMap<Character, Integer > x = new HashMap<>();
  
    x.put('A', 0);
    x.put('B', 1);
    x.put('C', 2);
    x.put('D', 3);
    x.put('E', 4);
    x.put('F', 5);
    x.put('G', 10);
    x.put('H', 11);
    x.put('I', 12);
    x.put('J', 13);
    x.put('K', 14);
    x.put('L', 15);
    x.put('M', 20);
    x.put('N', 21);
    x.put('O', 22);
    x.put('P', 23);
    x.put('Q', 24);
    x.put('R', 25);
    x.put('S', 30);
    x.put('T', 31);
    x.put('U', 32);
    x.put('V', 33);
    x.put('W', 34);
    x.put('X', 35);
    x.put('Y', 40);
    x.put('Z', 41);
    x.put(' ', 42); //space
    x.put('-', 43);
    x.put('.', 44);
    x.put('!', 45); //enter

    char pre = 'A';
    int total = 0;
    str = str + "!";
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      int rx = x.get(pre)/10;
      int ry = x.get(pre)%10;
      int sx = x.get(ch)/10;
      int sy = x.get(ch)%10;
      int d =  Math.abs(rx-sx) + Math.abs(ry - sy);
      total = total+d;
      pre = ch;
    }
   System.out.println(total);
  }
}
