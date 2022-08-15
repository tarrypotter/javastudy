                  //조건 연산자
                  /*조건 연산자는 3개의 피연산자로 구성되어 
                    이루어짐삼항(ternary)연산자라고도 하며 
                    형식은 condition ? opr2 : opr3 */

public class Ternary1 {

	public static void main(String[] args) {
		  int a=5,b=3;
		  
		  System.out.println("두수의 차는 " + ((a>b)?(a-b):(b-a)));

	}

}
