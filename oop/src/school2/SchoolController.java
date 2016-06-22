/**
 * 
 */
package school2;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 16.
 *@author : 최경욱
 *@file   :SchoolController.java
 *@story  :
 */
public class SchoolController {
	
	 Student stu = null;
	public static void main(String[] args) {
		 Student stu = null;
		while(true){
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":
				String idey = JOptionPane.showInputDialog("아이디 입력: " );
				String password = JOptionPane.showInputDialog("비밀번호 입력: ");
				String nm = JOptionPane.showInputDialog("이름 입력: ");
				String security = JOptionPane.showInputDialog("ssn 입력: ");
				stu = new Student(idey,password,nm,security);
				break;
			case "2":
				break;

			default:
				break;
			}
		}
	}
}
