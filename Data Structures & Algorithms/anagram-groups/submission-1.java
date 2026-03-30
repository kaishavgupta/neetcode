class Solution {

    public String stringFreq(String word){
        int freq[]=new int[26];

        char chArray[]=word.toCharArray();

        for(char c:chArray){
            freq[c-'a']+=1;
        }

        StringBuilder str=new StringBuilder();
        char c='a';
        for(int i:freq){
            str.append(c);
            str.append(i);
            c++;
        }
        return str.toString();
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word:strs){
            String hashString=stringFreq(word);
            if(!map.containsKey(hashString)){
                map.put(hashString,new ArrayList<>());
            }
            map.get(hashString).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
