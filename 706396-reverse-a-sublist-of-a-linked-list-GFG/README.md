# [Reverse a sublist of a linked list](https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1)
## Hard
Given a linked list and positions a and b. Reverse the linked list from position a to b and return the head of the resultant linked list.
Examples:
Input: a = 1, b = 8, Linked List = 1-&gt;7-&gt;5-&gt;3-&gt;9-&gt;8-&gt;10-&gt;2-&gt;2-&gt;5-&gt;NULL
Output: 2 10 8 9 3 5 7 1 2 5Explanation: The nodes from position 1 to 8 are reversed, resulting in 2 10 8 9 3 5 7 1 2 5.

Input: a = 2, b = 4, Linked List = 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;NULL
Output: 1 4 3 2 5 6Explanation: Nodes from position 2 to 4 are reversed resulting in 1 4 3 2 5 6.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)
&nbsp;
Constraints:
1&lt;= size of linked list &lt;=10^5
1&lt;= a&lt;=b&lt;= size of linked list
1&lt;= data of nodes &lt;=109