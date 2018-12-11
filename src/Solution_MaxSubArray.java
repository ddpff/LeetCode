/**
 * @Author: ddpff
 * @Description:给定一个整数数组 nums ，找到一个具有最大和的连续子数组
 *                              （子数组最少包含一个元素），返回其最大和。
 * @Date: Create in 21:05 2018\12\11 0011
 * @Modified By:
 */
public class Solution_MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}
