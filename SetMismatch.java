class Solution {
    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0 , n = nums.length;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1) i++;
            else if(ele==nums[ele-1]){
                ans[0] = ele;
                i++;
            } 
            else swap(nums,i,ele-1);
            
        }
        for(int k = 0 ; k < n ; k++ ){
            if(nums[k]!=k+1){
                ans[1] = k+1;
                break;
            }
        }
        return ans;
    }
}
