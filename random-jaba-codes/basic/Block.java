package dasar;

public class Block {
	
	public static void main(String[] args) {
		/**
		 * contoh expression, statement dan block dalam 1 class...
		 * puas lu
		 */
		// expression
		int a = 100; // bukan ini, ini statement
		System.out.println(a == 100); // System.out.println itu statement, tapi a == 100 itu expression.
		
		// ini (juga) statement:
		
		// assignment statement
		int no = 69;
		// increment statement
		no++;
		// method invocation statement
		System.out.println("hello world");
		// object creation statement
		String n = new String(); // ....
		
		// ini block.
		// berguna buat "mengelompokkan" kode.
		// block juga bisa di nest sampe mampus.
		{
			System.out.println("aaaa");
			{
				System.out.println("bbbb");
				{
					System.out.println("cccc");
				}
			}
		}
	}
	
}
