class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]<arr[mid+1]){
                //you are in increasing part of mountain
                start=mid+1;
            }else{
                end=mid;//beacuase this can be answer too
            }
        }
        return end;
    }
}