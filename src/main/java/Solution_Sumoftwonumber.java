import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ddpff
 * @Description:
 * @Date: Create in 20:44 2018\11\24 0024
 * @Modified By: 两数之和：通hashmap实现
 *              原理为：通过减数组中的数，作为key存放在数组中，然后查看map中是否存在数组中的数；
 */
public class Solution_Sumoftwonumber {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.get(numbers[i])!=null){
                int [] result={map.get(numbers[i]),i};
                return  result;
            }
            map.put(target-numbers[i],i);
        }
        int[] result ={};
        return result;
    }
}
