package grade;

public interface GradeService {
	public abstract String stuAvg(int kor, int eng, int math);
	public abstract String gradeRegist(String name,int kor, int eng, int math);
	public abstract String stuGrade(String avg );
	public abstract String stuTotal();
}
