import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        
        while(n != 1 && !hashSet.contains(n)){
            hashSet.add(n);
            int size = 0;
            int org = n;
            while(n>0){
                n = (int)n/10; 
                size++;
            }
            int sum = 0;
            for(int x = 0; x < size; x++){
                sum += Math.pow(org%10,2);
                org=(int)org/10;
            }
            n = sum;
        }
        return n == 1;
    }
}