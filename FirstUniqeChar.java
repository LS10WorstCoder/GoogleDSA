import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hashMap = new HashMap<>();
        int l = s.length();
        for(int i = 0; i < l; i++){
            char n = s.charAt(i);
            hashMap.put(n,hashMap.getOrDefault(n, 0) + 1);
            
        }
        for(int i = 0; i < l; i++){
            char n = s.charAt(i);
            if(hashMap.get(n) == 1){
                return i;
            }
        }
        return -1;
    }
}