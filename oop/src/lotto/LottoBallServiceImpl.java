package lotto;

import java.util.Arrays;

import lotto2.LottoBean;

/**
 * @date :2016. 6. 24.
 * @author : 최경욱
 * @file :LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {

	private int[] lotto;

	@Override
	public void setLottoBall() {
		int i = 0;
		LottoBean bean = new LottoBean();
		lotto = new int[6];
		while (true) {
			bean.setNumber();
			int num = bean.getNumber(); // 0 대신 식을 채우시오
			if (isDuplicate(num)) { // 조건문을 채우시오
				continue;
			}
			this.lotto[i] = num;
			i++;
			if (i == lotto.length) { // if문을 완성하시오
				i = 0;
				break;
			}
		}
		Arrays.sort(lotto);
	}

	@Override
	public int[] getLottoBall() {
		// TODO Auto-generated method stub
		return this.lotto;

	}

	@Override
	public boolean isDuplicate(int num) {
		// TODO Auto-generated method stub
		// 중복방지(완성)
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}

}
