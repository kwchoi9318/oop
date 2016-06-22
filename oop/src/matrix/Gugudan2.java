package matrix;

/**
 *@date   :2016. 6. 22.
 *@author : 최경욱
 *@file   :Gugudan2.java
 *@story  :
 */
public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
			
				System.out.print(j+"*"+i+"="+i*j+"\t");
				System.out.println(j+4+"*"+i+"="+i*j+4+"\t");

			}

			System.out.println();
		}
		
	}
}
