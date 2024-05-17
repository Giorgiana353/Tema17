
public class LeiCont extends ContBancar{
	
	 public LeiCont(String accountnum, float sum) {
	        super(accountnum, sum);
	    }

	    public float getTotalAmount() {
	        return getSum();
	    }

	    public float getDobanda() {
	        return 0;
	    }

	    public void transfer(ContBancar destinatar, float sum) {
	        if (destinatar instanceof LeiCont) {
	        	if (getSum() >= sum) {
	                setSum(getSum() - sum);
	                System.out.println("transfer realizat!");

	            } else {
	                System.out.println("fonduri insuficiente ");
	            }
	        } else {
	            System.out.println("transferurile pot fi realizate doar în lei");
	        }
	    }

}
