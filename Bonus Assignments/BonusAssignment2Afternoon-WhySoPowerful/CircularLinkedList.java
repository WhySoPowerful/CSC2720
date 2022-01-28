/* Definition:A circular linked list is a variation of a linked list in which the last node points to the first node, completing a full circle of nodes. In other words, this variation of the linked list doesn't have a null element at the end.

With this simple change, we gain some benefits:

-->Any node in the circular linked list can be a starting point
-->Consequently, the whole list can be traversed starting from any node
-->Since the last node of the circular linked list has the pointer to the first node, it's easy to perform enqueue and dequeue operations
-->All in all, this is very useful in the implementation of the queue data structure.

Performance-wise, it is the same as other linked list implementations except for one thing: Traversing from the last node to the head node can be done in constant time. With conventional linked lists, this is a linear operation. */

import java.util.Scanner;
public class CircularLinkedList {  //initilaizing a Circular linked list
private Node head = null;
private Node tail = null;

// ....{
class Node {

int value;
Node nextNode;

public Node(int value) {
this.value = value;
}
}
}public void addNode(int value) {   //Adding a new node(time to add each node is O(n))
Node newNode = new Node(value);

if (head == null) {
head = newNode;
} else {
tail.nextNode = newNode;
}

tail = newNode;
tail.nextNode = head;
}
private CircularLinkedList createCircularLinkedList() {   //go through the lines carefully
CircularLinkedList cll = new CircularLinkedList();

cll.addNode(13);
cll.addNode(7);
cll.addNode(24);
cll.addNode(1);
cll.addNode(8);
cll.addNode(37);
cll.addNode(46);

return cll;
}
public boolean containsNode(int searchValue) {
Node currentNode = head;

if (head == null) {
return false;
} else {
do {
if (currentNode.value == searchValue) {
return true;
}
currentNode = currentNode.nextNode;
} while (currentNode != head);
return false;
}
}
}

// Time complexity in Circular linked list :Insertion is only O(1) for ArrayList if you're inserting at the end. For the middle, it's O(n), with a larger constant than the O(n) for LinkedList. (It's faster to iterate to find the middle of the list than it is to move the second half of the list down one spot in the array.)