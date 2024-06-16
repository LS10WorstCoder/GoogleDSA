class Solution {
    public int firstUniqChar(String s) {
        Map<Character,ArrayList<Integer>> multiMap = new HashMap<>();
        int l = s.length();
        for(int i = 0; i < l; i++){
            char n = s.charAt(i);
            if(!multiMap.containsKey(n)){
                multiMap.put(n,i);
            }
        }
        for(){
            
        }
    }
}