package SAE201;

import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<Client> 		lesClients 	= FXCollections.observableArrayList();
	static private ObservableList<Reservation> 		lesResa 	= FXCollections.observableArrayList();
	static private ObservableList<Spectacle> 		lesSpectacles 	= FXCollections.observableArrayList();

	static public void chargementDonnees() { 
		
		Client client1 = new Client("LECLERC","DAVID","PARIS","0685050809","DAVID.LECLERC@GMAIL.COM", "Lannion");
		Client client2 = new Client("DUPONT","MARIE","LYON","0682284298","MARIE.DUPONT@GMAIL.FR", "Vannes");
		Client client3 = new Client("ROUXEL","BERNARD","LILLE","0654298677","BERNARD.ROUXEL@GMAIL.FR", "Trouville");
		Client client4 = new Client("DUBOIS","SOPHIE","RENNES","0672938459","SOPHIE.DUBOIS@GMAIL.BZH", "Caen");
		Client client5 = new Client("LEROY","ISABELLE","BREST","0683751552","ISABELLE.LEROY@GMAIL.COM", "toulouse");
		lesClients.add(client1);
		lesClients.add(client2);
		lesClients.add(client3);
		lesClients.add(client4);
		lesClients.add(client5);
		
		Spectacle spe1 = new Spectacle("Rire à gogo","théatre","2h","Mika",300);
		Spectacle spe2 = new Spectacle("Opéraaaa","opéra","2h15","Amelie",250);
		Spectacle spe3 = new Spectacle("Danse étoilée","danse","1h30","Fred",290);
		Spectacle spe4 = new Spectacle("Cirque magique","cirque","1h45","Alice",310);
		lesSpectacles.add(spe1);
		lesSpectacles.add(spe2);
		lesSpectacles.add(spe3);
		lesSpectacles.add(spe4);
		
		LocalDate date1 = LocalDate.of(2024, 02, 15);
		LocalDate date2 = LocalDate.of(2024, 02, 17);
		LocalDate date3 = LocalDate.of(2024, 03, 05);
		LocalDate date4 = LocalDate.of(2024, 03, 06);
		LocalDate date5 = LocalDate.of(2024, 03, 27);
		LocalDate date6 = LocalDate.of(2024, 03, 28);
		LocalDate date7 = LocalDate.of(2024, 04, 19);
		LocalDate date8 = LocalDate.of(2024, 04, 20);
		
		lesResa.add(new Reservation(client1,spe1,date1,date2));
		lesResa.add(new Reservation(client3,spe3,date3,date4));
		lesResa.add(new Reservation(client4,spe4,date5,date6));
		lesResa.add(new Reservation(client2,spe2,date7,date8));

	}

	static public ObservableList<Client> getLesClients() {
		return lesClients;
	}
	
	static public ObservableList<Reservation> getLesResa() {
		return lesResa;
	}
	
	static public ObservableList<Spectacle> getLesSpectacle() {
		return lesSpectacles;
	}


	// m�thodes de mise � jour
	static public void ajouterClient(Client c) {
		lesClients.add(c);
	}
	
	static public void ajouterReservation(Reservation r) {
		lesResa.add(r);
	}
	
	static public void ajouterSpectacle(Spectacle s) {
		lesSpectacles.add(s);
	}
}
