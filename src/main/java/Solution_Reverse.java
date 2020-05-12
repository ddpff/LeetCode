/**
 * @Author: ddpff
 * @Description:
 * @Date: Create in 14:54 2018\11\25 0025
 * @Modified By:给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 *              %10 取余得到最低位，然后不断对取到的数*10，得到翻转的数
 *              数字反转通过  取余和取商实现数字剥离。
 */

public class Solution_Reverse {
    public int reverse(int x) {
        int res=0;
        while(x!=0){
            //int result=x%10;
            int temp=res*10+x%10;
            x=x/10;
            /**
             * 这个判断用于判断是否翻转溢出，temp/10如果等于还没*10的res的话说明temp没有溢出
             * 溢出的话赋0，终止
            * */
           if (temp/10!=res){
                res=0;
                break;
            }
            res=temp;
        }
        return res;
    }
}
