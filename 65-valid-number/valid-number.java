class Solution {
    public boolean isNumber(String s) {

        boolean digit = false;
        boolean exp = false;
        boolean dot = false;

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                digit = true;
            }else if (ch == '+' || ch == '-'){
                if( i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E'){
                    return false;
                }
            }else if( ch == '.' ){
                if( exp || dot){
                    return false;
                }
                dot = true;
            }else if (ch == 'e' || ch == 'E'){
                if( exp || !digit){
                    return false;
                }
                digit = false;
                exp = true;
            }else{
                return false;
            }
        }

        return digit;
    }
}