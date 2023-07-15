import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, result, new ArrayList<>());
        System.out.println(result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<List<Integer>> result, ArrayList<Integer> current ) {
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return;
        }
        if(start > n){
            return;
        }

        current.add(start);
        backtrack(start + 1, n, k, result, current);
        current.remove(current.size() - 1);

        backtrack(start + 1, n, k, result, current);
    }

}
