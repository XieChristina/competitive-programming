import java.util.*;
public class PostfixNotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Double> st = new Stack<>();
		String str = sc.nextLine();
		String[]line = str.split(" ");
		for(String s: line) {
			try {
				st.push((double) Integer.parseInt(s));
            } catch(Exception e){
                double num1 = st.pop();
                double num2 = st.pop();

			if(s.equals("+")) {
				st.push(num1+num2);
			}
			else if(s.equals("-")) {
				st.push(num2-num1);
			}
			else if(s.equals("*")) {
				st.push(num2*num1);
			}
			else if(s.equals("/")) {
				st.push(num2/num1);
			}
			else if(s.equals("%")) {
				st.push(num2%num1);
			}
			else if(s.equals("^")) {
				st.push((double)Math.pow(num2,num1));
			}
			else {
				st.push((double) Integer.parseInt(s));
			}
			
            }

		}
		System.out.println(st.pop());
	}

}
