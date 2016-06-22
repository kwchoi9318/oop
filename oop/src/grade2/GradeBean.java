package grade2;

public class GradeBean {
	private int kor,eng,math; //국어,영어,수학
	private String name; // 이름
	private String pw; //비밀번호
	
	public GradeBean(String name, int kor, int eng,int math) { //생성자로 이름 및 각 과목별 점수 저장 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public GradeBean() {
		// TODO Auto-generated constructor stub
	}
	
	//setter
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//getter
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "결과 [국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 이름=" + name + "]";
	}
	
	
	
	
}
