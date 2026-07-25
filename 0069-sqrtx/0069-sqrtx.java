class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        for(int i=1;i<=x;i++){
           if((long)i*i>x){
           return i-1;
            }
        }
        return 0;
    }
}