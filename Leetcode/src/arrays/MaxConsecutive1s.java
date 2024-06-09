package arrays;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class MaxConsecutive1s {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int ans=max1s(arr);
        System.out.println("O/P:- "+ans);

    }

    public static int max1s(int[] arr) {
        int max=0;
    int countofOne=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            countofOne++;
        }else{
            countofOne=0;
        }
        if(countofOne>max){
            max=countofOne;
        }
    }
    return max;
    }

}
