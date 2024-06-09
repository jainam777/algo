package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5};
        int ans=missingNumber(arr);
        System.out.println("O/P:- "+ans);

    }

    public static int missingNumber(int[] arr){
        int s1=0;
        int s2=0;
        s1= (arr.length+1)*((arr.length+1)+1)/2;
        for(int i = 0; i < arr.length; i++){
            s2+=arr[i];
        }
        return s1-s2;
    }

}
