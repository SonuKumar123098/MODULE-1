//https://course.acciojob.com/idle?question=6d3edffb-92c5-4c40-ba2a-8ba1acabb98b
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        // your code here
		ArrayList<Integer>ans=new ArrayList<>();
		for(int g=n-1;g>(-n);g--){
			int i=0,j=0;
			if(g>=0){
				j=g;
			}else{
				i=Math.abs(g);
			}
			for( ;i<n && j<n; i++,j++){
				ans.add(mat[i][j]);
			}
		}
		return ans;
        
    }
}
