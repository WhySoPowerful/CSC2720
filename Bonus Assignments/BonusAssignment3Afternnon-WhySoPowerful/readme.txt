You are given an array of grade, Each grade[i] = [Ei, Mi] represents the ith English score and Math score.

Reconstruct and return the queue that is represented by the input array grade. The returned queue should be formatted as a linked list queue, where queue[j] = [hj, kj] is the attributes of the jth grade in the queue (queue[0] is the grade at the front of the queue). You need to guarantee that the average of queue[j] =(hj+ kj)/2 is smaller than queue[j+1].If two grades have the same average grade, then don't change the relative order of these two grade. 

For example,

Input: grade = [[20,10],[30,30],[50,40],[40,50],[10,40]]

Output: a linked list Q: [[20,10],[10,40],[30,30],[50,40],[40,50]

Explanation:
Grade 0 has average grade 15 which is the lowest grade among this four, thus it is the first one.

Grade 2 has the same average grade like grade 3, thus grade 2 is in front of grade 3 in the output. We don't change the order. 

Grade 3 has average grade 45 which is the highest grade among this four, thus it is the first one. 

1) (50 points)Required to test:

Input: [[12,14],[16,18],[80,60],[68,58],[48,98],[76,56]]

2) (50 points) based on the input, add [58,78] in the queue. 

Note: 

This example tell us that we can save more than one value in the queue node. Also, we need to change the basic queue Data Structure and the corresponding methods based on specific applications.  