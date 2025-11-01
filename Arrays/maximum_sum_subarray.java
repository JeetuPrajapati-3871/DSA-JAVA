public class maximum_sum_subarray {
    public static int maxSum(int arr[]){
        int max_val=Integer.MIN_VALUE;
        int sum=0;
        sum=sum+arr[0];
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(sum<0){
                if(x>0){
                    sum=0;
                    sum+=x;
                }

            }
            else{
                if(x>=0) sum+=x;
                else{
                    if(sum>x) sum+=x;
                }

            }
            if(sum>max_val) max_val=sum;
        }



        return max_val;

    }
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        System.out.println(maxSum(arr));
    }
}
