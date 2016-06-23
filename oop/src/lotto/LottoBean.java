package lotto;

/**
 *@date   :2016. 6. 23.
 *@author : 최경욱
 *@file   :LottoBean.java
 *@story  :
 */
public class LottoBean {
	private int money,number;
	
	public void setMoney(int money){
		this.money = money;
	}
	public void setNumber(){
		this.number = (int)(Math.random()*45)+1;//로또를 구성하는 램덤 숫자 발생
	}
	public int getMoney(){
		return money;
	}
	public int getNumber(){
		return number;
	}
	@Override
	public String toString() {
		return "LottoBean [money=" + money + ", number=" + number + "]";
	}
	
}
