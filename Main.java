package SAE201;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application{
	static private FenListeClients fListeC;
	static private FenAjoutClient fAjoutC;
	static private FenListeResa fListeR;
	static private FenAjoutResa fAjoutR;
	static private FenAccueil fAcceuil;

	public void start(Stage primaryStage) throws Exception {
		Donnees.chargementDonnees();
		fListeC = new FenListeClients();
		fAjoutC = new FenAjoutClient();
		fListeR = new FenListeResa();
		fAjoutR = new FenAjoutResa();
		fAcceuil = new FenAccueil();
		fAcceuil.show();
		fAjoutC.initModality(Modality.APPLICATION_MODAL);
		fAjoutR.initModality(Modality.APPLICATION_MODAL);
	}
	
	//////////////////////////////////////////////////////////
	// Gestion des fenêtres
	//////////////////////////////////////////////////////////
	static public void ouvrirAjoutClient() {
		fAjoutC.effacer();
		fAjoutC.show();
	}
	
	static public void fermerAjoutClient() {
		fAjoutC.close();
		fListeC.show();
	}
	
	
	static public void afficherClient(Client c) { 
		fAjoutR.afficheLeClient(c);
		fAjoutR.show(); 
	}
	
	static public void afficherSpectacle(Spectacle s) { 
		fAjoutR.afficheLeSpectacle(s);
		fAjoutR.show(); 
	}
	 
	
	static public void ouvrirAjoutResa() {
		fAjoutR.effacer();
		fAjoutR.show();
	}
	
	static public void fermerAjoutResa() {
		fAjoutR.close();
		fListeR.show();
	}
	
	static public void ouvrirListeClient() {
		fAcceuil.close();
		fListeR.close();
		fListeC.show();
	}
	
	static public void fermerListeClient() {
		fListeC.close();
		fAcceuil.show();
	}
	
	static public void ouvrirListeResa() {
		fAcceuil.close();
		fListeC.close();
		fListeR.show();
	}
	
	static public void fermerListeResa() {
		fListeR.close();
		fAcceuil.show();
	}
	
	static public void fermerAppli() {
		System.exit(0);
	}
    
	//////////////////////////////////////////////////////////
	// Mise à jour des données
	//////////////////////////////////////////////////////////
	
	static public void validerNouveauClient(String prenom, String nom, String adresse, String mail, String tel, String ville) {
    	Client client = new Client(prenom,nom, adresse, mail, tel, ville);
    	Donnees.ajouterClient(client);
    	fAjoutC.close();
	}
	
	static public void validerNouvelleResa(Client client, Spectacle spectacle,LocalDate date, LocalDate dateEnvoiConf) {
    	Reservation resa = new Reservation(client, spectacle,date,dateEnvoiConf);
    	Donnees.ajouterReservation(resa);
    	fAjoutR.close();
	}
//	
//	static public void validerModifierEmploye(int mat, String nom, String poste, int sup, int annee, int mois, int jour, float sal, float prime, int dpt) {
//    	String date = annee+"/"+mois+"/"+jour;
//    	Employe emp = new Employe(mat, nom, poste, sup, date, sal, prime,dpt);
//    	Donnees.modifierEmploye(emp);
//    	fModifier.close();
//    }

	
	
//	static public void enregistrerNouvelEmploye(Employe e) {	
//		Donnees.ajouterEmploye(e);
//		fNouvel.close();
//	}
	
//	static public void modifierEmploye(Employe e) {	
//		Donnees.modifierEmploye(e);
//		fModifier.close();
//	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}
}
