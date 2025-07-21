package operations.typeconversion;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. int → char
        // TODO: int를 char로 변환하는 코드를 작성하시오.

        // ✅ 2. char → int
        // TODO: char를 int로 변환하는 코드를 작성하시오.

        // ✅ 3. String → int
        // TODO: 문자열을 정수로 변환하는 코드를 작성하시오.

        // ✅ 4. int → String
        // TODO: 정수를 문자열로 변환하는 코드를 작성하시오.
    }

    //region ✨ 정답
    /*
    char c = (char)(48 + 5);
    int num = '9' - '0';
    int val = Integer.parseInt("123");
    String str = String.valueOf(123);
    */
    //endregion

    //region 📌 해설
    /*
    - (char)(48+i): 아스키 코드 변환
    - c - '0': 문자 숫자 → 정수
    - Integer.parseInt(): 문자열 → 정수
    - String.valueOf(): 정수 → 문자열
    */
    //endregion
}