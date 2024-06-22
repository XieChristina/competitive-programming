import java.util.*;
public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

        int Pac = num - 300;
        int Mou = num - 200;
        int Cen = num - 100;
        int East = num;
        int Alt = num +100;
        int New = num +130;
    

    if(Pac<0){
      Pac = 2400+Pac;
    }
    if(Mou<0){
      Mou = 2400+Mou;
    }
    if(Cen<0){
      Cen = 2400+Cen;
    }
    if(East<0){
      East = 2400+East;
    }
    if(Alt<0){
      Alt= 2400+Alt;
    }
    if(New<0){
      New = 2400+New;
    }
    
    if(Alt>2359){
      Alt = Alt-2400;
    }
    if(New>2359){
      New = New-2400;
    }
    if(Cen>2359){
      Cen = Cen-2400;
    }
   if(Mou>2359){
      Mou = Mou-2400;
    }
    if(Pac>2359){
      Pac = Pac-2400;
    }
  //   if(Alt%100>59){
  //     Alt = Alt+;
  //   }
  //   if(New%100>59){
  //     New = New-2400;
  //   }
  //   if(Cen%100>59){
  //     Cen = Cen-2400;
  //   }
  //  if(Mou%100>59){
  //     Mou = Mou-2400;
  //   }
  //   if(Pac%100>59){
  //     Pac = Pac-2400;
  //   }
    if(New == 275){
      New = 315;
    }
    System.out.println(num +" "+ "in Ottawa");
    System.out.println(Pac + " "+"in Victoria");
    System.out.println(Mou + " "+"in Edmonton");
    System.out.println(Cen + " "+"in Winnipeg");
    System.out.println(East + " "+"in Toronto");
    System.out.println(Alt + " "+"in Halifax");
    System.out.println(New + " "+"in St. John's");

  }
}
