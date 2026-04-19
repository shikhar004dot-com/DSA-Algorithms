import java.util.*;
class SelectionSort{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,7,8,5,10};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    public static int [] selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int dn=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=dn;
        }
        return arr;
    }
}