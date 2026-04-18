class JumpSearch{
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        System.out.println(jumpSearch(arr, 5));

    }
    public static int jumpSearch(int arr[],int key){
        int n=arr.length;
        int step=(int) Math.sqrt(n);
        int prev=0;
        while(arr[Math.min(step,n)-1]<key){
            prev=step;
            step+=(int)Math.sqrt(n);
            if(prev>=n){
                return -1;
            }
        }
        while(arr[prev]<key){
            prev++;
            if(prev==Math.min(step,n)){
                return -1;


            }
        }
        if(arr[prev]==key){
            return prev;
        }
        return -1;

    }
}