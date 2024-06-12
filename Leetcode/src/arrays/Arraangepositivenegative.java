package arrays;

import java.util.Arrays;

public class Arraangepositivenegative {
    public static void main(String[] args) {
        int[] arr= {-4,-8,5,2,1,7};
        int[] out= SortPosInt(arr);
        int i=0;
        while(i< arr.length){
            System.out.println(out[i]+"");
            i++;
        }
    }

    public static int[] SortPosInt(int[] arr){
        int neg=0;
        int mid=0;
        int pos= arr.length-1;
        while(mid<pos){
            if(arr[mid]<0){
                int temp=arr[mid];
                arr[mid]=arr[neg];
                arr[neg]=temp;
                mid++;
                neg++;
            }else if(arr[mid]>0){
                int temp= arr[mid];
                arr[mid]= arr[pos];
                arr[pos]=temp;
                pos--;
            }
        }
        for(int i = 0;i < arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                int temp= arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }

        }
        return arr;

    }

}
