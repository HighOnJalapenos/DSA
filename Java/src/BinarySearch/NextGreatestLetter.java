package BinarySearch;

import java.util.Scanner;

public class NextGreatestLetter {
    static char nextGreatestLetter(char arr[], char target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(arr[m]>target){
                e = m-1;
            } else{
                s = m+1;
            }
        }

        return arr[s%arr.length];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = {'f', 'g', 'h'};

        char target = 'a';

        System.out.print(nextGreatestLetter(arr, target));
    }
}
