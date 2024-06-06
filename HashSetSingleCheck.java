import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i:nums){
            if(hashSet.contains(i)){
                hashSet.remove(i);
            }
            else{
                hashSet.add(i);
            }
        }
        for(int i:nums){
            if(hashSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}