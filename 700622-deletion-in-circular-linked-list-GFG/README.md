# [Deletion in Circular Linked List](https://www.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1)
## Medium
You are given a Circular Linked List and an integer key representing a node. Delete the first occurrence of given key node in circular linked list and return the head of the modified linked list.Note: 

You don't have to print anything, just return the head of the modified list in each function.
The key may or may not be present.

Examples:
Input: key = 8,    Output: 1 -&gt; 7 -&gt; 10Explanation: After deleting 8 from the given circular linked list, it has elements as 1, 7, 10.    
Input: key = 8,    Output: 2 -&gt; 5 -&gt; 7 -&gt; 10
Explanation: After deleting 8 from the given circular linked list, it has elements as 2, 5, 7, 10.    
Constraints:1 ≤ number of nodes&nbsp;≤&nbsp;1050 ≤ node -&gt; data, key ≤&nbsp;105