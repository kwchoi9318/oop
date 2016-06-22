package bank2;

public class AccountBean {
	private int accountNo;
	private String name;
	private int money;
	private String pw;
	private String id;
	
	public AccountBean(String sId,String sPw,String sName){
		id = sId;
		pw = sPw;
		name = sName;
	}

	public void setName(String sName){
		name = sName;
	}
	public void setMoney(int sMoney){
		money = sMoney;
	}
	public void setAccountNo(int sAccountNo){
		accountNo = sAccountNo;
	}
	public void setId(String sId){
		id = sId;
	}
	public void setPw(String sPw){
		pw = sPw;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
	public int getAccountNo(){
		return accountNo;
	}
	public String getPw(){
		return pw;
	}
	public String getId(){
		return id;
	}



}
