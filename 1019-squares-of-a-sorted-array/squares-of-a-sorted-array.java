class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int k[]=new int[len];
        for(int i=0;i<len;i++){
            k[i]=nums[i]*nums[i];
         } Arrays.sort(k);
         return k;
    
    } }