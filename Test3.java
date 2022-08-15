
public class Test3 {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		System.out.print("a+b= ");	
		System.out.println( a+b);
		
		int [] c= new int [5];
		
		c[0]=3; c[1]=4; c[2]=5; c[3]=6; c[4]=7;
		
		System.out.print(c[0] + " ");
		System.out.print(c[1] + " ");
		System.out.print(c[2] + " ");
		System.out.print(c[3] + " ");
		System.out.print(c[4] + " ");
		
		System.out.println();
		
		int d=0; 
		int e=0;
		for (d=2 ; d<=9 ; d++) {
			for(e=1 ; e<=9 ; e++) {
				
				System.out.println( d + " * " + e + " = " + d*e);
			}		
		}
	}
}
