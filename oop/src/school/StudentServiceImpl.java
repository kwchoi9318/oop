/**
 * 
 */
package school;

/**
 *@date   :2016. 6. 20.
 *@author : 최경욱
 *@file   :studentServiceImpl.java
 *@story  :
 */
public class StudentServiceImpl implements StudentService{

		Student stu;
	@Override
	public void registStudent(String id, String pw, String name, String ssn) {
		// TODO Auto-generated method stub
		stu = new Student(id, pw, name, ssn);
	}
	@Override
	public String showStudent() {
		// TODO Auto-generated method stub
		return stu.toString();
	}


	@Override
	public void updateStudent(String pw) {
		// TODO Auto-generated method stub
		stu.getPw();
	}
	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		stu = null;
	}
	
}
