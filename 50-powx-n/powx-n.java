class Solution {
    public double myPow(double x, int n) {
        long num = ((long)n);
        double res = 1.0;

        if( num == 0 ){
            return 1;
        }

        if( num < 0){
            num = -1*num;
            x = 1.0/x;
        }   

        while( num != 0 ){

            if( num %2 == 1){
                res = res * x;
                num -= 1;
            }

            x = x*x;
            num = num/2;
        }

        return res;
    }
}