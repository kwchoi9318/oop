package bank2;

public interface AccountService {
//1개설
public abstract void openAccount();
//2입금
public void deposit();
//3조회
public void findAccount();
//4출금
public void showAccount();
//5통장내역
public void deleteAccount();
void openAccount(String sId, String sPw, String sName);
void deposit(int inputMoney);













}
