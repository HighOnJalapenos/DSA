package BinarySearch;

public class InfiniteSortedArray {

    static int search(int arr[], int target){
        int s = 0;
        int e = 1;
        while(e<target){
            int newS = e+1;
            e = e + (e-s+1)*2; // length is 2, 4, 8, 16... previous end idx + 2*size of previous range
            s = newS;
        }

        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]<target){
                s = m+1;
            } else if(arr[m]>target){
                e = m-1;
            } else{
                return m;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20, 21, 22};
        System.out.print(search(arr,16));
    }
}
