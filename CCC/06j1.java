import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int burger = sc.nextInt();
    int side = sc.nextInt();
    int drink = sc.nextInt();
    int dessert = sc.nextInt();
    int count = 0;
    if(burger == 1){
      count = count + 461;
    }
    if(burger == 2){
      count = count + 431;
    }
    if(burger == 3){
      count = count + 420;
    }
    if(burger == 4){
      count = count+ 0;
    }
    if(side == 1){
      count = count + 100;
    }
    if(side == 2){
      count = count + 57;
    }
    if(side == 3){
      count = count+70;
    }
    if(side == 4){
      count = count+ 0;
    }
    if(drink == 1){
      count = count+130;
    }
    if(drink == 2){
      count = count+160;
    }
    if(drink == 3){
      count = count+118;
    }
    if(drink == 4){
      count = count+0;
    }
    if(dessert == 1){
      count = count+167;
    }
    if(dessert == 2){
      count = count+266;
    }
    if(dessert == 3){
      count = count+75;
    }
    if(dessert == 4){
      count = count+0;
    }
    System.out.println("Your total Calorie count is "+count+".");
  }
}
