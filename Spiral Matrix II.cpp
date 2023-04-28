//https://leetcode.com/problems/spiral-matrix-ii/
class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>>ans(n,vector<int>(n,0));
        int left=0,top=0,right=n-1,bottom=n-1;
        int dirn=0; int cnt=1;
        while(top<=bottom && left<=right){
            dirn%=4;
            if(dirn==0){
                for(int i=left;i<=right;i++){
                    ans[top][i]=cnt++;
                }
                top++;
            }else if(dirn==1){
                for(int i=top;i<=bottom;i++){
                    ans[i][right]=cnt++;
                }
                right--;
            }else if(dirn==2){
                for(int i=right;i>=left;i--){
                    ans[bottom][i]=cnt++;
                }
                bottom--;
            }else if(dirn==3){
                for(int i=bottom;i>=top;i--){
                    ans[i][left]=cnt++;
                }
                left++;
            }
            dirn++;
        }
        return ans;
    }
};
