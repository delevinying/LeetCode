import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 *
 * https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/description/
 *
 * algorithms
 * Easy (58.63%)
 * Total Accepted:    3K
 * Total Submissions: 5.2K
 * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
 *
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 * 
 * 例如，给定一个 3叉树 :
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 返回其层序遍历:
 * 
 * [
 * ⁠    [1],
 * ⁠    [3,2,4],
 * ⁠    [5,6]
 * ]
 * 
 * 
 * 
 * 
 * 说明:
 * 
 * 
 * 树的深度不会超过 1000。
 * 树的节点总数不会超过 5000。
 * 
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    // private List<List<Integer>> alllist = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        List<Node> list1=new ArrayList<Node>();
        if(root==null){
            return lists;
        }
        list1.add(root);
         Node temp;
        while(list1.size()>0){
             List<Node> list2=new ArrayList<Node>();
             List<Integer> inner=new ArrayList<Integer>();
            for(int i=0;i<list1.size();i++){
                temp=list1.get(i);
                inner.add(temp.val);
                List<Node> children=temp.children;
                  for(int j=0;children!=null &&j<children.size();j++){
                      list2.add(children.get(j));
                  }
                
            }
            lists.add(inner);
            list1=list2;
            
        }
        return lists;
    }
}
