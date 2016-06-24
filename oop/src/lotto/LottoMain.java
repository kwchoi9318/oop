package lotto;

import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 23.
 * @author : 최경욱
 * @file :LottoController.java
 * @story :
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
		StringBuffer buf = new StringBuffer();
		lot.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마치 구입?")));
		service.setLottos(lot);
		
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			//service.sort(lottos[i]);
			Arrays.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j] + "\t");
			}
			System.out.println();
		}
	}
	

}
