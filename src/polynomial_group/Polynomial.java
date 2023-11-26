package polynomial_group;

public class Polynomial {
	public LinkedList list;
	public Polynomial() {
		list = new LinkedList();
	}
	public Polynomial(int coefficient, int exponent) {
		list = new LinkedList(coefficient, exponent);
	}
	public void addNode(int coefficient, int exponent) {
		list.addNode(coefficient, exponent);
	}
	static Polynomial add(Polynomial p1, Polynomial p2) {
	    Node currNode1 = p1.list.head;
	    Node currNode2 = p2.list.head;
	    Polynomial p = new Polynomial();
	    boolean isAdded = false; //flag for currNode1
	    while (currNode1 != null) {
	    	isAdded = false;
	        currNode2 = p2.list.head;
	        while (currNode2 != null) {
	            if (currNode1.exponent == currNode2.exponent) {
	                int sumCoefficient = currNode1.coefficient + currNode2.coefficient;
	                p.addNode(sumCoefficient, currNode1.exponent);
	                isAdded = true;
	            }
	            currNode2 = currNode2.next;
	        }
	        if(!isAdded) {
	        	p.addNode(currNode1.coefficient, currNode1.exponent);
	        }
	        
	        currNode1 = currNode1.next;
	    }
	    currNode2 = p2.list.head;
	    while(currNode2 != null) {
	    	Node tempNode = p1.list.head;
	        while(tempNode != null) {
	        	if(tempNode.exponent == currNode2.exponent) {
	        		break;
	        	}
	        	tempNode = tempNode.next;
	        	if(tempNode == null) {
	        		p.addNode(currNode2.coefficient, currNode2.exponent);
	        	}
	        }
	        currNode2 = currNode2.next;
	    }

	    return p;
	}

	static Polynomial subtract(Polynomial p1, Polynomial p2) {
		return p1;
	}
	static Polynomial multiply(Polynomial p1, Polynomial p2) {
		return p1;
	}
	static void print(Polynomial p) {
		Node currNode = p.list.head;
		currNode = currNode.next;
		if(currNode.coefficient != 0) {
			System.out.print(currNode.coefficient + "x^" + currNode.exponent);
		}
		
		currNode = currNode.next;
		while(currNode != null) {
			if(currNode.coefficient > 0) {
				System.out.print(" + " + currNode.coefficient + "x^" + currNode.exponent);
			}
			else {
				System.out.print(currNode.coefficient + "x^" + currNode.exponent);
			}
			currNode = currNode.next;
		}
	}
	
}
