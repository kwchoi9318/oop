package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 24.
 *@author : 최경욱
 *@file   :SBSMain.java
 *@story  :
 */
public class LottoBallMain {
	public static void main(String[] args) {
		
		LottoBallService ballService = new LottoBallServiceImpl();
		
		StringBuffer buf = new StringBuffer();
		ballService.setLottoBall();
		int [] arr = ballService.getLottoBall();
                           
		for (int i = 0; i < arr.length; i++) {
			buf.append(arr[i] + "\t");
		}
		
		File output = new File("C:\\eclipse\\lotto\\lotto.txt");
		BufferedWriter bw =null;
		try {
			bw = new BufferedWriter(new FileWriter(output));
			bw.write(buf.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
