Instructor: Jun Yi
Due: 11/11/2021, 11:00 pm

(70 points )In this problem, you will be given a binary tree represented as an array. Your job will be to verify if it is a binary search tree or not.

Input will be given as a space-separated array representing a binary tree as we discussed in class, with the root node occupying the 0th index, the root node's children occupying indices 1 and 2, their children occupying indices 3-6, etc. All trees will be balanced, and will be flled left to right in the bottom layer. For example, the array [10,5,15,2,7,11,25,1] represents the below graph:
 
                        10
                  5            15
            2          7     11   25
        1
  
Thus, if you are given the following input:

10 5 15 2 7 11 25 1

then you should print:

true

since this tree is indeed a binary search tree. As another example, the input 2 4 5 does not represent a binary search tree since the number 2 is less than both its children (4 and 5).

2) (30 points) explain the time complexity and space complexity of your method.