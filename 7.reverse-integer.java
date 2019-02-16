/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (31.27%)
 * Total Accepted:    76.5K
 * Total Submissions: 244.5K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 
 */
class Solution {
    public int reverse(int x) {
        //当心溢出问题
        //可能超出范围
        if(x > 2147483647){return 0;}
        if(x < -2147483648){return 0;}
        String str = x + "";
        boolean isF = str.contains("-");
        str = str.replace("-","");
		StringBuffer sbBuffer =new StringBuffer(str);
		str=sbBuffer.reverse().toString();
        int temp = 0;
        //转化后也可能超出范围
        if(Double.parseDouble(str) > 2147483647){return 0;}
        if(-Double.parseDouble(str) < -2147483648){return 0;}
        if(isF == false){
            temp = Integer.parseInt(str);
        }else{
            temp = -Integer.parseInt(str);
        }
        return temp;
    }
}
