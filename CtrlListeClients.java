package SAE201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CtrlListeClients {
	  	@FXML private Button bnSupprimer;
	    @FXML private Button bnTries;
	    @FXML private Label  lblTitre;
	    @FXML private Button bnFiltres;
	    @FXML private TableView<Client> tvListeClients;
	    @FXML private Button bnAjouter;
	    @FXML private Button bnFermer;
	    @FXML private Button bnModifer;
	    @FXML private MenuItem menuListeResa;
	    @FXML private MenuItem menuListeClient;
	    @FXML private MenuItem menuAjoutResa;
	    @FXML private MenuItem menuAjoutClient;
	    @FXML private MenuButton bnMenuResa;
	    @FXML private MenuButton bnMenuClient;

	    @FXML void clicFiltres(ActionEvent event) {

	    }

	    @FXML void clicTries(ActionEvent event) {

	    }
	    
	    @FXML void clicModifier(ActionEvent event) {

	    }
	    
	    @FXML void clicSupprimer(ActionEvent event) {

	    }
	    
		//////////////////////////////////////////////////////////
		// MENU
		//////////////////////////////////////////////////////////
		
		@FXML void clicMenuClient(ActionEvent event) {
			Main.ouvrirListeClient();
		}
		
		@FXML void clicMenuAjoutClient(ActionEvent event) {
			Main.ouvrirAjoutClient();
		}
		
		@FXML void clicMenuListeClient(ActionEvent event) {
			Main.ouvrirListeClient();
		}
		
		@FXML void clicMenuResa(ActionEvent event) {
			Main.ouvrirListeResa();
		}
		
		@FXML void clicMenuAjoutResa(ActionEvent event) {
			Main.ouvrirAjoutResa();
		}
		
		@FXML void clicMenuListeResa(ActionEvent event) {
			Main.ouvrirListeResa();
		}

	    // clic sur bouton Ajouter
	    @FXML void clicAjouter(ActionEvent event) {
	    	Main.ouvrirAjoutClient();
	    }
     
	     // clic sur bouton Fermer
	    @FXML void clicFermer(ActionEvent event) {
	    	Main.fermerListeClient();
	    }
    
	    @FXML void initialize() {
			TableColumn<Client,String> colonne1 = new TableColumn<Client,String>("Numero");
			colonne1.setCellValueFactory(new PropertyValueFactory<Client,String>("numero"));
			tvListeClients.getColumns().set(0, colonne1);
			TableColumn<Client, String> colonne2 = new TableColumn<Client,String>("Nom");
			colonne2.setCellValueFactory(new PropertyValueFactory<Client, String>("nom"));
			tvListeClients.getColumns().set(1, colonne2);
	    	TableColumn<Client,String> colonne3 = new TableColumn<Client,String>("Prenom");
			colonne3.setCellValueFactory(new PropertyValueFactory<Client,String>("prenom"));	
			tvListeClients.getColumns().set(2, colonne3);
			TableColumn<Client, String> colonne4 = new TableColumn<Client,String>("Adresse");
			colonne4.setCellValueFactory(new PropertyValueFactory<Client, String>("adresse"));
			tvListeClients.getColumns().set(3, colonne4);
			TableColumn<Client,String> colonne5 = new TableColumn<Client,String>("Mail");
			colonne5.setCellValueFactory(new PropertyValueFactory<Client,String>("mail"));
			tvListeClients.getColumns().set(4, colonne5);
			TableColumn<Client,String> colonne6 = new TableColumn<Client,String>("Telephone");
			colonne6.setCellValueFactory(new PropertyValueFactory<Client,String>("tel"));
			tvListeClients.getColumns().set(5, colonne6);
			TableColumn<Client,String> colonne7 = new TableColumn<Client,String>("Ville");
			colonne7.setCellValueFactory(new PropertyValueFactory<Client,String>("ville"));
			tvListeClients.getColumns().set(6, colonne7);
					
			tvListeClients.setItems(Donnees.getLesClients());
			tvListeClients.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	
	    }
	    
}
