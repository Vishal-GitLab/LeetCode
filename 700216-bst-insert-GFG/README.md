# [BST Insert](https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1)
## Easy
Given the&nbsp;root&nbsp;of a&nbsp;binary search tree and a value&nbsp;key. Insert a new node with a value equal to&nbsp;key&nbsp;into the tree and&nbsp;return the&nbsp;root&nbsp;of the modified tree after inserting the value.&nbsp;
Note:&nbsp;All the nodes have distinct values in the BST and the new value to be inserted is not present in the BST.
Examples :
Input: root = [2, 1, 3], key = 4
Output: [2, 1, 3, N, N, N, 4]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4].

Input: root = [2, 1, 3, N, N, N, 6], key = 4Output: [2, 1, 3, N, N, N, 4, N, 6]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4, N, 6].
Constraints:1 ≤ number of nodes ≤ 1051 ≤ node-&gt;data ≤ 1091 ≤ key ≤ 109