// строчный коммент
/*
	блочный коммент
*/


/**
 * блочный комент для автоматической генерации документации
 */



public class program {
	public static void main(String args[]){
		// long k = 582
		// System.out.print("Hello world!");
		boolean a = true;
		boolean b = false;
		System.out.println("a    b     &     |     !a    !b    ^");
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print((a & b) + " ");
		System.out.print((a | b) + " ");
		System.out.print(!a + " ");
		System.out.print(!b + " ");
		System.out.println((a ^ b) + " ");


		a = false;
	 	b = false;
		System.out.println("a    b     &     |     !a    !b    ^");
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print((a & b) + " ");
		System.out.print((a | b) + " ");
		System.out.print(!a + " ");
		System.out.print(!b + " ");
		System.out.print((a ^ b) + " ");
	}
} 