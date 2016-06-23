package collection;

import java.util.List;
import java.util.Vector;

/**
 *@date   :2016. 6. 23.
 *@author : 최경욱
 *@file   :ListEx.java
 *@story  :
 */
public class VectorEx {

	
	public static void main(String[] args) {
			List<String> v = new Vector<String>(2,5);
			System.out.println("::::::::::Vector 생성시:::::::::::::");
			System.out.println("size : "+v.size ());
			
			
			v.add("박지성");
			v.add("박주영");
			v.add("유상철");
			
			System.out.println("::::::::::요소추가 후:::::::::::::");
			
			
	
	}
}
