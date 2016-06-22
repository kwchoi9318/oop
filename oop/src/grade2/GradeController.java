/**
 * 
 */
package grade2;

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

	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
	 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
	 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
	 * [단]switch-case 문으로 해결하세요
	 */
	public static void main(String[] args) {
		
		while (true) {
			GradeService service = new GradeServiceImpl();
				
			switch (JOptionPane.showInputDialog("===한빛학원===\n 1.등록 0.종료")) {
			case "1":
				String spec[] = JOptionPane.showInputDialog("이름,국어,영어,수학").split(","); //이름,과목별 점수 입력단.
				int count = service.gradeCheck(Integer.parseInt(spec[1]), Integer.parseInt(spec[2]) //점수체크
								 , Integer.parseInt(spec[3]));
				if(count == 0){
					JOptionPane.showConfirmDialog(null, "1~100사이에 점수만 입력해주세요");
					continue;
				}
				
				service.gradeInit(spec[0], Integer.parseInt(spec[1]), Integer.parseInt(spec[2]) // 이름,과목별 점수 저장완료
						 , Integer.parseInt(spec[3]));
				service.gradeTotal(); //총점계산완료.
				service.gradeAvg(); //평균계산완료.
				//학점계산완료.
				JOptionPane.showMessageDialog(null, service.gradeResult(service.gradeCalc())); // 결과출력 완료.
				
				break;
			case "0":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");return;
			default:JOptionPane.showMessageDialog(null, "1과 0만 입력해주세요");continue;
			}
		}
	}
}