
public abstract class ContBancar {
	
	private String accountnum;
	private float sum;
	public ContBancar(String accountnum, float sum) { 
		this.accountnum = accountnum;
		this.sum = sum;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
        this.sum = sum;
    }
	
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	public void transfer(ContBancar  destinatar, float sum) {
        if (this.sum >= sum) {
            this.sum -= sum;
            System.out.println("Transfer reușit!");
        } else {
            System.out.println("Fonduri insuficiente");
        }
    }

}
