/**
 * 
 */
package controller;

/**
 * @date :2016. 6. 14.
 * @author : 최경욱
 * @file :MonthEnd.java
 * @story :
 */
public class MonthEnd {
	public String execute(int y, int m, int mal) {
		int year = y;
		int malil = mal;
		int month = m;

		switch (month) {
		case 2:

			// 삼항연산식
			malil = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			malil = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			malil = 30;
			break;
		default:
			System.out.println("잘못 입력 되었습니다");

		}
		return year + "년" + month + "월의 말일은" + malil + "일 입니다";
	}
}
