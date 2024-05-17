
public class Counter {

	public static void main(String[] args) {

	     Banca banca = new Banca("BC123");

	     Client client1 = new Client("giorgi", "str. Nufarul");
	     client1.afisare();
	     banca.add(client1);
		

	}

}
