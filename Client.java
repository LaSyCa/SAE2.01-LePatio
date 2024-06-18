package SAE201;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	private final StringProperty prenom;
	private final StringProperty nom;
	private final StringProperty adresse;
	private final StringProperty tel;
	private final StringProperty mail;
	private final StringProperty ville;
	private final String numero;
	public static int num;

	public Client() {
		this.prenom = new SimpleStringProperty();
		this.nom = new SimpleStringProperty();
		this.adresse = new SimpleStringProperty();
		this.tel = new SimpleStringProperty();
		this.mail = new SimpleStringProperty();
		this.ville = new SimpleStringProperty();
		this.numero = String.valueOf(num++);
	}
	public Client(String prenom, String nom, String adresse, String mail, String tel, String ville){
		this.prenom = new SimpleStringProperty(prenom);
		this.nom = new SimpleStringProperty(nom);
		this.adresse = new SimpleStringProperty(adresse);
		this.tel = new SimpleStringProperty(tel);
		this.mail = new SimpleStringProperty(mail);
		this.ville = new SimpleStringProperty(ville);
		this.numero = String.valueOf(num++);
	}

	public String getAdresse() {
		return adresse.get();
	}
	public void setAdresse(String adresse) {
		this.adresse.set(adresse);
	}
	public StringProperty adresseProperty() {
		return this.adresse;
	}

	public String getNom() {
		return nom.get();
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public StringProperty nomProperty() {
		return this.nom;
	}
	
	public String getPrenom() {
		return prenom.get();
	}
	public void setPrenom(String prenom) {
		this.prenom.set(prenom);
	}
	
	public StringProperty prenomProperty() {
		return this.prenom;
	}
	
	public String getTel() {
		return tel.get();
	}
	public void setTel(String tel) {
		this.tel.set(tel);
	}
	public StringProperty telProperty() {
		return this.tel;
	}
	
	public String getMail() {
		return mail.get();
	}
	
	public void setMail(String mail) {
		this.mail.set(mail);
	}
	
	public StringProperty mailProperty() {
		return this.mail;
	}
	
	public StringProperty getVille() {
		return ville;
	}
	
	public StringProperty villeProperty() {
		return this.ville;
	}
	
	public String getNumero() {
		return numero;
	}
	public void affiche() {
		System.out.println("Prenom : " + this.getPrenom());
		System.out.println("Nom : " + this.getNom());
		System.out.println("Tel : " + this.getTel());
		System.out.println("Adresse : " + this.getAdresse());
		System.out.println("Mail : " + this.getMail());
	}
	
	@Override
	public String toString() {
		return "Client [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + ", mail=" + mail
				+ ", numero=" + numero + "]";
	}
	
	
}
