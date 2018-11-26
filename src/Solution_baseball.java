import java.util.Stack;

/**
 * @Author: ddpff
 * @Description:
 * 你现在是棒球比赛记录员。
    给定一个字符串列表，每个字符串可以是以下四种类型之一：
    1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
    2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
    3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
    4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
    每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
    你需要返回你在所有回合中得分的总和。
 * @Date: Create in 19:00 2018\11\26 0026
 * @Modified By:  用stack操作 ，stack.peek()会返回栈顶的元素但不会消除栈顶的元素，stack.pop（）会
 * 消除栈顶的元素,stack存放每轮的分数。
 */
public class Solution_baseball {
    public int calPoints(String[] ops){
        if(ops==null||ops.length==0){
            return 0;
        }
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(String s:ops){
            if (s.equals("+")){
                int score1=stack.pop();
                int score2=stack.peek();
                stack.push(score1);
                stack.push(score1+score2);
                sum+=stack.peek();
            }else if(s.equals("D")){
                stack.push(stack.peek()*2);
                sum+=stack.peek();
            }else if(s.equals("C")){
                sum-=stack.pop();
            }else {
                stack.push(Integer.valueOf(s));
                sum+=stack.peek();
            }
        }
        return sum;
    }
}
