/**
 * @Author: ddpff
 * @Description:假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
                每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
                注意：给定 n 是一个正整数。
 * @Date: Create in 21:02 2018\11\27 0027
 * @Modified By:
 */
public class Solution_ClimbingStairs {
    /**
     * 递归f(n)=f(n-1)+f(n-2)
    * */
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}

/**
 * 递归方法优化
 * */
class Solution2{
    public int climbStairs(int n){
        return 0;
    }
}