package polynomial_group;

public class Main {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial(3, 4);
		p1.addNode(-4, 3);
		p1.addNode(5, 1);
		System.out.print("P1: ");
		p1.list.displayList();
		System.out.println();
		
		Polynomial p2 = new Polynomial(2, 4);
		p2.addNode(1, 5);
		p2.addNode(-1, 1);
		System.out.print("P2: ");
		p2.list.displayList();
		System.out.println();
		
		System.out.print("Sum: ");
		Polynomial.print(Polynomial.add(p1, p2));
		System.out.println();
		System.out.println();
		
		System.out.print("Difference: ");
		Polynomial.print(Polynomial.subtract(p1, p2));
		System.out.println();
		System.out.println();
		
		System.out.print("Product: ");
		Polynomial.print(Polynomial.multiply(p1, p2));
		
		

	}

}
