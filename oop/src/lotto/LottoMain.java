package lotto;

import java.io.FileWriter;
import java.nio.Buffer;

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
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j] + "\t");
			}
			buf.append("/");
			System.out.println("로또\n" + buf);
			int lottoSerialNo = (int) (Math.random() * 999999 + 100000);
			File output = new File("C:\\eclipse\\lotto\\" + lottoSerialNo + ".txt");
			BufferWriter bw = null;
			String[] myLotto = buf.toString().split("/");
		FileWriter fw = new FileWriter(output,true);
		//뒤에 true는 이어 써라
		BufferWriter 
		}
	}
		catch(){
			
		}finally{
			try{
				
			} cat
			b
		}
		}
	}
	

}
