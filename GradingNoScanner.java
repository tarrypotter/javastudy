package java0101;  //스캐너 안한 학점 구하기

public class GradingNoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a =99;
          if(a>=90) {
        	  System.out.println("A학점");
          }
          else if(a>=80) {
        	  System.out.println("B학점");
          }
          else if(a>=70) {
        	  System.out.println("C학점");
          }	
          else if(a>=60) {
        	  System.out.println("D학점");
          }
          else {        	 
              System.out.println("F학점");              
          }
        	  
	}
}
