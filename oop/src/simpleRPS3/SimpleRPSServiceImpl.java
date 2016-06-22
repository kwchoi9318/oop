/*package simpleRPS3;
//구체적인 소스는 임플에 넣는다.
import java.util.Random;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	@Override
	public String playGame( int player) {
		//쓰고 사라지는 랜덤
		String result = "";//초기화
		rps.setComp();
		int com = rps.getComp();
		switch (player) {
		case 1:
			
			switch (com) {
			case 1:
				result = "TIE";
				break;
			case 2:
				result = "LOSE";
				break;
			case 3:
				result = "WIN";
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (com) {
			case 1:result = "WIN";break;
			case 2:result = "TIE";break;
			case 3:result = "LOSE";break;
			default:
				break;
			}
			break;
		case 3:
			switch (com) {
			case 1:result = "LOSE";break;
			case 2:result = "WIN";break;
			case 3:result = "TIE";break;
			default:break;
			}
		
			
		}
		return result;
		
		
	}

	@Override
	public String getResult(String result) {
		
		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터: "+rps.getValue(rps.getComp())+"\n"
		+this.playGame(rps.getPlay());
	}

}
*/