/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 *@date   :2016. 6. 15.
 *@author : 최경욱
 *@file   :MaxMin.java
 *@story  :
 */
public class MaxMin {
	public String execute(int[]scores) {
	
		int max = 0, min = 100;
		//.....4,5,6,7,.....100
		for (int i = 0; i < scores.length; i++) {
		
			if (scores[i]>max) {
				max = scores[i];
			}else if(scores[i]<min){
				min = scores[i];
			}
		}
		return"최고점:"+max+"점/최저점:"+min+"점";
	}
}
