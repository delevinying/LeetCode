/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (42.80%)
 * Total Accepted:    4.5K
 * Total Submissions: 10.6K
 * Testcase Example:  '"0"\n"0"'
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 
 * 注意：
 * 
 * 
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * 
 * 
 */
class Solution {
    public String addStrings(String num1, String num2) {
        while (num1.length() < num2.length())
    {
        num1 = '0' + num1;
    }
    while (num1.length() > num2.length())
    {
        num2 = '0' + num2;
    }
    String val = "";
    int res = 0;
    for (int i = num1.length() - 1; i >= 0; i--)
    {
        int temp = num1.charAt(i) - '0' + num2.charAt(i) - '0';
        res = res + temp;
        val = ""+(res % 10) + val;
        res /= 10;
    }
    if (res != 0)
        val = "" + (res) + val;
    return val;
    }
}
