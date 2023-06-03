package BinarySearch;

public class SearchRange {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int arr[], int target, boolean findFirstIndex){
        int ans = 0;
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(arr[m]>target){
                e = m - 1;
            } else if(arr[m]<target){
                s = m + 1;
            } else {
                ans = m;
                if(findFirstIndex){
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }

        return ans;
    }
}
