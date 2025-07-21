package datastructures.string;

public class Practice {
    public static void main(String[] args) {
        String s = "hello";

        // ✅ 1. 문자열 길이
        // TODO: s.length() 출력

        // ✅ 2. 특정 문자 접근
        // TODO: s.charAt(1) 사용

        // ✅ 3. 부분 문자열
        // TODO: s.substring(1, 3)

        // ✅ 4. 문자열 비교
        // TODO: equals()로 "hello" 비교

        // ✅ 5. 뒤집기
        // TODO: StringBuilder().reverse() 사용
    }

    //region ✅ 정답
    /*
    System.out.println(s.length());
    char ch = s.charAt(1);
    String sub = s.substring(1, 3);
    boolean eq = s.equals("hello");
    String reversed = new StringBuilder(s).reverse().toString();
    */
    //endregion

    //region 📌 해설
    /*
    - length(): 문자열 길이
    - charAt(): 인덱스 문자
    - substring(start, end): end는 미포함
    - equals(): 문자열 비교
    - StringBuilder.reverse(): 뒤집기
    */
    //endregion
}