/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 14.
 *@author : 최경욱
 *@file   :controller.java
 *@story  :
 */

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 14.
 * @author :pakjkwan@gmail.com
 * @file :Controller.java
 * @story :
 */
public class ControllerBak {
	public static void main(String[] args) {
		String menu = "";
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		Kaup kaup = new Kaup();
		MonthEnd mth = new MonthEnd();
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기능"
					+"2.카우푸"
					+"3.년월말"
					+"4.1등구하기"
					+"5.학번/나이"
					+"6.최고최저점수"
					+"7.세금액"
					+"8.성별판별"
					+"9.시분초구하기"
					+"0.종료");
			switch (menu) {
			case "1":
				System.out.print("첫번째숫자 : ");
				System.out.print("연산자 : ");
				System.out.print("두번째숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름?");
				String name = s.next();
				System.out.println("키?");
				double height = s.nextDouble();
				System.out.println("몸무게?");
				double weight = s.nextDouble();
				System.out.println(kaup.execute(name, height, weight));
				break;
			case "3":
				System.out.println("년월입력?");
				int year = s.nextInt();
				int month = s.nextInt();
		//	System.out.println(mth.time(year, month));
				
				break;

			case "4":
				
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호입니다");
				break;
			}
		}
	}

}
