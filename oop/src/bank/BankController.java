/**
 * 
 */
package bank;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *@date   :2016. 6. 15.
 *@author : 최경욱
 *@file   :BankController.java
 *@story  :
 */
public class BankController {
	public static void main(String[] args) {
	//	Account account = null;
		int ok = 0;
		String spec = "";
		String[] specArr = new String [3];
		BankService bankService = new BankServiceImpl();
		AccountService service = new AccountServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+"=========개인뱅킹========="
					+"1개설 2입금 3조회 4출금 5통장내역"
					+"=========은행창구 ======="
					+"11개설 12조회() 13조회(계좌) 14조회(이름) 15조회(통장수)"
					+ "16통장내역 17수정 18해지 0종료")) {
			case "11":
				 spec = JOptionPane.showInputDialog("이름,ID,PW");
				String[] specArr1 = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setId(specArr1[0]);
				acc.setName(specArr1[1]);
				acc.setPW(specArr1[2]);
				bankService.openAccount(acc);
				
				
				break;
			case "12":
				JOptionPane.showMessageDialog(null, );
				
				
			case "13":
				String searchAcc = JOptionPane.showInputDialog("검색하려는 계좌번호");
				bankService.findByAccountNo(searchAcc);
				
				break;
			case "15":
				int count = bankService.count();
				JOptionPane.showMessageDialog(null, count+"개");
				break;
			case "3":
				String checkAccount = JOptionPane.showInputDialog(""); 
				
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			default:
				ok = JOptionPane.showConfirmDialog(null, "close ?");
				if (ok==0) {
					return;
				} else {
					continue;
				}
			}
		}
	}
	
}
