//https://leetcode.com/problems/rotate-image/
//using transpose and then reverse each rows
class Solution {
    public void rotate(int[][] matrix) {
        //transpose of matrix
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            int left=0; int right=n-1;
          //reverse each rows
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++; right--;
            }
        }
    }
}
//
