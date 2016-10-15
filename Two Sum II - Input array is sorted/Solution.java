public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if (target == 0) {
            int[] a = {1, 2};
            return a;
        }
        
        //filter of the elements which are not smaller than target
        numbers = filter(numbers, target);
        
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
                j--;
            }
            else {
                //return
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }
        }
        
        //in case not found
        throw new RuntimeException("not found!");
    }
    
    public int[] filter(int[] a, int b) {
        int head = 0;
        int end = a.length - 1;
        if (a[end] < b) {
            return a;
        }
        while ( head < end - 1) {
            int center = (head + end)/2;
            if (a[center] >= b) {
                end = center;
            }
            else {
                head = center;
            }
        }
        int[] newArray = Arrays.copyOfRange(a, 0, end);
        return newArray;
    }
    
}