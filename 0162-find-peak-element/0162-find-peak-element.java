class Solution {
    public int findPeakElement(int[] nums) { // this question is same as a 852 find peak of mountain element
            int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            
            if(nums[mid]<nums[mid+1]){
                //you are in increasing part of mountain
                start=mid+1;
            }else{
                end=mid;//beacuase this can be answer too
            }
        }
        return end;
    }
}