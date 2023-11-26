package polynomial_group;

public class Main {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial(-4, 2);
		p1.addNode(5, 3);
		p1.addNode(2, 6);
		Polynomial p2 = new Polynomial(2, 2);
		p2.addNode(1, 3);
		p1.addNode(1, 1);
		
		Polynomial.print(Polynomial.add(p1, p2));
		
		
		

	}

}
