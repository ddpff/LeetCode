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
 * F(3)=f(2)+f(1)  2+1
 * F(4)=f(3)+f(2)
 * cur=f2+f1;
 * 下一个cur，f2=cur f1=f2;
 * 把递归转化为循环
 * */
class Solution2{
    public int climbStairs(int n){
        if(n<3){
            return n;
        }
        int f2=2;
        int f1=1;
        int cur=0;
        for(int i=3;i<=n;i++){
            cur=f2+f1;
            f1=f2;
            f2=cur;
        }
        return cur;
    }
}