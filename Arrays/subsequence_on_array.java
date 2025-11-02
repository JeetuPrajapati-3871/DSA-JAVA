import java.util.*;
public class subsequence_on_array {
    static void return_seq(int arr[],int n,int idx,List<Integer> list,List<List<Integer>> res){
        if(idx==n){
            res.add(new ArrayList<>(list));
            // System.out.println(res);
            return;
        }
        list.add(arr[idx]);
        return_seq(arr, n, idx+1, list, res);
        if(list.size()!=0){
            list.remove(list.size()-1);
        }

        return_seq(arr, n, idx+1, list, res);
        


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        return_seq(arr,n,0,list,res);
        System.out.println(res);
        System.out.println(res.size());
       
        // time complexity: O(2^n)
        // space complexity: O(n) for recursion stack + O(2^n*n) for
        
    }
}
