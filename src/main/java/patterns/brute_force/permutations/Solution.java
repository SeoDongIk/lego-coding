package permutations;

import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        // TODO: 여기에 직접 외운 걸 써보자
        return null;
    }

    private void backtrack(List<Integer> curr, int[] nums, List<List<Integer>> ans) {
        // TODO: 백트래킹 구조를 외워서 직접 써보자
    }
}

//region ✨

//
// public class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         backtrack(new ArrayList<>(), nums, ans);
//         return ans;
//     }
//
//     private void backtrack(List<Integer> curr, int[] nums, List<List<Integer>> ans) {
//         if (curr.size() == nums.length) {
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         for (int num : nums) {
//             if (!curr.contains(num)) {
//                 curr.add(num);
//                 backtrack(curr, nums, ans);
//                 curr.remove(curr.size() - 1);
//             }
//         }
//     }
// }
//

//endregion