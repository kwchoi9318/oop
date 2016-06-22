/**
 * 
 */
package controller;

/**
 *@date   :2016. 6. 14.
 *@author : 최경욱
 *@file   :Kaup.java
 *@story  :
 */
public class Kaup {
	public String execute(String n,double h, double w){
		String name=n,result="";
		double height=h,weight=w,kaup=0.0;
		//---- op -----
		kaup = weight / (height / 100) / (height / 100);
		
		if (kaup < 18.5) {
			result = "저체중";
		}else if(kaup < 22.9 && kaup > 18.5){
			result = "정상";
		}else if(kaup < 24.9 && kaup > 23.0){
			result = "위험체중";
		}else if(kaup < 29.9 && kaup > 25.0){
			result = "비만1단계";
		}else if(kaup < 40 && kaup > 30.0){
			result = "비만2단계";
		}else if(kaup >= 40){
			result = "비만3단계";
		}
		
		return name+"은 BMI지수는 "+kaup+"이고 "+result+"이다";

	}

}
