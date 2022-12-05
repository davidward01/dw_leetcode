import java.util.Arrays;

public class TwoSumII {
    public static int [] twoSum(int[] numbers, int target) {

        // initiate pointers
        int len = numbers.length;
        int left = 0, right = len - 1;

        // conditional logic to work pointers from outside in and check for target
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }


    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
