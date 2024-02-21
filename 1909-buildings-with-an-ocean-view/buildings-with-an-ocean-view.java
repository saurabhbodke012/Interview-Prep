class Solution {
    public int[] findBuildings(int[] heights) {
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        res.add(heights.length-1);
        max = Math.max( max, heights[heights.length-1]);
        for(int i = heights.length-2; i>=0; i--){
            if( heights[i] > max){
                res.add(i);
            }
            max = Math.max( max, heights[i]);
        }

        int[] arr = new int[res.size()];

        for(int i =0; i<arr.length; i++){
            arr[i] = res.get(res.size()-1-i);
        }

        return arr;


    }
}