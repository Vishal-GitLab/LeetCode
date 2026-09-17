# [Top K Frequent in Array](https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1)
## Medium
Given a non-empty integer array arr[]. Your task is to find and return the top k elements which have the highest frequency in the array. 
Note:&nbsp;If two numbers have the same frequency, the larger number should be given the higher priority.
Examples:
Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2Output: [4, 1]Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1.
Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4Output: [5, 11, 7, 10]
Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1.
Constraints: 1&nbsp;≤ arr.size()&nbsp;≤&nbsp;1051 ≤&nbsp;arr[i] ≤ 1051&nbsp;≤ k&nbsp;≤&nbsp;no. of distinct elements
