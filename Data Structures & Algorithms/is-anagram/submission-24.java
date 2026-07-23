class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        };

        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer> tMap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char charS=s.charAt(i);
            sMap.put(charS,sMap.getOrDefault(charS,0)+1);

            char charT=t.charAt(i);
            tMap.put(charT,tMap.getOrDefault(charT,0)+1);
        }
        return sMap.equals(tMap);
    }
}
