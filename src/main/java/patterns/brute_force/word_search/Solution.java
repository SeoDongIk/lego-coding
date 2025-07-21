package word_search;

public class Solution {
    public boolean exist(char[][] board, String word) {
        // TODO: 보드에서 word를 찾는 메인 메서드 작성
        return false;
    }

    private boolean backtrack(char[][] board, int r, int c, String word, int index) {
        // TODO: DFS + 백트래킹 로직 작성
        return false;
    }
}

//region ✨
// public class Solution {
//     private final int[] dr = {1, 0, -1, 0};
//     private final int[] dc = {0, 1, 0, -1};
//
//     public boolean exist(char[][] board, String word) {
//         int m = board.length, n = board[0].length;
//         for (int r = 0; r < m; r++) {
//             for (int c = 0; c < n; c++) {
//                 if (board[r][c] == word.charAt(0)) {
//                     char temp = board[r][c];
//                     board[r][c] = '.';
//                     if (backtrack(board, r, c, word, 0)) return true;
//                     board[r][c] = temp;
//                 }
//             }
//         }
//         return false;
//     }
//
//     private boolean backtrack(char[][] board, int r, int c, String word, int index) {
//         if (index == word.length() - 1) return true;
//         int m = board.length, n = board[0].length;
//         for (int i = 0; i < 4; i++) {
//             int nr = r + dr[i], nc = c + dc[i];
//             if (nr >= 0 && nr < m && nc >= 0 && nc < n && board[nr][nc] == word.charAt(index + 1)) {
//                 char temp = board[nr][nc];
//                 board[nr][nc] = '.';
//                 if (backtrack(board, nr, nc, word, index + 1)) return true;
//                 board[nr][nc] = temp;
//             }
//         }
//         return false;
//     }
// }
//endregion