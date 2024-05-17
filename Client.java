import java.util.ArrayList;

public class Client {
	
	private String name;
	private String adress;
	private ArrayList<ContBancar> cont;
	public Client(String name, String adress) {
		this.name = name;
		this.adress = adress;
		this.cont = new ArrayList<>();
	}
	public void afisare() {
        System.out.println(name + " " + adress);
        for (ContBancar account : cont) {
            System.out.println("Suma totala: " + TotalAmount);
        }
    }
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public void setName(String name) {
		this.name = name;
	}

}
