package java0101; //다중 if-else문
                  //점수와 학년을 입력받아 60이상이면 합격 미만이면 불합격 출력
                  //4학년은 70점이상이어야 합격

import java.util.Scanner;

public class NestedfIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print(" 당신의 점수를 입력하세요: ");
        	int score = scanner.nextInt();
	    System.out.print(" 당신의 학년을 입력하세요: ");
		    int year = scanner.nextInt();
	 	 
       if (score>=60) {    //60점 이상
    	   if(year !=4)    // 학년이 4와 같지 않으면   
    		  System.out.println("합격"); // 4학년 아니면 합격
       else if(score>=70) 
    	   System.out.println("합격"); // 4학년이 70점이상 이여서 합격
       else  
    	   System.out.println("불합격"); // 4학년이 70점이상이 아니여서 불합격
	}
       else 
    	   System.out.println("불합격"); // 걍 점수 60점 미만이라 불합격
 
	}
 }