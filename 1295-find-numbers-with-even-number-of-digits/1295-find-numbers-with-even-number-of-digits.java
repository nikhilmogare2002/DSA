class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                return 1;
                
            if(nums[i]<0)
                nums[i]=nums[i]*-1;

            int dig=(int)Math.log10(nums[i]) + 1;
            if(dig%2==0)
                cnt++;
            
        }
        return cnt;
    }
}