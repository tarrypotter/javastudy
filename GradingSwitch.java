 //Switch문
                  // 학점 구하기
import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);		
         System.out.print("점수를 입력하시오: ");
         int score = scanner.nextInt();
         
         switch(score/10) {
         case 10: 
        	 System.out.print("A+학점");
         break;
         
         case 9: 
        	 System.out.print("A학점");
         break;
         
         case 8: 
        	 System.out.print("B학점");
         break;
         
         case 7: 
        	 System.out.print("C학점");
         break;
         
         case 6: 
        	 System.out.print("D학점");
         break;
         
         default :        
        	 System.out.print("F학점");
         break;
       }
        
   }
}
