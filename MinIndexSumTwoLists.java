import java.util.*;
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            hashMap.put(list1[i],i);
        }
        int min = 2001;
        ArrayList<String> al = new ArrayList<String>();
        for(int i = 0; i < list2.length; i++){
            if(hashMap.containsKey(list2[i]) && min >= (hashMap.get(list2[i])+i)){
                min = hashMap.get(list2[i])+i;
            }
        }
        for(int i = 0; i < list2.length; i++){
            if(hashMap.containsKey(list2[i]) && min == (hashMap.get(list2[i])+i)){
                al.add(list2[i]);
            }
        }
        
        String k[] = al.toArray(new String[al.size()]);
        return k;
    }
}