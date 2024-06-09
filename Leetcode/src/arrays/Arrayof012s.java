package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Arrayof012s {

    public static void main(String[] args) {
        int arr[] ={2,0,2,1,1,0};
        int[] ans=arrayof012s(arr);
        System.out.println("O/P:- "+ans[0]+","+ans[1]);

    }

    public static int[] arrayof012s(int[] nums) {
   int[] newArr= new int[nums.length];
        int countOf0=0;
   int countOf1=0;
   int countof2=0;
   int i=0;
    while(i <= nums.length-1){
        if(nums[i]==0){
            countOf0++;
            i++;
        }
        else if(nums[i]==1){
            countOf1++;
            i++;
        }
        else{
            countof2++;
            i++;
        }
    }
  for(int c0=0; c0<=countOf0; c0++){
      newArr[c0]=0;
  }
        for(int c1=0; c1<countOf1; c1++){
            newArr[countOf0 + c1]=1;
        }
        for(int c2=0; c2<countof2; c2++){
            newArr[countOf0 +countOf1 +c2]=2;
        }
return newArr;
    }
}