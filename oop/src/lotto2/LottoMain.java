package lotto2;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 24.
 *@author : 최경욱
 *@file   :LottoMain.java
 *@story  :
 */
public class LottoMain {
	
		public static void main(String[] args) {
			LottoBean lot = new LottoBean();
			LottoService service = new LottoServiceImpl();
			String count = JOptionPane.showInputDialog("얼마치 구입?");
			lot.setMoney(Integer.parseInt(count));
			service.setLottos(lot);
			int[][] lottos = service.getLottos();
			for (int i = 0; i < lottos.length; i++) {
			//	service.sort(lottos[i]);
				for (int j = 0; j < lottos[i].length; j++) {
					
					System.out.print(lottos[i][j]+"\t");
				}
				System.out.println();
			}
			

	}


}
