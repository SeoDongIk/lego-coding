package subsets;

import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // TODO: 조합을 구하는 메인 메서드 작성
        return null;
    }

    private void backtrack(int start, List<Integer> curr, int n, int k, List<List<Integer>> ans) {
        // TODO: 백트래킹 로직 작성
    }
}

//region ✨
// import java.util.ArrayList;
// import java.util.List;
//
// public class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> ans = new ArrayList<>();
//         backtrack(1, new ArrayList<>(), n, k, ans);
//         return ans;
//     }
//
//     private void backtrack(int start, List<Integer> curr, int n, int k, List<List<Integer>> ans) {
//         if (curr.size() == k) {
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         for (int i = start; i <= n; i++) {
//             curr.add(i);
//             backtrack(i + 1, curr, n, k, ans);
//             curr.remove(curr.size() - 1);
//         }
//     }
// }
//endregion