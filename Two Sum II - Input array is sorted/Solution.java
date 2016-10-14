public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //head pointer
        int i =0;
        //tail pointer
        int j = numbers.length - 1;
        
        int sum = 0;
        int[] res = new int[2];
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            }
            else if (sum > target) {
                //binary search
                j = Arrays.binarySearch(numbers, numbers[j]) - 1;
            }
            else {
                //return
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }
        }
        
        //in case of non-return
        throw new RuntimeException("not found!");
    }
    
    public int[] filter(int[] a, int b) {
        int head = 0;
        int end = a.length - 1;
        while ( head < end - 1) {
            int center = (head + end)/2;
            if (a[center] >= b) {
                end = center;
            }
        }
    }
}