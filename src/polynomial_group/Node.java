package polynomial_group;

public class Node {
	public int coefficient;
	public int exponent;
	public Node next;
	
	public Node() {
		
	}
	
	public Node(int coefficient, int exponent, Node next) {
		this.coefficient = coefficient;
		this.exponent = exponent;
		this.next = next;
	}
	
}
