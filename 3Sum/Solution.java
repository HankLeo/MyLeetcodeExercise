public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            //do not iterate positive numbers
            if (nums[i] > 0) {
                break;
            }
            //do not caculate duplicated numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            List<List<Integer>> element = twoSum(nums, -nums[i], i + 1, nums.length - 1);
            if (element != null) {
                list.addAll(element);
            }
            
        }
        
        return list;
    }
    
    public List<List<Integer>> twoSum(int[] a, int target, int start, int end) {
        List<List<Integer>> res = new ArrayList<>();
                boolean found = false;
        int sum = 0;
        int m = 0;
        int n = 0;
        
        while (start < end) {
            sum = a[start] + a[end];
            if (sum < target) {
                start++;
            }
            else if (sum > target) {
                end--;
            }
            //find all but not duplicated
            else {
                List<Integer> list = new ArrayList<>();
                found = true;
                list.add(-target);
                m = a[start];
                n = a[end];
                list.add(m);
                list.add(n);
                res.add(list);
                start++;
                end--;
                while (a[start] == m && start < end) {
                    start++;
                }
                while (a[end] == n && start < end) {
                    end--;
                }
            }
        }
        if (found == true) {
            return res;
        }
        else {
            return null;
        }
    }
}