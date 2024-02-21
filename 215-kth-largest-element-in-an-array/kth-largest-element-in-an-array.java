class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int[] count = new int[max - min +1];

        for(int i =0; i<nums.length; i++){
            count[nums[i] - min]++; 
        }

        int val = k;

        for(int i = count.length -1; i>=0; i--){
            val -= count[i]; 

            if( val <= 0){
                return i+ min;
            }
        }

        return -1;

    }
}