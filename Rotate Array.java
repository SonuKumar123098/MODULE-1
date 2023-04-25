//https://leetcode.com/problems/rotate-array/description/
class Solution {//extra space->divide array into two parts->
    public void rotate(int[] nums, int k) {
		  int n=nums.length;
			k%=n;
      //reverse the whole array
			reverse(nums,0,n-1);
			//consider array divided in two parts first half contain contain k element
			//reverse first half element
			reverse(nums,0,k-1);
			//reverse the second half remaining elements
			reverse(nums,k,n-1);
    }
		private void reverse(int[]nums, int start, int end){
			while(start<end){
				int temp=nums[start];
				nums[start]=nums[end];
				nums[end]=temp;
				start++; end--;
			}
		}
}
//2nd approach
class Solution {//extra space->
    public void rotate(int[] nums, int k) {
		int n=nums.length;
    int[]ans=new int[n];
		k%=n;
		for(int i=n-k;i<n;i++){
			ans[i-n+k]=nums[i];
		}
		for(int i=k;i<n;i++){
			ans[i]=nums[i-k];
		}
		for(int i=0;i<n;i++){
			nums[i]=ans[i];
		}
    }
}
