/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 *@date   :2016. 6. 14.
 *@author : 최경욱
 *@file   :Num1.java
 *@story  :
 */
public class Num1 {
	public void execute(int[]score){

		int max = 0, min = 100;
	
		for (int i = 0; i < score.length; i++) {
			
			if(score[i]>max){
				max = score[i];
			}else if(score[i]<min)
				min = score[i];
		}
	//	return "최고점 : " "+max+", 최저점 : "+min;
	}
}
