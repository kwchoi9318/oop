package simpleRPS4;

import java.util.Random;

public class SimpleRPSBean {
	private int play,comp;
	private String value;//숫자에 대응하는 가위바위보 값

	public void setPlay(int play){
		this.play = play;

		this.play = 1;
	}
	public void setComp(){
		Random r = new Random();//쓰고 사라지는 랜덤

		this.comp = r.nextInt(3)+1;
	}
	public int getPlay(){
		return play;
	}
	public int getComp(){
		return comp;
	}
	public String setValue(int out){
		switch (out) {
		case 1:this.value = "가위";break;
		case 2:this.value = "바위";break;
		case 3:this.value = "보";break;
		default:
			break;
		}
		return value;
	}
	
		
	
	
	@Override
	public String toString() {
		return "베팅값 [플레이어=" + play + ", 컴퓨터=" + comp + ", va=" + value + "]";
	}
	public String getValue(int play2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
}