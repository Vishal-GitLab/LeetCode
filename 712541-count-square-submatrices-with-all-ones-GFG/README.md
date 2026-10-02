# [Count Square Submatrices with All Ones](https://www.geeksforgeeks.org/problems/count-square-submatrices-with-all-ones/1)
## Medium
Given an n × m binary matrix mat[][], count the total number of square submatrices whose every element is 1.Examples :Input: n = 3, m = 3, mat[][] = [[0, 1, 1], [1, 1, 1], [0, 1, 1]]Output: 9Explanation: There are 9 square submatrices containing only 1s:
7 squares of size 1 × 1
2 squares of size 2 × 2
0 squares of size 3 × 3
Therefore, the total number of square submatrices with all 1s is 7 + 2 = 9.Input: n = 3, m = 3 mat[][] = [[1, 0, 1], [1, 1, 0],&nbsp; [1, 1, 0]]Output: 7Explanation: There are 7 square submatrices containing only 1s:
6 squares of size 1 × 1
1 squares of size 2 × 2
0 squares of size 3 × 3
Therefore, the total number of square submatrices with all 1s is 6 + 1 = 7.Constraints:1 ≤ n, m ≤&nbsp; 1030 ≤ mat[i][j]&nbsp;≤ 1