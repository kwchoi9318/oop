package lotto2;

/**
 *@date   :2016. 6. 24.
 *@author : 최경욱
 *@file   :LottoService.java
 *@story  :
 */

public interface LottoService {
	public void setLottos(LottoBean lot);
	public int[][] getLottos();
	public boolean isDuplication(int count,int num);
	public void sort(int[]arr);
	public int count(LottoBean lot);
}

