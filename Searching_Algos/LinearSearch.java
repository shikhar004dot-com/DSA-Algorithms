class LinearSearch{
    public static void main(String[] args) {
        int arr[]= {2,3,1,4,5,6};
        System.out.println(linearSearch(arr, 4));

    }
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){  // O(n)
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}