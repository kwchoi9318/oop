/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 17.
 * @author : 최경욱
 * @file :SomeControl.java
 * @story :
 */
public class SomethingController {
	public static void main(String[] args) {
		Something s = null;

		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":
				String aaa = JOptionPane.showInputDialog("첫번째값 문자");

				String bbb = JOptionPane.showInputDialog("두번째값 문자");
				String sccc = JOptionPane.showInputDialog("세번째값 숫자");
				int ccc = Integer.parseInt(sccc);
				s = new Something(bbb, ccc);

				String sddd = JOptionPane.showInputDialog("네번째값 숫자");
				int ddd = Integer.parseInt(sddd);

				break;

			case "2":
				JOptionPane.showMessageDialog(null,
						"첫번째:" + s.getAaa() + "두번째" + s.getBbb() + "" + "세번째:" + s.getCcc() + "네번째:" + s.getDdd());
				break;

			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			default:

				break;
			}
		}

	}
}
