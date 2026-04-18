class BinarySearch{
    public static void main(String args[]){
        int arr[]={1,3,4,6,7,13,14,16};
        System.out.print(Binary(arr, 13));  
    }
    public static int Binary(int arr[],int key){  // here key is the value that we have to check if it is present and return its index.
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}