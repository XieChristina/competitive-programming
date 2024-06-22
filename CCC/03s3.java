import java.util.*;
public class FloorPlan {

	static int R;
	static int C;
	static char[][] grid;
	static int count;
	static ArrayList<Integer> size;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area = sc.nextInt();
		R = sc.nextInt();
		C = sc.nextInt();
		count = 0;
		int rooms = 0;
		grid = new char[R][C];
		size = new ArrayList<>();
		sc.nextLine();
		
		for(int i=0;i<R;i++) {
			String s = sc.nextLine();
			for(int j=0;j<C;j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(grid[i][j] == '.') {
					size.add(fill(i, j));
				}
			}
		}
		Collections.sort(size, Collections.reverseOrder());	
		//System.out.println(size.toString());
		
		int f = 0;
		for(int i=0;i<size.size();i++) {
			int get = size.get(i);
			//System.out.println(get);
			if(f+get <= area) {
				f += get;
				rooms++;
				//System.out.println(f+" "+rooms+" "+get);
			}
			else {
				break;
			}
		}
		
		if(rooms == 1) {
			System.out.println(rooms+" room, "+(area-f)+" square metre(s) left over");
		}
		else {
			System.out.println(rooms+" rooms, "+(area-f)+" square metre(s) left over");
		}

	}
	public static int fill(int row, int col) {
		if(row < 0 || col < 0 || row >= R || col >= C) {
			return 0;
		}
		if(grid[row][col] == 'I') {
			return 0;
		}
		grid[row][col] = 'I';
		count = 1;
		count = count+ fill(row+1, col);	//check down
		count = count+ fill(row-1, col);	//check up
		count = count+ fill(row, col+1);	//check right side
		count = count+ fill(row, col-1);	//check left side
		return count;
	}


}
