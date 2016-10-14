public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int[] res = new int[2];
        boolean found = false;
        
        for (int i = 0; i < nums.length - 1 && !found; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    res[0] = i;
                    res[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return res;
    }
}