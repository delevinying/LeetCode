/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 *
 * https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/description/
 *
 * algorithms
 * Easy (43.92%)
 * Total Accepted:    2.2K
 * Total Submissions: 5K
 * Testcase Example:  '26'
 *
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 * 
 * 注意:
 * 
 * 
 * 十六进制中所有字母(a-f)都必须是小写。
 * 
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入:
 * 26
 * 
 * 输出:
 * "1a"
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入:
 * -1
 * 
 * 输出:
 * "ffffffff"
 * 
 * 
 */
class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        int i=8;
        String s="";
        int n;
        while(i>0){
            if(num==0){
                break;
            }
            if(num<0){
              int tmp=num;
              tmp=(tmp<<1)>>>1; 
              n=tmp%16;  
            }else{
              n=num%16;  
            }
            num=num>>>4;
            if(n<=9){
              s=n+s; 
            }else{
              n='a'+n-10;
              s=(char)n+s;   
            }
            i--;
        }
        return s;
        // if(num < 0){
        //     return "ffffffff";
        // }
        // if(num == 0){return "0";}
        // String s ="";
        // while(num > 0){
        //     int t = num%16;
        //     String b = ""+t;
        //     if(t==10)
        //         b = "a";
        //     if(t == 11)
        //         b = "b";
        //     if(t == 12)
        //         b = "c";
        //     if(t == 13)
        //         b = "d";
        //     if(t == 14)
        //         b = "e";
        //     if(t == 15)
        //         b = "f";
        //     s += b;
        //     num /=16;
        // }
        // // return s.rese
        // StringBuilder str = new StringBuilder(s);
        // return new String(str.reverse());
    }
}
