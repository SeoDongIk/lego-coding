package sudoku;

public class Solution {
    public void solveSudoku(char[][] board) {
        // TODO: Sudoku 퍼즐 해결 메서드 작성
    }

    private boolean backtrack(char[][] board, int idx) {
        // TODO: DFS로 숫자 채우기
        return false;
    }

    private boolean isValid(char[][] board, int r, int c, char val) {
        // TODO: 숫자 유효성 체크
        return false;
    }
}

//region ✨
// public class Solution {
//     public void solveSudoku(char[][] board) {
//         backtrack(board, 0);
//     }
//
//     private boolean backtrack(char[][] board, int idx) {
//         if (idx == 81) return true;
//         int r = idx / 9, c = idx % 9;
//         if (board[r][c] != '.') return backtrack(board, idx + 1);
//         for (char num = '1'; num <= '9'; num++) {
//             if (isValid(board, r, c, num)) {
//                 board[r][c] = num;
//                 if (backtrack(board, idx + 1)) return true;
//                 board[r][c] = '.';
//             }
//         }
//         return false;
//     }
//
//     private boolean isValid(char[][] board, int r, int c, char val) {
//         for (int i = 0; i < 9; i++) {
//             if (board[r][i] == val || board[i][c] == val) return false;
//         }
//         int sr = (r / 3) * 3, sc = (c / 3) * 3;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (board[sr + i][sc + j] == val) return false;
//             }
//         }
//         return true;
//     }
// }
//endregion