package arrays;

public class Stockbuy {

    public static void main(String[] args) {
        int arr[] ={2,5,5,11};
        int target=10;
        int ans=stockBuy(arr);
        System.out.println("O/P:- "+ans);

    }

public static int stockBuy(int[] arr) {
int minPrice= Integer.MAX_VALUE;
int maxProfit=0;
for(int i=0;i<arr.length;i++){
if(minPrice>arr[i]){
    minPrice=arr[i];
}
else if(arr[i]-minPrice>maxProfit){
    maxProfit=arr[i]-minPrice;
}
}
return maxProfit;
}
}
