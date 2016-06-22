package grade2;

public interface GradeService {
public int gradeCheck(int kor,int eng, int math);
	public void gradeInit(String name, int kor, int eng, int math);
	public int gradeTotal();
	public int gradeAvg();
	public String gradeCalc();
	public String gradeResult(String result);
	
	 

}
