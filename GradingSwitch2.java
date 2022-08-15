package java0101; //Switch문
                  // 학점 구하기
import java.util.Scanner;

public class GradingSwitch2 {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);		
         System.out.print("점수를 입력하시오: ");
         int score = scanner.nextInt();
         char grade;
         switch(score/10) {
         case 10: 
        	                 
         case 9: 
        	 grade = 'A';
             break;
         
         case 8: 
        	 grade = 'B';
             break;
         
         case 7: 
        	 grade = 'C';
             break;
         
         case 6: 
        	 grade = 'D';
             break;
         
         default :        
        	 grade = 'F';
             break;
      } System.out.println("당신의 학점은 " + grade + " 입니다");        
   }  
}
