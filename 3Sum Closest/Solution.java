public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        //sort the array
        Arrays.sort(nums);
        int sum = 0;
        int dev = Integer.MAX_VALUE;
        int[] temp = new int[2];
        //caculate the sum of two numbers which is closet to (target - nums[i])
        for (int i = 0; i < nums.length - 2; i++) {
            temp = twoSumCloset(nums, target - nums[i], i + 1, nums.length - 1);
            if (temp[1] == 0) {
                sum = target;
                dev = 0;
                break;
            }
            if (temp[1] < dev) {
                sum = temp[0] + nums[i];
                dev = temp[1];
            }
        }
        
        return sum;
    }
    
    public int[] twoSumCloset(int[] a, int target, int start, int end) {
        int[] res = new int[2];
        int sum = 0;
        int cur = 0;
        int dev = Integer.MAX_VALUE;
        while (start < end) {
            cur = a[start] + a[end];
            if (cur < target) {
                if (target - cur < dev) {
                    sum = cur;
                    dev = target - cur;
                }
                start++;
            }
            else if (cur > target) {
                if (cur - target < dev) {
                    sum = cur;
                    dev = cur - target;
                }
                end--;
            }
            else {
                sum = target;
                dev = 0;
                break;
            }
        }
        res[0] = sum;
        res[1] = dev;
        return res;
    }
}