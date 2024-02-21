class Solution {
    public int calculate(String s) {
        
        if (s == null || s.isEmpty()){
            return 0;
        }
        
        int curr =0; 
        int prev = 0;
        int res =0;
        char op = '+';
        int len = s.length();

        for(int i =0; i<len; i++){
            Character currChar = s.charAt(i);
            
            if( Character.isDigit(currChar)){
                curr = (curr*10) + (currChar - '0');
            }

            if(!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == s.length()-1){

                if( op == '+'){
                    res += prev;
                    prev = curr;
                }else if ( op == '-'){
                    res += prev;
                    prev = -curr;
                }else if( op == '*'){
                    prev = prev * curr;
                }else if( op == '/'){
                    prev = prev / curr;
                }
                op = currChar;
                curr = 0;
            }

        }

        res += prev;
        return res;


    }
}