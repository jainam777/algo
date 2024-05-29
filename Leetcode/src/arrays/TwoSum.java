package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

public static void main(String[] args) {
int arr[] ={2,5,5,11};
int target=10;
int[] ans=twoSum(arr,target);
System.out.println("O/P:- "+ans[0]+","+ans[1]);

}

public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> nMap= new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        nMap.put(nums[i],i);
    }
    Arrays.sort(nums);
    int[] newArray= new int[2];
    int i = 0;
    int j = nums.length-1;
    int sum = 0;
    while(i != j){
        if(nums[i]+nums[j]==target){
            break;
        }
        else if(nums[i]+nums[j] > target){
            j--;
        }
        else{
            i++;
        }
    }
    newArray[0]=nMap.get(nums[i]);
    newArray[1]=nMap.get(nums[j]);
    return newArray;
}




public int[] twoSumOptimal(int[] nums, int target) {
HashMap<Integer, Integer> nMap = new HashMap<>();
int[] newArray = new int[2];
for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if(nMap.containsKey(complement)){
        newArray[0]= nMap.get(complement);
        newArray[1]= i;
        return newArray;
    }
    nMap.put(nums[i],i);
}
return  newArray;
}

}