package binary_search;

public class Solution {
    public int search(int[] nums, int target) {
        // TODO: 재귀형 이진 탐색 구현
        return -1;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        // TODO: 이진 탐색 로직 작성
        return -1;
    }
}

//region ✨
// public class Solution {
//     public int search(int[] nums, int target) {
//         return binarySearch(nums, 0, nums.length - 1, target);
//     }
//
//     private int binarySearch(int[] nums, int left, int right, int target) {
//         if (left > right) return -1;
//         int mid = left + (right - left) / 2;
//         if (nums[mid] == target) return mid;
//         else if (nums[mid] < target) return binarySearch(nums, mid + 1, right, target);
//         else return binarySearch(nums, left, mid - 1, target);
//     }
// }
//endregion