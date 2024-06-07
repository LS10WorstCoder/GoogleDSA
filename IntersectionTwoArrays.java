import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i: nums1){
            if(!hashSet.contains(i)){
                hashSet.add(i);
            }
        }
        List<Integer> toRetA = new ArrayList<Integer>();
        for(int i: nums2){
            if(hashSet.contains(i)){
                toRetA.add(i);
                hashSet.remove(i);
            }
        }
        int[] toRet = toRetA.stream().mapToInt(i -> i).toArray();
        return toRet;
    }
}