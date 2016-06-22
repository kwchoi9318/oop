/**
 * 
 */
package bank;

/**
 *@date   :2016. 6. 20.
 *@author : 최경욱
 *@file   :AccountService.java
 *@story  :
 */
public interface AccountService {
	
		
		
	//1개설
	public abstract void openAccount(String name, String id, String pw);
		//2입금
		
		public void deposit(int inputMoney);
		public void findAccount();
			
		
		//4출금
		public String withdraw(int output);
		
		public String showAccount();
		
		public void deleteAccount();
		
}
