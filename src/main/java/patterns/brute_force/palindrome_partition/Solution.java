package palindrome_partition;

import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        // TODO: 문자열을 팰린드롬 분할하는 메서드 작성
        return null;
    }

    private void backtrack(String s, int start, List<String> path, List<List<String>> ans) {
        // TODO: 백트래킹 로직 작성
    }

    private boolean isPalindrome(String str) {
        // TODO: 팰린드롬 체크 메서드 작성
        return false;
    }
}

//region ✨
// import java.util.ArrayList;
// import java.util.List;
//
// public class Solution {
//     public List<List<String>> partition(String s) {
//         List<List<String>> ans = new ArrayList<>();
//         backtrack(s, 0, new ArrayList<>(), ans);
//         return ans;
//     }
//
//     private void backtrack(String s, int start, List<String> path, List<List<String>> ans) {
//         if (start == s.length()) {
//             ans.add(new ArrayList<>(path));
//             return;
//         }
//         for (int i = start + 1; i <= s.length(); i++) {
//             String sub = s.substring(start, i);
//             if (isPalindrome(sub)) {
//                 path.add(sub);
//                 backtrack(s, i, path, ans);
//                 path.remove(path.size() - 1);
//             }
//         }
//     }
//
//     private boolean isPalindrome(String str) {
//         return str.equals(new StringBuilder(str).reverse().toString());
//     }
// }
//endregion