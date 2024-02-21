class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int alen = 0;
        int blen = 0;

        if( word == null || abbr == null){
            return false;
        }

        while(alen < word.length() && blen < abbr.length()){

            if(Character.isDigit(abbr.charAt(blen))){
                if( abbr.charAt(blen) == '0') {
                    return false;
                }

                int total = 0;
                while( blen < abbr.length() && Character.isDigit(abbr.charAt(blen))){
                    total = total* 10 + abbr.charAt(blen) - '0';
                    blen++;
                }

                alen += total;
            }else{
                if ( word.charAt(alen) != abbr.charAt(blen)){
                    return false;
                }
                alen++;
                blen++;
            }
        }

        return blen == abbr.length() && alen == word.length();
    }   
}