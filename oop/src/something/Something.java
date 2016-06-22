/**
 * 
 */
package something;

/**
 * @date :2016. 6. 17.
 * @author : 최경욱
 * @file :some.java
 * @story :
 */
public class Something {
	/*private String aaa, bbb;
	private int ccc, ddd;*/
	private String aaa,bbb;
	private int ccc,ddd;
	
	public Something(String aaa, int ddd) {
		this.aaa = aaa;
		//this.bbb = bbb;
		//this.ccc = ccc;
		this.ddd = ddd;
	}

	/*public void setAaa(String aaa) {
		this.aaa = aaa;
	}*/
	public void setAaa(String aaa){
		this.aaa = aaa;
	}

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	
	

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getAaa() {
		return this.aaa;
	}

	public String getBbb() {
		return this.bbb;
	}

	public int getCcc() {
		return this.ccc;
	}

	public int getDdd() {
		return this.ddd;
	}

}
