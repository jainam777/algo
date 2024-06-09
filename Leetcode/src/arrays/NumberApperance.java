package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberApperance {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int ans=numberApperance(arr);
        System.out.println("O/P:- "+ans);
    }

    public static int numberApperance(int[] arr) {
    Map<Integer,Integer> map= new HashMap<>();
    for(int i=0; i < arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
    }
    int count=0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()==1){
           count= entry.getKey();
        }
    }
    return count;
    }
}
