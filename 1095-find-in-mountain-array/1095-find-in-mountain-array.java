/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeakIndex(mountainArr);
        int ans1=binarySearch(target,mountainArr,0,peak);
        if(ans1 != -1)
            return ans1;
        else
            return binarySearch(target,mountainArr,peak,mountainArr.length()-1);
       
    }

    int findPeakIndex(MountainArray arr){
         int start=0;
        int end=arr.length()-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr.get(mid)<arr.get(mid+1)){
                //increasing part
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }


    static int binarySearch(int target, MountainArray arr, int start , int end) {

        

        // Check whether array is ascending or descending
        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid)== target) {
                return mid;
            }

            if (isAsc) {   // Ascending Order

                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {      // Descending Order

                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return -1;
    }
}