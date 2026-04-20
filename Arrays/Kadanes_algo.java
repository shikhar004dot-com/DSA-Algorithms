class Kadanes_algo{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Maximum_Sum(arr));
    }
    public static int Maximum_Sum(int arr[]){
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            res=Math.max(res,sum);
            if(sum<0){
                sum=0;
            }
        }
        return res;
    }
}