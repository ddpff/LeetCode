import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ddpff
 * @Description:给定一个整数数组，判断是否存在重复元素。
            如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * @Date: Create in 20:39 2018\11\28 0028
 * @Modified By:通过set的value不可重复性，判断是否存在重复
 */
public class Solution_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet=new HashSet<>();
        for(int a:nums){
            if (integerSet.contains(a)){
                return true;
            }else {   //加else和不加else的运行速度不同，加else判断速度更快
                integerSet.add(a);
            }
        }
        return false;
    }
}
