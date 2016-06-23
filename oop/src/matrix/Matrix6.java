package matrix;

/**
 *@date   :2016. 6. 22.
 *@author : 최경욱
 *@file   :Matrix6.java
 *@story  :
 */
public class Matrix6 {
	public static void main(String[] args) {
		int k =1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j < 0; j--) {
				if(i>j){
					System.out.println(j);
				}else{
					System.out.print(" ");
				}
			}
		
		}
	}
}
