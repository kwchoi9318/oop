/**
 * 
 */
package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 9.
 *@author : 최경욱
 *@file   :Avg2.java
 *@story  :
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
	 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
	 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
	 * [단]switch-case 문으로 해결하세요
	 */

	public static void main(String[] args) {//스타벅스 카운터 알바
		int avg = 0;
		String total = "";
		String name = "";
		String grade = "",scoKor = "",scoEng = "",scoMath = "";
		GradeService service = new GradeServiceImpl();
		String score = JOptionPane.showInputDialog("이름,국,영,수 입력");
		String[] arrScore = score.split(",");
		name = arrScore[0];
		scoKor = arrScore[1];
		scoEng = arrScore[2];
		scoMath = arrScore[3];
		service.gradeRegist(name,Integer.parseInt(arrScore[1]), Integer.parseInt(arrScore[2]), Integer.parseInt(arrScore[3]));
		     String sAvg   = service.stuAvg(Integer.parseInt(arrScore[1]), Integer.parseInt(arrScore[2]), Integer.parseInt(arrScore[3]));
			String sTotal = service.stuTotal();
		
			grade = service.stuGrade(sAvg);
			JOptionPane.showMessageDialog(null,sTotal +"/" + sAvg + "/" + grade);
		
		
		
	
	}
}