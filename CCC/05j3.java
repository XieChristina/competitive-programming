import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Stack<String> st = new Stack<>();
    int count = 0;
    st.push(" ");
    while(!st.peek().equals("SCHOOL")){
      count = count+1;
      st.push(sc.nextLine());
    }
    st.pop();
    
    
    for(int k=0;k<count/2-1;k++){
      if(st.peek().equals("L")){
        st.pop();
        st.push("RIGHT");
      }
      if(st.peek().equals("R")){
        st.pop();
        st.push("LEFT");

      }
      System.out.println("Turn "+st.pop()+" onto "+ st.pop() + " street.");

    }
    
    if(st.peek().equals("L")){
        st.pop();
        st.push("RIGHT");
      }
      if(st.peek().equals("R")){
        st.pop();
        st.push("LEFT");

      }
    System.out.println("Turn "+st.pop()+" into your HOME.");
    



    
  }
}
