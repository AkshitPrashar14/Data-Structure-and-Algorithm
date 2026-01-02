class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String single_str:strs){
            char[] sorted_arr=single_str.toCharArray();
            Arrays.sort(sorted_arr);
            String sorted_str=new String(sorted_arr);

            if(!map.containsKey(sorted_str)){
                map.put(sorted_str,new ArrayList<>());
            }
            map.get(sorted_str).add(single_str);
        }
        return new ArrayList<>(map.values());
    }
}
