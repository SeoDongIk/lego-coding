package datastructures.setmap;

public class Practice {
    public static void main(String[] args) {
        // ✅ 1. HashSet 생성
        // TODO: HashSet<Integer> 생성

        // ✅ 2. 원소 추가
        // TODO: add() 사용

        // ✅ 3. 원소 삭제
        // TODO: remove() 사용

        // ✅ 4. 포함 여부 확인
        // TODO: contains()로 확인

        // ✅ 5. HashMap 생성
        // TODO: HashMap<String, Integer> 생성

        // ✅ 6. 값 추가
        // TODO: put()으로 key-value 추가

        // ✅ 7. 값 가져오기
        // TODO: get()으로 key 값 가져오기

        // ✅ 8. key 존재 여부 확인
        // TODO: containsKey()로 확인
    }

    //region ✅ 정답
    /*
    Set<Integer> set = new HashSet<>();
    set.add(10);
    set.remove(10);
    System.out.println(set.contains(10));

    Map<String, Integer> map = new HashMap<>();
    map.put("apple", 3);
    System.out.println(map.get("apple"));
    System.out.println(map.containsKey("apple"));
    */
    //endregion

    //region 📌 해설
    /*
    - HashSet: 중복 없는 집합
    - add/remove/contains: 기본 연산
    - HashMap: key-value 저장
    - put/get/containsKey: 값 조작
    */
    //endregion
}
