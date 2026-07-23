class Solution { 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mapy=new HashMap<>();

        for(String word:strs){
            char[]chars=word.toCharArray();
            Arrays.sort(chars);
            String signature=new String(chars);

        if(!mapy.containsKey(signature)){
            mapy.put(signature,new ArrayList<>());
        }    
        mapy.get(signature).add(word);
        }
        return new ArrayList<>(mapy.values());
    }
}
