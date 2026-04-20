import java.util.*;
class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        return arr;


    }
}