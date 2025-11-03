import java.util.ArrayList;
import java.util.List;

public class subset_sum_1 {
    static int target=6;
    static void sum_of_subsets(int arr[],int n,int idx,List<Integer> list,List<List<Integer>> res,int sum,List<Integer> sums){
        if(idx==n){
            res.add(new ArrayList<>(list));
            // sums.add(sum);
            if(sum==target){
                System.out.println("Answer found "+ sum);
                return;
            }
            // System.out.println(res);
            return;
        }
        list.add(arr[idx]);
        
        sum_of_subsets(arr, n, idx+1, list, res,sum+arr[idx],sums);
        if(list.size()!=0){
            list.remove(list.size()-1);
        }

        sum_of_subsets(arr, n, idx+1, list, res,sum,sums);
        


    }
    public static void main(String[] args) {
         int arr[]={3,1,2};
        int n=arr.length;
        int sum=0;
        List<Integer> sums=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        sum_of_subsets(arr,n,0,new ArrayList<>(),res,sum,sums);

        // Time Complexity: O(n*2^n)
        // Space Complexity: O(n) for recursion stack + O(k*n) for result storage where k is number of subsets.
        
    }
    
}
