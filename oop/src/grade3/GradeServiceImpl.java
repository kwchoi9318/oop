/*package grade3;

public class GradeServiceImpl implements GradeService{

	
	GradeBean bean = new GradeBean();
	@Override
	public int gradeCheck(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		if((kor>100&&kor<0)&&(eng>100&&eng<0)&&(math>100&&math<0)){
			
			return 0;
		}else{
			
			return 1;
		}
		
		
		
	}

	@Override
	public String gradeTotal() {
		
		return bean.getKor()+bean.getEng()+bean.getMath();
	}

	@Override
	public String gradeAvg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gradeA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int gradeInit(String name, int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String gradeA(String result) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/