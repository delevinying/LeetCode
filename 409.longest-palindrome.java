/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 *
 * https://leetcode-cn.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (45.64%)
 * Total Accepted:    3.3K
 * Total Submissions: 7.2K
 * Testcase Example:  '"abccccdd"'
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * 
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * 
 * 示例 1: 
 * 
 * 
 * 输入:
 * "abccccdd"
 * 
 * 输出:
 * 7
 * 
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * 
 * 
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for(char c:s.toCharArray()){
            map[c]++; 
        }
        int t = 0,carry = 0;
        for(int i = 0;i<128;i++){
            if(map[i] > 0){
                if((map[i] & 1) == 1) carry = 1; 
                t+=map[i] / 2;
            }
        }
        return t * 2 + carry;
    }
}
