/*package simpleRPS3;

import java.util.Random;

import javax.swing.JOptionPane;

import simpleRPS2.SimpleRPSService;
import simpleRPS2.SimpleRPSServiceImpl;
//cv instance v-->상황에 따라 변한다 local variable
public class simpleRPSController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "====가위 바위보게임====");
		SimpleRPSService service = new SimpleRPSServiceImpl();//interface service = new Impl;

		String match = "",result = "";
		
		
		
		while (true) {
			Random r = new Random();
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				String player = Integer.parseInt(JOptionPane.showInputDialog("===1가위 2바위 3보 ==="));
				match = service.playGame(player);
				result = service.getResult(match);
				JOptionPane.showMessageDialog(null, result);

				break;

			default:
				return;
			}
			
		}
	}
}*/