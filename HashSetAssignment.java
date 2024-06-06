class MyHashSet {
    
    private int[] hashSet;
    public MyHashSet() {
       hashSet = new int[1000001];
    }
    
    public void add(int key) {
        if(hashSet[key]==0){
            hashSet[key]=1;
        }
    }
    
    public void remove(int key) {
        if(hashSet[key]!=0){
            hashSet[key]=0;
        }
    }
    
    public boolean contains(int key) {
        return hashSet[key] > 0;
        
    }
}
