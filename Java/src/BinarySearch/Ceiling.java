package BinarySearch;

import java.util.Scanner;

public class Ceiling {
    static int ceiling(int arr[], int target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(arr[m]>target){
                e = m-1;
            } else if(arr[m]<target){
                s = m+1;
            } else {
                return m;
            }
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.print(arr[ceiling(arr, target)]);
    }
}
