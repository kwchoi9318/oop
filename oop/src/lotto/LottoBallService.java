package lotto;

/**
 *@date   :2016. 6. 24.
 *@author : 최경욱
 *@file   :LottoBallService.java
 *@story  :
 */
public interface LottoBallService {
	public void setLottoBall();
	public int[] getLottoBall();
	public boolean isDuplicate( int num);
	
}
   