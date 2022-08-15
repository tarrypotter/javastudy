 //배열 , 십구단

public class Test {

	public static void main(String[] args) {
		
		System.out.println("<배열>");
		
		int [] c= new int [5];
		
		c[0]=3; c[1]=4; c[2]=5; c[3]=6; c[4]=7;
		
		System.out.print(c[0] + " ");
		System.out.print(c[1] + " ");
		System.out.print(c[2] + " ");
		System.out.print(c[3] + " ");
		System.out.print(c[4] + " ");
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("<십구단>");
		System.out.println();

		
		int a=0; 
		int b=0;
		for (a=2 ; a<=19 ; a++) {
			System.out.println("<" + a + "단" + ">");
		
			for(b=1 ; b<=19 ; b++) {
				
				System.out.println( a + " * " + b + " = " + a*b);
			}		
		}
	}
}
