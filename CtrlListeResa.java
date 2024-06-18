package SAE201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CtrlListeResa {
	@FXML private Button bnSupprimer;
    @FXML private TableView<Reservation> tvListeResa;
    @FXML private Button bnAjouter;
    @FXML private Button bnFermer;
    @FXML private Button bnModifier;
    @FXML private MenuItem menuListeResa;
    @FXML private MenuItem menuListeClient;
    @FXML private MenuItem menuAjoutResa;
    @FXML private MenuItem menuAjoutClient;
    @FXML private MenuButton bnMenuResa;
    @FXML private MenuButton bnMenuClient;

    @FXML void clicAjouter(ActionEvent event) {
    	Main.ouvrirAjoutResa();
    }

    @FXML void clicModifer(ActionEvent event) {

    }

    @FXML void clicSupprimer(ActionEvent event) {

    }

    @FXML void clicFermer(ActionEvent event) {
    	Main.fermerListeResa();
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
	
	

    
    @FXML void initialize() {
		TableColumn<Reservation,String> colonne1 = new TableColumn<Reservation,String>("Numéro réservation");
		colonne1.setCellValueFactory(new PropertyValueFactory<Reservation,String>("numero"));
		tvListeResa.getColumns().set(0, colonne1);
		
		TableColumn<Reservation,String> colonne2 = new TableColumn<Reservation,String>("Nom client");
		colonne2.setCellValueFactory(new PropertyValueFactory<Reservation,String>("client"));
		tvListeResa.getColumns().set(1, colonne2);
		
		TableColumn<Reservation,String> colonne3 = new TableColumn<Reservation,String>("Nom spectacle");
		colonne3.setCellValueFactory(new PropertyValueFactory<Reservation,String>("spectacle"));
		tvListeResa.getColumns().set(2, colonne3);
		
		TableColumn<Reservation, String> colonne4 = new TableColumn<Reservation,String>("Date de réservation");
		colonne4.setCellValueFactory(new PropertyValueFactory<Reservation, String>("date"));
		tvListeResa.getColumns().set(3, colonne4);
		
    	TableColumn<Reservation,String> colonne5 = new TableColumn<Reservation,String>("Date de confirmation");
		colonne5.setCellValueFactory(new PropertyValueFactory<Reservation,String>("dateEnvoiConf"));	
		tvListeResa.getColumns().set(4, colonne5);
				
		tvListeResa.setItems(Donnees.getLesResa());
		tvListeResa.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }
}
