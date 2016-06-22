/**
 * 
 */
package school;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 1. 등록 ssn, 아이디 비번 이름/2.조회 홍길동,아이디,남
 * 
 * @date :2016. 6. 16.
 * @author : 최경욱
 * @file :SchoolController.java
 * @story :
 */
public class SchoolController {
	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student stu = null;

		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2보기 3수정 4삭제 0종료")) {
			case "1":

				stu = new Student(JOptionPane.showInputDialog("ID"), JOptionPane.showInputDialog("PW"),
						JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("주민번호"));

				break;
			case "2":
				JOptionPane.showMessageDialog(null, stu.toString());

				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				break;
			}
		}
	}
}