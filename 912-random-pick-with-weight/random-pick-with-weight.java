class Solution {
    private int[] arr;
    private int sum;
    public Solution(int[] w) {
        this.arr = new int[w.length];
        int csum = 0;
        for(int i =0; i< w.length; ++i){
            csum += w[i];
            this.arr[i] = csum;
        }

        this.sum = csum;
    }
    
    public int pickIndex() {
        double num = sum* Math.random();
        int i=0;
        for(; i<this.arr.length; ++i){
            if( num < this.arr[i]){
                return i;
            }
        }

        return i-1;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */