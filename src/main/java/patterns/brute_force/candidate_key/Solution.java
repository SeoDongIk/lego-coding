package candidate_key;

public class Solution {
    public int solution(String[][] relation) {
        // TODO: 후보키 개수를 찾는 메서드 작성
        return 0;
    }
}

//region ✨
// import java.util.*;
//
// public class Solution {
//     public int solution(String[][] relation) {
//         int colLen = relation[0].length;
//         int rowLen = relation.length;
//         List<Integer> candidateKeys = new ArrayList<>();
//
//         for (int bit = 1; bit < (1 << colLen); bit++) {
//             boolean minimal = true;
//             for (int key : candidateKeys) {
//                 if ((key & bit) == key) { minimal = false; break; }
//             }
//             if (!minimal) continue;
//
//             Set<String> set = new HashSet<>();
//             for (int r = 0; r < rowLen; r++) {
//                 StringBuilder sb = new StringBuilder();
//                 for (int c = 0; c < colLen; c++) {
//                     if ((bit & (1 << c)) != 0) sb.append(relation[r][c]);
//                 }
//                 set.add(sb.toString());
//             }
//             if (set.size() == rowLen) candidateKeys.add(bit);
//         }
//         return candidateKeys.size();
//     }
// }
//endregion