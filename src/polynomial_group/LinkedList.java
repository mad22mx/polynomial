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
    public static void deleteNode(LinkedList list, int coefficient, int exponent) {
        Node currNode = list.head;
        Node prevNode = null;

        // If the node to be deleted is the head
        if (currNode != null && currNode.coefficient == coefficient && currNode.exponent == exponent) {
            list.head = currNode.next;
            return;
        }

        // Search for the node to be deleted ... keza kelele wede tach yhedal
        while (currNode != null && (currNode.coefficient != coefficient || currNode.exponent != exponent)) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // If the node with the given coefficient and exponent is not found
        if (currNode == null) {
            System.out.println("Node not found in the list");
            return;
        }

        // Unlink the node from the linked list
        prevNode.next = currNode.next;
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
