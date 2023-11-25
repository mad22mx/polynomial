package polynomial_group;

public class LinkedList {
	public Node head; //data field
	
	public LinkedList() { //constructor
		head = null;
	}
	
	public LinkedList(int coefficient, int exponent ) { //constructor overloaded
		head = new Node(coefficient, exponent, null);
	}
	
	public boolean isEmpty() { //checks if there is a linked list created 
		return head == null;
	}
	
	public void deleteAllNodes() { // deletes the linked list
		head = null;
	}
	
	public void addNode(int coefficient, int exponent) {
		Node currNode =	head;
		Node newNode = new Node(coefficient, exponent, null);
		while (currNode != null) {
			currNode = currNode.next;
		}
		currNode = newNode;
	}
	public int getCoefficient() {
		return head.coefficient;
	}
	public int getExponent() {
		return head.exponent;
	}
	
	/*
	public void displayList() { // prints the linked list
		Node curr = _head;
		int num = 0;
		
		System.out.print("The list is: ");
		while(curr != null) {
			System.out.print(curr._data + " ");
			curr = curr._next;
			num++;
		}
		System.out.println();
		System.out.println("The number of elements in the list is " + num);
	}
	
	public boolean hasCycle() {
		Node ptr1 = _head;
		Node ptr2 = _head;
		
		do {
			if(ptr1 == null)
				return false;
			if(ptr2 == null)
				return false;
			
			ptr1 = ptr1._next;
			if(ptr2._next != null)
				ptr2 = ptr2._next._next;
			else return false;	
		} while(ptr1 != ptr2);
		
		return true;
	}
	*/
	/*
	public Node insertNode(int index, int x) {
		if (index < 0) return null;	
		
		int currIndex = 1;
		Node currNode =	_head;
		while (currNode != null && index > currIndex) {
			currNode = currNode._next;
			currIndex++;
		}
		if (index > 0 && currNode == null) return null;
		
		Node newNode = new	Node(x, null);
		if (index == 0) {
			newNode._next = _head;
			_head =	newNode;
		}
		else {
			newNode._next = currNode._next;
			currNode._next = newNode;
		}
		return newNode;
	}
	*/

	/*
	public void insert(int index, int newItem1, int newItem2) {
		Node newNode1 = new Node();
		Node newNode2 = new Node();
		newNode1._data = newItem1;
		newNode2._data = newItem2;
		Node node = find(index); //returns the node at "index"
		if(node == null) {
			//this fn assumes the argument passed is always in bounds of the list size.
			newNode2.next = _head;
			newNode1.next = newNode2;
			_head = newNode1;
		}
		else {
			newNode2.next = node.next;
			newNode1.next = newNode2;
			node.next = newNode1;
		}
	}
	public Node find(int index) {
        	if (index < 0) return null; // Invalid index, return null
        		
        	Node current = _head; // Start from the current node
        	for (int i = 0; i < index && current != null; i++) {
			current = current._next; // Move to the next node
        	}
        	
		return current; // Returns the node at the specified index, or null if not found
	}
	
	public int findNode(int x) {
		Node currNode = _head;
		int currIndex =	1;
		while (currNode != null && currNode._data != x) {
			currNode = currNode._next;
			currIndex++;
		}
		if (currNode != null) return currIndex;
		return 0;
	}
	
	public void findNodeAll(int x) {
		Node currNode =	_head;
		int currIndex =	1;
		while (currNode != null) {
			if(currNode._data == x)
				System.out.print(currIndex + " ");
			
			currNode = currNode._next;
			currIndex++;
		}
	}
	
	public int deleteNode(int x) {
		Node prevNode =	null;
		Node currNode =	_head;
		int currIndex =	1;
		while (currNode != null && currNode._data != x) {
			prevNode = currNode;
			currNode = currNode._next;
			currIndex++;
		}
		if (currNode != null) {
			if (prevNode != null) {
				prevNode._next = currNode._next;
			}
			else {
				_head =	currNode._next;
			}
			return currIndex;
		}
		return 0;
	}
	*/
}
