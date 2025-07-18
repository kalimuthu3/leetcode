class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                 low=mid+1;    
            }else{
                 high=mid-1;
            }
        }return -1;
        
    }
}