import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int xlen = sc.nextInt();
    int ylen = sc.nextInt();
    String[] xlist = new String[xlen];
    String[] ylist = new String[ylen];
    
    for(int a=0; a<xlen; a++){
      xlist[a] = sc.next();
    }
    for(int b=0; b<ylen; b++){
      ylist[b] = sc.next();
    }
    for(int x=0; x<xlen; x++){
      for(int y=0; y<ylen; y++){
          System.out.println(xlist[x]+" as "+ylist[y]);
        }
      }
    }
  }
