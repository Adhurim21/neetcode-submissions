class Solution {

//5#Hello3#Bye
    public String encode(List<String> strs) {
      StringBuilder totalResult=new StringBuilder();
      for(String str:strs){
        totalResult.append(str.length()).append("#").append(str);
      }
      return totalResult.toString();
    }

    public List<String> decode(String str) {

      List<String> result=new ArrayList<>();

      int i=0;

      while(i<str.length()){
        int j=i;
        while(str.charAt(j)!= '#'){
          j++;
        }

        int start=j+1;

        int length=Integer.parseInt(str.substring(i,j));

        int end=start+length; 
        result.add(str.substring(start,end));
        i=end;
      }
      return result;
    }
}
