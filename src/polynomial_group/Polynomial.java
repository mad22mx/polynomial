package polynomial_group;

public class Polynomial {
	public LinkedList list = new LinkedList();
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
		if(p1.list.head.exponent == p2.list.head.exponent) {
			int sumCoefficient = p1.list.head.coefficient + p2.list.head.coefficient;
			Polynomial p = new Polynomial(sumCoefficient, p1.list.head.exponent);
			return p;
		}
		return p1;
	}
	static Polynomial subtract(Polynomial p1, Polynomial p2) {
		return p1;
	}
	static Polynomial multiply(Polynomial p1, Polynomial p2) {
		return p1;
	}
	static void print(Polynomial p) {
		System.out.println(p.list.getCoefficient() + "x^" + p.list.getExponent());
	}
	
}
