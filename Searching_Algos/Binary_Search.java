class Binary_Search{
    public static void main(String args[]){
        int arr[]={1,3,4,6,7,13,14,16};
        System.out.print(Binary(arr, 13));

    }
    public static int Binary(int arr[],int k){
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}