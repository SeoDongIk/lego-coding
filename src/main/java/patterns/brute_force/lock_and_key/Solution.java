package lock_and_key;

public class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        // TODO: 자물쇠와 열쇠 문제 구현
        return false;
    }
}

//region ✨
// public class Solution {
//     public boolean solution(int[][] key, int[][] lock) {
//         int n = lock.length, m = key.length;
//         for (int dr = -m; dr <= n; dr++) {
//             for (int dc = -m; dc <= n; dc++) {
//                 if (match(key, lock, dr, dc)) return true;
//             }
//         }
//         return false;
//     }
//
//     private boolean match(int[][] key, int[][] lock, int dr, int dc) {
//         int n = lock.length, m = key.length;
//         for (int rot = 0; rot < 4; rot++) {
//             boolean valid = true;
//             outer: for (int r = 0; r < n; r++) {
//                 for (int c = 0; c < n; c++) {
//                     int keyVal = 0;
//                     int nr = r + dr, nc = c + dc;
//                     if (nr >= 0 && nr < m && nc >= 0 && nc < m) keyVal = getRotated(key, nr, nc, rot);
//                     if ((lock[r][c] == 1 && keyVal == 1) || (lock[r][c] == 0 && keyVal == 0)) {
//                         valid = false; break outer;
//                     }
//                 }
//             }
//             if (valid) return true;
//         }
//         return false;
//     }
//
//     private int getRotated(int[][] key, int r, int c, int rot) {
//         int m = key.length;
//         if (rot == 0) return key[r][c];
//         if (rot == 1) return key[c][m - 1 - r];
//         if (rot == 2) return key[m - 1 - r][m - 1 - c];
//         return key[m - 1 - c][r];
//     }
// }
//endregion