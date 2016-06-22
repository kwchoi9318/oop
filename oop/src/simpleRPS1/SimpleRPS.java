package simpleRPS1;

import java.util.Random;

import javax.swing.JOptionPane;

//인스턴스의 소유주는 인스턴스/내몸에 있는 건 this/static이붙으면 객체의 기능이 없다.
//기능 객체는 인터페이스!!(추상화)-->Service-->serviceImpl/속성 getter setter 은닉화
public class SimpleRPS {
	public static void main(String[] args) {

		String result = "";
		JOptionPane.showMessageDialog(null, "====가위 바위보게임====");
		
		SimpleRPSService service = new SimpleRPSServiceImpl();//interface service = new Impl;
		
		int comp = 0, player = 0;
		Random r = new Random();
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				String p = JOptionPane.showInputDialog("===1가위 2바위 3보 ===");
				result = service.gameEngine(result, r, p);
				JOptionPane.showMessageDialog(null, result);

				break;

			default:
				return;
			}
			
		}

	}

	private static String gameEngine(String result, Random r, String p) {
		int player;
		switch (p) {
		case "1":
			player = 1;

			switch (r.nextInt(3) + 1) {
			case 1:
				result = "TIE";
				break;
			case 2:
				result = "LOSE";
				break;
			case 3:
				result = "WIN";
				break;
			default:
				break;
			}
			break;
		case "2":
			switch (r.nextInt(3) + 1) {
			case 1:
				result = "WIN";
				break;
			case 2:
				result = "TIE";
				break;
			case 3:result = "LOSE";break;
			default:
				break;
			}
			break;
		case "3":
			switch (r.nextInt(3)+1) {
			case 1:
				result = "LOSE";break;
			case 2:result = "WIN";break;
			case 3:result = "TIE";
				break;
			default:break;
			}
		
			
		}
		return result;
	}
}
