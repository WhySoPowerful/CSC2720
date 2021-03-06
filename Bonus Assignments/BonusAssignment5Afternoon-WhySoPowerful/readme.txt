Instructor: Jun Yi

Due: 11/18/2021

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

(1) Search for a node to remove.

(2) If the node is found, delete the node

For example,

        5                            5
     6     3                      4     6 
    2  4     7                 2          7

Input: root = [5,3,6,2,4,null,7], key = 3

Output: [5,4,6,2,null,null,7]


Explanation: Given key to delete is 3. So we find the node with value 3 and delete it. One valid answer is [5,4,6,2,null,null,7], shown in the above BST.

Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.