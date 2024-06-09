package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] ={4,4,2,4,3,4,4,3,2,4};
        int ans=majorityElement(arr);
        System.out.println("O/P:- "+ans);

    }

    public static int majorityElement(int[] nums) {
        int countofMid = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>countofMid){
                return entry.getKey();
            }
        }
        return -1;
    }
}
