class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int count =0;

        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);

            if( ch == '('){
                stack.add(ch);
            }else if( ch == ')' && stack.isEmpty()){
                count++;
            }else if ( ch == ')' && !stack.isEmpty()){
                stack.pop();
            }
        }

        if( stack.size() > 0){
            count += stack.size();
        }
        
        return count;
    }
}