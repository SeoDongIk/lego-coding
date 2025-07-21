package datastructures.list;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. 리스트 생성
        // TODO: ArrayList<Integer> 생성

        // ✅ 2. 원소 추가
        // TODO: 리스트에 10 추가

        // ✅ 3. 원소 제거
        // TODO: 리스트 마지막 요소 삭제

        // ✅ 4. 리스트 크기 출력
        // TODO: list.size() 출력

        // ✅ 5. 리스트 포함 여부
        // TODO: contains()로 특정 값 확인

        // ✅ 6. 정렬
        // TODO: Collections.sort()로 오름차순 정렬
    }

    //region ✅ 정답
    /*
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.remove(list.size() - 1);
    System.out.println(list.size());
    System.out.println(list.contains(10));
    Collections.sort(list);
    */
    //endregion

    //region 📌 해설
    /*
    - ArrayList: 동적 배열
    - add(): 요소 추가
    - remove(size-1): 마지막 요소 삭제
    - size(): 크기 확인
    - contains(): 포함 여부
    - Collections.sort(): 기본 오름차순
    */
    //endregion
}