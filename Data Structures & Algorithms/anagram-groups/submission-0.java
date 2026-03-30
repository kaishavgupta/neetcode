class Solution {

   //BASIC APPROACH OF MAPPING SORTED_STRING as key 

   //It's time complexity is O(n*klogk)  
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word:strs){

            char []chArray=word.toCharArray();
            Arrays.sort(chArray);
            String key=new String(chArray);
            if(!map.containsKey(key)){
                
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
