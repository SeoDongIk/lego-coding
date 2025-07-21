package datastructures.stringbuilder;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. StringBuilder 생성
        // TODO: 새로운 StringBuilder 생성

        // ✅ 2. 문자열 추가
        // TODO: append()로 문자열 추가

        // ✅ 3. 특정 위치에 삽입
        // TODO: insert()로 "X" 추가

        // ✅ 4. 문자열 삭제
        // TODO: delete()로 일부 문자열 제거

        // ✅ 5. 문자열 변환
        // TODO: toString()으로 변환
    }

    //region ✅ 정답
    /*
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.insert(1, "X");
    sb.delete(1, 2);
    String result = sb.toString();
    */
    //endregion

    //region 📌 해설
    /*
    - append(): 끝에 문자열 추가
    - insert(pos, str): 특정 위치에 삽입
    - delete(start, end): 문자열 삭제
    - toString(): 문자열 변환
    */
    //endregion
}