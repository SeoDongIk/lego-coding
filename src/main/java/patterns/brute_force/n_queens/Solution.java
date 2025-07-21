package n_queens;

public class Solution {
    public java.util.List<java.util.List<String>> solveNQueens(int n) {
        // TODO: N-Queens 메서드 작성
        return null;
    }

    private void backtrack(int row, char[][] board, java.util.List<java.util.List<String>> ans, int n) {
        // TODO: 퀸 배치 백트래킹
    }

    private boolean isValid(char[][] board, int r, int c, int n) {
        // TODO: 퀸 배치 유효성 검사
        return false;
    }
}

//region ✨
// import java.util.ArrayList;
// import java.util.List;
//
// public class Solution {
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> ans = new ArrayList<>();
//         char[][] board = new char[n][n];
//         for (char[] row : board) java.util.Arrays.fill(row, '.');
//         backtrack(0, board, ans, n);
//         return ans;
//     }
//
//     private void backtrack(int row, char[][] board, List<List<String>> ans, int n) {
//         if (row == n) {
//             List<String> solution = new ArrayList<>();
//             for (char[] r : board) solution.add(new String(r));
//             ans.add(solution);
//             return;
//         }
//         for (int col = 0; col < n; col++) {
//             if (isValid(board, row, col, n)) {
//                 board[row][col] = 'Q';
//                 backtrack(row + 1, board, ans, n);
//                 board[row][col] = '.';
//             }
//         }
//     }
//
//     private boolean isValid(char[][] board, int r, int c, int n) {
//         for (int i = 0; i < r; i++) if (board[i][c] == 'Q') return false;
//         for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
//         for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) if (board[i][j] == 'Q') return false;
//         return true;
//     }
// }
//endregion