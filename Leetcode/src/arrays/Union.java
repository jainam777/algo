package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {


    public static int[] union(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                mergedArr[k++] = arr2[j++];
            } else { // when both elements are equal
                mergedArr[k++] = arr1[i++];
                j++; // skip the duplicate element in arr2
            }
        }
        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;
    }


    public static int[] removeDuplicates(int[] mergedArray) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int value : mergedArray) {
            if (!myList.contains(value)) {
                myList.add(value);
            }
        }
        int[] newArr = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            newArr[i] = myList.get(i);
        }
        return newArr;
    }


    public static void printArr(int[] arr1){
        int i=0;
        while(i<arr1.length) {
            System.out.println(arr1[i++] + "-");
        }
    }


    public  static  void main(String args[]){
        int arr1[] = { 1, 3, 5, 7, 11 };
        int arr2[] = { 2, 4, 6, 8, 10 };
    int[] ans= MergeTwoArray.mergedArray(arr1,arr2);
    //int[] val= removeDuplicates(ans);
        printArr(ans);
}
}
