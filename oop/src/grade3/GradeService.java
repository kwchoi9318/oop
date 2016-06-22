package grade3;

public interface GradeService {
	public int gradeCheck(int kor,int eng,int math);
	public int gradeInit(String name, int kor, int eng, int math);
	public String gradeTotal();
	public String gradeAvg();
	public String gradeA(String result);
}
