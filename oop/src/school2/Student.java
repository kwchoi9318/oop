package school2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
package school;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :Student.java
 * @story  :
*/
public class Student {
	private String id,pw,name,regDate,gender,ssn; 
	private int age;
	public final static String SCHOOL_NAME="한빛학원";
	
	public Student(String sId,String sPw,String sName,String social) {
		this.id = sId;
		this.pw = sPw;
		this.name = sName;
		this.ssn = social;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		String[] ssnArr = ssn.split("-");
		String[] nowArr = now.split("-");
		
		int ageResult1 = (Integer.parseInt(ssnArr[0]));
		int genderResult = (Integer.parseInt(ssnArr[1]));
		int ageResult2 = (Integer.parseInt(nowArr[0]));
		int ageResult0 = 0;
		switch (genderResult%2) {
		case 1: case 5: 
			this.gender="남"; 
			ageResult0 = ageResult2 - (1900+(ageResult1/10000));
			this.age = ageResult0;
			break;
		case 3: case 7:
			this.gender="남"; 
			ageResult0 = ageResult2 - (2000+(ageResult1/10000));
			this.age = ageResult0;
			break;
		case 2: case 6:
			this.gender="여";
			ageResult0 = ageResult2 - 1900-(ageResult1/10000);
			this.age = ageResult0;
			break;
		case 4: case 8:
			this.gender="여";
			ageResult0 = ageResult2 - 2000-(ageResult1/10000);
			this.age = ageResult0;
			break;
		default:
			System.out.println("잘못된값이 입력됨");
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String sId) {
		id = sId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String sPw) {
		pw = sPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String sName) {
		name = sName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=****"  + ", 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + age + "]";
	}
	

}
