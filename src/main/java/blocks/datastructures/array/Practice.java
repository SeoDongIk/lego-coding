package datastructures.array;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. 배열 생성 & 길이
        // TODO: 길이 5짜리 int 배열 생성
        // TODO: 배열 길이 출력

        // ✅ 2. 배열 초기화
        // TODO: Arrays.fill()로 배열의 모든 값을 7로 채우기

        // ✅ 3. 배열 복사
        // TODO: arr을 clone()을 이용해 복사

        // ✅ 4. 2차원 배열 생성 & 길이 확인
        // TODO: 2행 3열짜리 int 2차원 배열 생성
        // TODO: 행과 열 개수 출력

        // ✅ 5. 2차원 배열 깊은 복사
        // TODO: 행 단위로 clone()하여 복사하기

        // ✅ 6. 배열 정렬
        // TODO: Arrays.sort() 사용하여 오름차순 정렬
    }

    //region ✅ 정답
    /*
    int[] arr = new int[5];
    System.out.println(arr.length);

    Arrays.fill(arr, 7);

    int[] copy = arr.clone();

    int[][] board = new int[2][3];
    System.out.println(board.length);
    System.out.println(board[0].length);

    int[][] copy2D = new int[board.length][];
    for (int i = 0; i < board.length; i++) {
        copy2D[i] = board[i].clone();
    }

    int[] nums = {3, 1, 2};
    Arrays.sort(nums);
    */
    //endregion

    //region 📌 해설
    /*
    - new int[5]: 길이 5 배열 생성
    - arr.length: 배열 길이
    - Arrays.fill(arr, value): 배열 전체 초기화
    - clone(): 1D 배열 복사
    - 2D 배열 깊은 복사 → 행 단위 clone()
    - Arrays.sort(): 오름차순 정렬
    */
    //endregion
}