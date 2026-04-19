import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        int arr[]= {2,3,1,4,6,8,5,3,7,9,10};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int [] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){ //O(n)
            for(int j=i+1;j<arr.length-1;j++){ //O(n)
                if(arr[i]>arr[j]){
                    int dn=arr[i];
                    arr[i]=arr[j];
                    arr[j]=dn;
                }
            }
        }  //time complexity--> O(n^2)

        return arr;
    }
}