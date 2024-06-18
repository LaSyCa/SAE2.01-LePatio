package SAE201;

import java.util.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Spectacle {
	private final String numero;
	private final StringProperty nom;
	private final StringProperty genre;
	private final StringProperty duree;
	private final StringProperty artiste;
	private final IntegerProperty nbMaxSpectateur;
	public static int num;

	public Spectacle() {
		this.numero = String.valueOf(num++);
		this.duree = new SimpleStringProperty();
		this.nom = new SimpleStringProperty();
		this.genre = new SimpleStringProperty();
		this.artiste = new SimpleStringProperty();
		this.nbMaxSpectateur = new SimpleIntegerProperty();
	}
	public Spectacle(String nom,String genre, String duree, String artiste, Integer nbMaxSpectateur){
		this.numero = String.valueOf(num++);
		this.duree = new SimpleStringProperty(duree);
		this.nom = new SimpleStringProperty(nom);
		this.artiste = new SimpleStringProperty(artiste);
		this.genre = new SimpleStringProperty(genre);
		this.nbMaxSpectateur = new SimpleIntegerProperty(nbMaxSpectateur);
	}
	
	public String getGenre() {
		return genre.get();
	}
	public void setGenre(String genre) {
		this.genre.set(genre);
	}
	public StringProperty genreProperty() {
		return genre;
	}
	
	public String getNomSpectacle() {
		return nom.get();
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public StringProperty nomProperty() {
		return nom;
	}
	
	public String getDuree() {
		return genre.get();
	}
	public void setDuree(String duree) {
		this.duree.set(duree);
	}
	public StringProperty dureeProperty() {
		return duree;
	}
	
	public String getArtiste() {
		return artiste.get();
	}
	public void setArtiste(String artiste) {
		this.artiste.set(artiste);
	}
	public StringProperty artisteProperty() {
		return artiste;
	}
	
	public IntegerProperty getNbMaxSpectateur() {
		return nbMaxSpectateur;
	}
	public void setGenre(Integer nbMaxSpectateur) {
		this.nbMaxSpectateur.set(nbMaxSpectateur);
	}
	public IntegerProperty nbMaxSpectateurProperty() {
		return nbMaxSpectateur;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void affiche() {
		System.out.println("Duree : " + this.getDuree());
		System.out.println("Artiste : " + this.getArtiste());
		System.out.println("Genre : " + this.getGenre());
		System.out.println("nombre maximum de spectateur : " + this.getNbMaxSpectateur());
	}
	@Override
	public String toString() {
		return "Spectacle [numero=" + numero + ", genre=" + genre + ", duree=" + duree + ", artiste=" + artiste
				+ ", nbMaxSpectateur=" + nbMaxSpectateur + "]";
	}
}
