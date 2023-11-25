package polynomial_group;

/*
 * Create a class called Polynomial. Focus on the main functions needed for the class;
 *  don't worry about all the detailed steps. Your class will be checked based on these functions.
 *   Follow specific instructions if they say you must use a structure or do something in the class or a function;
 *    otherwise, you can decide.

1) An object of the class Polynomial represents a mathematical polynomial in the usual sense. Here are some
examples of polynomials expressed by starting from the exponent 0 (which represents the constant of the
polynomial) and listing the terms in ascending exponents:

3 + x + x^3 + 7*x^6
x^2 + 1000*x^4

Here x^k represents x raised to the power k, and * is the multiplication operator. Note that when the coefficient of
a specific term is 0, we do not list it for saving space. Thus, for example, the second polynomial above is in fact

0 + 0*x + x^2 + 0*x^3 + 1000*x^4

But we only list the two non-zero terms. Note also that we do not write the coefficient and exponent 1.
 */

public class Polynomial {
	
	/*
	 * 2) The class Polynomial MUST keep a linked list representing a polynomial as above. USE the implementation
provided in the lectures/slides. In particular, each term must be represented by a list node. You may assume that the
coefficients are integers. Note that in order to represent a term, you must keep both the exponent and the
coefficient. Thus, for instance, the second polynomial above must have 2 list nodes: the first one has exponent 2,
coefficient 1, represented by the tuple (2 1); the second one has exponent 4, coefficient 1000, represented by the
tuple (4 1000). The 0 polynomial, which does not have any term at all is represented by an empty list.
Provide two constructors, the default creating the 0 polynomial, and the other taking a linked list object representing
the polynomial.
	 */
	/*
	public class Program {
		public static void main(String[] args)
		{
			LinkedList list1 = new LinkedList();
			
			list1.insertNode(0, 5);
			list1.insertNode(1, 3);
			list1.insertNode(1, 1);
			list1.insertNode(0, 9);
			list1.insertNode(1, 7);
			list1.insertNode(5, 1);
			
			list1.displayList();
			list1.deleteNode(1);
			list1.deleteNode(7);
			System.out.println(1 + " and " + 7 + " deleted");
			list1.displayList();
		
			System.out.print("The positions of " + 1 + " are ");
			list1.findNodeAll(1);
		}
	}
	*/
	

	public static Polynomial add (Polynomial p1, Polynomial p2) {
		/*
		 * 3) The class Polynomial has the following member function
static Polynomial add(Polynomial p1, Polynomial p2);
It adds the polynomials represented by p1 and p2, and returns a new Polynomial object representing the result.
Please, BE CAREFUL: You should not represent the terms with coefficient 0. Furthermore, if there are terms in one
polynomial not appearing in the other, you may have to create new terms in the result.
		 */
		return p2;
	}
	
	public static Polynomial subtract (Polynomial p1, Polynomial p2) {
		/*
		 * 4) The class Polynomial has the following member function
static Polynomial subtract(Polynomial p1, Polynomial p2);
It subtracts the polynomial p2 from p1, and returns a new Polynomial object representing the result. [Hint:
This is easy once you implement add].
		 */
		return p2;
		
	}
	
	public static Polynomial multiply (Polynomial p1, Polynomial p2) {
		/*
		 * 5) The class Polynomial has the following member function
static Polynomial multiply(Polynomial p1, Polynomial p2);
It multiplies the polynomials represented by p1 and p2, and returns a new Polynomial object representing the
result. Please, BE CAREFUL: Multiplication of polynomials are more complicated than addition. If you do not know
how to do this, please learn it from an appropriate source. This is usually taught in high school.
		 */
		return p2;
		
	}
	
	public void print() {
		/*
		 * 6) The class Polynomial has the following member function
void print();
This prints out the underlying Polynomial object, based on the information contained in the linked list, in the
format given in 1).
		 */
	}
}


