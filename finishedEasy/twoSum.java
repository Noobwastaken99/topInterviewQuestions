package finishedEasy;
/* Question 1. Two Sum (easy)
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

public class twoSum {

    public static void main(String[] args) {
        int nums1[] = {2,7,11,15};
        int target1 = 9;
        int nums2[] = {3,2,4};
        int target2 = 6;
        int nums3[] = {3,3};
        int target3 = 6;

        int ans1[] = solution(nums1, target1);
        int ans2[] = solution(nums2, target2);
        int ans3[] = solution(nums3, target3);

        System.out.println(java.util.Arrays.toString(ans1));
        System.out.println(java.util.Arrays.toString(ans2));
        System.out.println(java.util.Arrays.toString(ans3));
    }

    public static int[] solution(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (nums[i]+nums[j]==target && i!=j) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

//Try to figure how Hash tables work and the one&two pass solutions as well
