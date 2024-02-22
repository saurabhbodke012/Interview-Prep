class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();

        for( String str: strings){
            String hashKey = helper(str);
            if (map.get(hashKey) == null){
                map.put(hashKey, new ArrayList<>());
            }
            map.get(hashKey).add(str);
        }

        List<List<String>> groups = new ArrayList<>();
        for( List<String> group: map.values()){
            groups.add(group);
        }

        return groups;
    }

    private String helper(String s){
        char[] arr = s.toCharArray();
        StringBuilder str = new StringBuilder();

        for(int i =1; i<arr.length; i++){
            str.append((char)(arr[i] - arr[i-1] + 26) % 26 + 'a');
        }

        return str.toString();

    }
}