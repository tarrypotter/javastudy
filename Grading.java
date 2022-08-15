package java0101; //학점 구하기
import java.util.Scanner;

public class Grading {    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요: ");
	    int grade = scanner.nextInt();
        
	    if  (grade>95){
	    	System.out.print("당신의 학점은 A+ 입니다.");
	    }else if (grade>90){
	    	System.out.print("당신의 학점은 A 입니다.");
	    }else if (grade>85){
	    	System.out.print("당신의 학점은 B+ 입니다.");
	    }else if (grade>80){
	    	System.out.print("당신의 학점은 B 입니다.");
	    }else if (grade>75){
	    	System.out.print("당신의 학점은 C+ 입니다.");
	    }else if (grade>70){
	    	System.out.print("당신의 학점은 C 입니다.");
	    }else if (grade>65){
	    	System.out.print("당신의 학점은 D+ 입니다.");
	    }else if (grade>60){
	    	System.out.print("당신의 학점은 D 입니다.");
	    }else {
	    	System.out.print("당신의 학점은 F 입니다.");
	    }
	    
	}

}
