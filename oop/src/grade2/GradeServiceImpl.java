package grade2;


public class GradeServiceImpl implements GradeService{

	GradeBean bean = new GradeBean();
	// 과목별 점수 체크 메소드
	@Override
	public int gradeCheck(int kor, int eng, int math) {
		if ((kor >= 101 || kor<0)&&(eng >= 101 || eng<0)&&(math >= 101 || math<0)) {
			return 0;
		}else{
			return 1;
		}
	}

	// 이름, 과목별 저장.
	@Override
	public void gradeInit(String name, int kor, int eng, int math) {
		bean = new GradeBean(name, kor, eng,math);
	}

	// 총점계산
	@Override
	public int gradeTotal() {

		return bean.getKor()+bean.getEng()+bean.getMath();
	}

	//평균계산
	@Override
	public int gradeAvg() {
		return this.gradeTotal()/3;
		
	}

	//학점계산
	@Override
	public String gradeCalc() {
		int avg = this.gradeAvg(); //평균
		String qwe = "";
		if (avg >= 90) {
			qwe = "A";
		} else if (avg >= 80) {
			qwe = "B";
		} else if (avg >= 70) {
			qwe = "C";
		} else if (avg >= 60) {
			qwe = "D";
		} else if (avg >= 50) {
			qwe = "E";
		} else if (avg >= 49) {
			qwe = "F";
		}
		
		return qwe;
	}

	//결과출력물
	@Override
	public String gradeResult(String result) {
		return bean.toString()+"\n총점 = "+this.gradeTotal()+"평균 = "+this.gradeAvg()+"학점 = "+result;
	}
	

}
