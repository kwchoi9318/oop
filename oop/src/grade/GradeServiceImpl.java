package grade;


public class GradeServiceImpl implements GradeService{
	GradeBean gBean;
	
	
	
	@Override
	public String stuAvg(int kor ,int eng,int math) {
		int total = kor + eng + math;
		int avg = total/3;

		if (kor >= 101 || kor<0) {
			return "0에서 100까지 입력해주세요";
			
		}
		
		if (eng >= 101 || eng <0) {
			return "0에서 100까지 입력해주세요";
			
		}
		
		if (math >= 101||math<0) {
			return "0에서 100까지 입력해주세요";
		}
		
		return String.valueOf(avg);
	}

	@Override
	public String stuGrade(String avg) {
		
		int iAvg = Integer.parseInt(avg);
		String grade = "";
		switch (iAvg/10) {
		case 10:case 9:
			grade = "A";
			break;
			
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;	
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		
		
		default:
			grade = "F";
			break;
		}
		return grade;
	}

	@Override
	public String stuTotal() {
		String result ="";
		result = String.valueOf(gBean.getKor()+gBean.getEng()+gBean.getMath());
		return result;
	}

	@Override
	public String gradeRegist(String name, int kor, int eng, int math) {
		gBean  = new GradeBean();
		gBean.setName(name);
		gBean.setKor(kor);
		gBean.setEng(eng);
		gBean.setMath(math);
		
		return null;
	}

	
	

}
