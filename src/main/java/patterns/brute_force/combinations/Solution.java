package combinations;

import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        // TODO: 직접 외워서 구현해보자
        return null;
    }

    private void backtrack(int start, List<Integer> path, int n, int k, List<List<Integer>> result) {
        // TODO: 외운 구조를 작성해보자
    }
}

//region ✨

//
// public class Solution {
//
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(1, new ArrayList<>(), n, k, result);
//         return result;
//     }
//
//     private void backtrack(int start, List<Integer> path, int n, int k, List<List<Integer>> result) {
//         if (path.size() == k) {
//             result.add(new ArrayList<>(path));
//             return;
//         }
//
//         for (int i = start; i <= n; i++) {
//             path.add(i);
//             backtrack(i + 1, path, n, k, result);
//             path.remove(path.size() - 1);
//         }
//     }
// }
//

//endregion
