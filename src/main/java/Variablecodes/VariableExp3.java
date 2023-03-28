/**
 * 
 */
package Variablecodes;

/**
 * @author user
 *
 */
class Prg1 {
	//static variables
	static int a,b,c;
	//non-static variables
	int m,n,o;
	//static blocks
	static {
		a=10;
		b=20;
		c=30;
	}
	//non-static blocks
	{
		m=100;
		n=200;
		o=300;
	}
	//static methods
	static void disp1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	//non-static methods
	void disp2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
public class VariableExp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prg1 p1=new Prg1();
		p1.disp1();
		p1.disp2();

	}

}
