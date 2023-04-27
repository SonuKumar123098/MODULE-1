//https://course.acciojob.com/idle?question=91028013-cace-4104-a833-33522013bbaf
import java.util.*;

public class Main {
	private static boolean valid(int[][]matrix,int x,int y){
		int m=matrix.length;
		int n=matrix[0].length;
		if(x<0 || y<0 || x>=m ||y>=n) return false;
		return true;
	}
    public static int[] findTheWay(int[][] matrix) {
        //Write code here
		int r=0,c=1;
		int row=0,col=0;
		int i=0,j=0;
		while(true){
			
			if(!valid(matrix,i,j)){
				return new int[]{i-r,j-c};
			}
			if(matrix[i][j]==1){
				if(c==1){
					r=1;
					c=0;
				}else if(r==1){
					r=0;
					c=-1;
				}else if(c==-1){
					r=-1;
					c=0;
				}else{
					r=0;
					c=1;
				}
				matrix[i][j]=0;
			}
			i+=r;
			j+=c;
		}
		// return new int[]{r,c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		}
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
