package bank;

/**
 * @date   :2016. 6. 27.
 * @author :최경욱
 * @file   :BankService.java
 * @story  :
*/
public interface BankService {
	//create:11개설
	public abstract void openAccount(AccountBean acc);
	//read : 12조회(전체)
		public String AccountList();
	//read : 13조회(계좌번호)
		public String findByAccountNo(String searchAcc);
	//read : 14조회(이름)
		public void findByName();
	//read : 15조회(전체통장수)
		public int count();
//read : 16통장내역
	public void showAccount();
	//update : 17수정.. 사용자의 요청에 의해 비번만 전환가능
	public void updateAccount();
	//delete : 18해지
	public void deleteAccount();
	
}
