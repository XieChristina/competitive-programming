import java.util.*;
public class AromaticNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		String input = sc.nextLine();
	
		int count = 0;
		
		for(int i=1;i<=input.length()-2;i=i+2) {
			char ch = input.charAt(i);
			if(map.get(ch) < map.get(input.charAt(i+2))) {
				count -= map.get(input.charAt(i))*Integer.parseInt(input.charAt(i-1)+"");
	
			}
			else {
				count += map.get(input.charAt(i))*Integer.parseInt(input.charAt(i-1)+"");
				
			}
		}
		count += map.get(input.charAt(input.length()-1))*Integer.parseInt(input.charAt(input.length()-2)+"");
		System.out.println(count);
		

	}

}
