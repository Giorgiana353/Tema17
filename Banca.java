import java.util.ArrayList;

public class Banca {
	
	private ArrayList<Client> client;
	private String bankcode;
	public Banca( String bankcode) {
		this.bankcode = bankcode;
		this.client = new ArrayList<>();
	}
	public void add(Client c) {
        client.add(c);
    }
	public void afisareClient(String name) {
        for (Client client : client) {
               System.out.println("Nume și prenume client: " + name);
               return; 
        }
    }

}
