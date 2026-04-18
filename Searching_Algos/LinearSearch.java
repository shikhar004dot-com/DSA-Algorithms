class LinearSearch{
    public static void main(String[] args) {
        int arr[]= {2,3,1,4,5,6};
        System.out.println(LinearSearch(arr, 4));

    }
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){  // O(n)
            if(arr[i]==key){
                return key;
            }
        }
        return -1;
    }
}