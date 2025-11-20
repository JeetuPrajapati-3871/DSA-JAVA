public class atleastkplaces {
    private static boolean check(int arr[],int k){
        int sum=0;
        int curr=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            if((curr==1) && (arr[i]==0)) sum++;
            if((curr==1) && (arr[i]==1)){
                if(sum<k) return false;
                sum=0;

            }
            if((curr==0) && (arr[i]==1)) curr=1;
            
        }
        return true;


    }
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,0,1};
        int k=2;
        System.out.println(check(arr, k));
        
    }
    
}
