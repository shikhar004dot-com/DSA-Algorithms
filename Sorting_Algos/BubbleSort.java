import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        int arr[]= {2,3,1,4,6,8,5,3,7,9,10};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int [] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){ //O(n)
            for(int j=0;j<arr.length-i-1;j++){ //O(n)
                if(arr[j]>arr[j+1]){
                    int dn=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=dn;
                }
            }
        }  //time complexity--> O(n^2)

        return arr;
    }
}