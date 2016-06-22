package simpleRPS5;
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
		int ply = rps.getPlay();
		int win = 0;
		if(com == ply){
			result = "win";
		}
		
		switch (Math.abs(ply-com)) {
		case 1:
			win  =(ply>com)?ply:com;
			break;
	
			case 2:
				win  =(ply>com)?com:ply;
				break;

		default:
			break;
		}
		String winner = (win == ply)?"플레이어":"컴퓨터";
		result = winner +"승리";
		return result;
		
	}

	@Override
	public String getResult(String result) {
		
		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터: "+rps.getValue(rps.getComp())+"\n"
		+this.playGame(rps.getPlay());
	}

}
