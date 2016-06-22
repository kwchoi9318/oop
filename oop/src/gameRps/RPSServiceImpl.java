package gameRps;

import simpleRPS3.SimpleRPSBean;

public class RPSServiceImpl implements RPSService{

	SimpleRPSBean rps;
	@Override
	public void betPlayerValue(int playerValue) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*3)+1;
	}

	@Override
	public void setComputerValue() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void whoWin() {
		// TODO Auto-generated method stub
	}

	@Override
	public String showResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkValidation(String rps) {
		// TODO Auto-generated method stub
		return false;
	}

}
