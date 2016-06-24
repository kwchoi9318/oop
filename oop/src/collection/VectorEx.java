package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 *@date   :2016. 6. 23.
 *@author : 최경욱
 *@file   :ListEx.java
 *@story  :
 */
public class VectorEx {

	
	private static String pw;
	private static String id;

	public static void main(String[] args) {
		
			List<StudentBean> v = new Vector<StudentBean>();
			StudentBean searchMan = new StudentBean();
			StudentBean hong = new StudentBean("hong","1","홍길동","800101-1");
			StudentBean kim = new StudentBean("kim","1","김유신","800101-1");
			StudentBean lee = new StudentBean("lee","1","이순신","800101-3");

			v.add(hong);
			v.add(kim);
			v.add(lee);
		
			
			int a = 0;
			a = 5;
			
			//System.out.println("size : "+v.size());
		//	System.out.println(v.toString());
			String searchName = "333";
			searchMan = null;
			
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchName)) {
				searchMan = v.get(i);
			}
				
			
		}
			if (!(searchName.equals(searchMan.getName()))) {
				System.out.println(searchName+"라는 이름은 없습니다");

				
			}else{
				System.out.println(searchMan.toString());				
			}
			searchMan.setName("홍길동");
			if(v.contains(searchMan)){
				int index = v.indexOf(searchMan);
				
			}else{
				
				System.out.println("존재x");
			}
			
			System.out.println(v.size());
	}
}
