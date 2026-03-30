class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(map.containsKey(c)){
            int val = map.getOrDefault(c, 0);
            map.put(c,val+1);
        }
        else{
            map.put(c,1);
        }
    }

    for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!map.containsKey(c)) {
                return false;
            }

            int val = map.get(c) - 1;

            if (val == 0) {
                map.remove(c); // optional optimization
            } else {
                map.put(c, val);
            }
        }

        return map.isEmpty(); 
    }
}


