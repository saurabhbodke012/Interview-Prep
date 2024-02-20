class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> invalid = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if( ch == '('){
                st.push(i);
            }else if(ch == ')'){
                if( st.isEmpty()){
                    invalid.add(i);
                }else{
                    st.pop();
                }
            }

        }

        while( !st.isEmpty()){
            invalid.add(st.pop());
        }

        for(int i=0; i<s.length(); i++){

            if(invalid.contains(i)){
                continue;
            }

            result.append(s.charAt(i));
        }

        return result.toString();
    }
}