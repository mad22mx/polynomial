package polynomial_group;

public class LinkedList {
	public Node head; 
	
	public LinkedList() { 
		head = new Node();
	}
	
	public LinkedList(int coefficient, int exponent ) { 
		head = new Node(coefficient, exponent, null);
	}
	
	public boolean isEmpty() { 
		return head == null;
	}
	
	public void deleteAllNodes() { 
		head = null;
	}
	
	public void addNode(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent, null);
        if (head == null) {
            head = newNode;
        }
        else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
	
	public void displayList() { // prints the linked list
		Node curr = head;
		int num = 0;
		
		System.out.print("The list is: ");
		while(curr != null) {
			System.out.print(curr.coefficient + "x^"+ curr.exponent + " ");
			curr = curr.next;
			num++;
		}
		System.out.println();
		System.out.println("The number of elements in the list is " + num);
	}
	

}
