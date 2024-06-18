package SAE201;


import java.time.LocalDate;
import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.DatePicker;

public class Reservation {
	private final String numero;
	private final StringProperty client;
	private final StringProperty spectacle;
	private final StringProperty date;
	private final StringProperty dateEnvoiConf;
	public static int num;

	public Reservation() {
		this.numero = String.valueOf(num++);
		this.client = new SimpleStringProperty();
		this.spectacle = new SimpleStringProperty();
		this.date = new SimpleStringProperty();
		this.dateEnvoiConf = new SimpleStringProperty();
	}
	public Reservation(Client client, Spectacle spectacle,LocalDate date, LocalDate dateEnvoiConf){
		this.numero = String.valueOf(num++);;
		this.client = new SimpleStringProperty(client.getNom());
		this.spectacle = new SimpleStringProperty(spectacle.getNomSpectacle());
		this.date = new SimpleStringProperty(date.toString());
		this.dateEnvoiConf = new SimpleStringProperty(dateEnvoiConf.toString());
	}
	
	public StringProperty getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date.set(date);
	}
	public StringProperty dateProperty() {
		return this.date;
	}
	
	public StringProperty getDateEnvoiConf() {
		return dateEnvoiConf;
	}
	public void setDateEnvoiConf(String dateEnvoiConf) {
		this.dateEnvoiConf.set(dateEnvoiConf);
	}
	public StringProperty dateEnvoiConfProperty() {
		return this.dateEnvoiConf;
	}
	
	public StringProperty getNomClient() {
		return client;
	}
	public void setNomClient(String client) {
		this.client.set(client);;
	}
	public StringProperty clientProperty() {
		return this.client;
	}
	
	
	public StringProperty getNomSpectacle() {
		return spectacle;
	}
	public void setNomSpectacle(String spectacle) {
		this.spectacle.set(spectacle);;
	}
	public StringProperty spectacleProperty() {
		return this.spectacle;
	}
	
	
	public String getNumero() {
		return numero;
	}
	
	public void affiche() {
		System.out.println("Date : " + this.getDate());
		System.out.println("Date envoi de confirmation : " + this.getDateEnvoiConf());
	}
	@Override
	public String toString() {
		return "Reservation [numero=" + numero + ", date=" + date + ", dateEnvoiConf=" + dateEnvoiConf + "]";
	}
	
}
