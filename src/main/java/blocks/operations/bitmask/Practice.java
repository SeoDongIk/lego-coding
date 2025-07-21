package operations.bitmask;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. 비트 시프트
        // TODO: 1 << 3의 결과 출력

        // ✅ 2. AND 연산
        // TODO: (mask & key) == key 형태 구현

        // ✅ 3. 부분집합 탐색
        // TODO: for문으로 0 ~ (1<<n)-1 반복
    }

    //region ✅ 정답
    /*
    int shift = (1 << 3);
    boolean check = ((mask & key) == key);
    for (int mask = 0; mask < (1 << n); mask++) {
        // 부분집합 처리
    }
    */
    //endregion

    //region 📌 해설
    /*
    - 1 << n: 2^n
    - (mask & key) == key: key가 mask의 부분집합인지 확인
    - 부분집합 탐색: 0 ~ (1<<n)-1 순회
    */
    //endregion
}
