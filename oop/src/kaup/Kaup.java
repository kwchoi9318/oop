/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 *@date   :2016. 6. 10.
 *@author : 최경욱
 *@file   :Kaup2.java
 *@story  :카우푸지수 구하는 프로그램
 */
public class Kaup {
	String name,height,weight;

	public void setName(String name){ 
		this.name = name;	
	}
	public void setHeight(String height){
		this.height = height;
	}
	public void setWeight (String weight){
		this.weight = weight;
	}
	public String getName(){
		return this.name;
	}
	public String getHeight(){
		return this.height;
	}
	public String getWeight(){
		return this.weight;
	}
	
	
	
	public void execute() {
		//------------init---------------

		String result = "";
		double  height = Double.parseDouble(this.height),
				weight = Double.parseDouble(this.weight),
				kaup = 0.0;
		//--------------op---------------
		
		kaup = weight/(height/100)/(height/100);
		
		if(kaup<18.5){
		result ="저체중";
		}else if(kaup<22.9&&kaup>18.5){
			result ="정상";	
		}else if(kaup<24.9&&kaup>18.5){
			result ="위험체중";
		}else if(kaup<29.9&&kaup>25.0){
			result ="비만1";
		}else if(kaup<40&&kaup>30.0){
			result ="비만2";
		}else if(kaup>=40){
			result ="비만3";
		}
		 
		
	//	return name+"+의+bmi지수는"+Double.parseDouble(String.format("%.2f", args)) +"+이고 +"result"+이다";
	
	}
}
