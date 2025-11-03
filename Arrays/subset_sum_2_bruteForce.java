import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class subset_sum_2 {
    static void sum_of_subsets(int arr[],int n,int idx,List<Integer> list,Set<List<Integer>> res){
        if(idx==n){
            res.add(new ArrayList<>(list));
            // sums.add(sum);
            
            // System.out.println(res);
            return;
        }
        list.add(arr[idx]);
        
        sum_of_subsets(arr, n, idx+1, list, res);
        if(list.size()!=0){
            list.remove(list.size()-1);
        }

        sum_of_subsets(arr, n, idx+1, list, res);

    }
    public static void main(String[] args) {
        int arr[]={1,2,2};
        Set<List<Integer>> res=new java.util.HashSet<>();
        sum_of_subsets(arr, arr.length, 0,new ArrayList<>(), res);
        System.out.println(res);
        System.out.println(res.size());

        // Time Complexity: O(2^n)
        // Space Complexity: O(n) for recursion stack + O(k*n) for result storage where
        // k is number of subsets.
    }
    
}
