class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> sMap=new HashMap<>();
        HashMap<Character, Integer> tMap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            sMap.put(s1,sMap.getOrDefault(s1,0)+1);
        }
         for(int i=0;i<t.length();i++){
            char t1=t.charAt(i);
            tMap.put(t1,tMap.getOrDefault(t1,0)+1);
        }
            return sMap.equals(tMap);
    }
}