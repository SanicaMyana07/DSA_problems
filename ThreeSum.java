package questions;

    import java.util.*;

    public class ThreeSum {
        public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); // Step 1: Sort the array
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for 'i'

                int left = i + 1, right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicate elements for left pointer
                        while (left < right && nums[left] == nums[left + 1]) left++;

                        // Skip duplicate elements for right pointer
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < 0) {
                        left++; // Move left pointer forward to increase sum
                    }
                    else {
                        right--; // Move right pointer backward to decrease sum
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] nums = {-4, -1, -1, 0, 1, 2};
            System.out.println(threeSum(nums));
        }


}
