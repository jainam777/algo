package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUsing2Pointer {

    public static void main(String[] args) {
        int arr[] ={2,5,5,11};
        int target=10;
        int[] ans=twoSum(arr,target);
        System.out.println("O/P:- "+ans[0]+","+ans[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] newArray= new int[2];
        int sum=0;
        int i= 0;
        int j= nums.length-1;
        while(i!=j){
            sum = nums[i]+nums[j];
            if(sum==target){
                newArray[0]=nums[i];
                newArray[1]=nums[j];
                return newArray;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return newArray;
    }
}