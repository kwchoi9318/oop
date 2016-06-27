package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :최경욱
 * @file   :BankServiceImpl.java
 * @story  :
*/
public class BankServiceImpl implements BankService {
	
	List<AccountBean> list = new ArrayList<AccountBean>();
	
	@Override
	public void openAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		
		list.add(acc);
		
	}
	@Override
	public String AccountList() {
		return "";
	}
	@Override
	public String findByAccountNo(String searchAcc) {
		String result = "결과없음";
		for (int i = 0; i < list.size(); i++) {
			if (searchAcc.equals(String.valueOf(list.get(i).getAccountNo()))) {
				result = list.get(i).toString();
				
			}
		}
		return result;
		// TODO Auto-generated method stub
		
	}



	@Override
	public void findByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}









}
