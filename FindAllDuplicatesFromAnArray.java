class Solution {
    public void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0 , n = nums.length ;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1||ele>n) i++;
            else if(ele==nums[ele-1]){
                set.add(ele);
                i++;
            }
            else swap(nums,ele-1,i);
        }
        ArrayList<Integer> ans = new ArrayList<>(set);
        return ans;
    }
}
