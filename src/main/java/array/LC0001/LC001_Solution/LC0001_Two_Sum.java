package LC001_Solution;
public class LC0001_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        LC0001_Two_Sum solver = new LC0001_Two_Sum();
        int[] nums = {2,7,11,15};
        int[] result = solver.twoSum(nums, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
