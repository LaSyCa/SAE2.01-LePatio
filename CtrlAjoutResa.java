package SAE201;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

public class CtrlAjoutResa {
	@FXML private TextField txtNom;
	@FXML private TextField txtNomSpectacle;
	@FXML private TextField txtPrenom;
	@FXML private TextField txtNumero;
	@FXML private TextField txtArtiste;
	@FXML private TextField txtGenre;
    @FXML private Button bnValider;
    @FXML private Button bnSup;
    @FXML private DatePicker txtDateResa;
    @FXML private Button bnAjouter;
    @FXML private Button bnAnnuler;
    @FXML private TextField txtNbTicket;
    @FXML private DatePicker txtJour;
    @FXML private Button bnInf;
    @FXML private Button bnValiderClient;
    @FXML private Button bnValiderSPectacle;
    @FXML private DatePicker txtDateConfResa;
    @FXML private TableView<Client> tvClients;
    @FXML private TableView<Spectacle> tvSpectacle;
    @FXML private ComboBox<String> cbNumClient = new ComboBox<String>();
   
    private int nombreTicket;

    
    @FXML void clicNumClient(ActionEvent event) {
 
    }

    @FXML void clicAjouter(ActionEvent event) {
    	Main.ouvrirAjoutClient();
    }

    @FXML void clicAnnuler(ActionEvent event) {
    	Main.fermerAjoutResa();
    }
    
	
	@FXML void clicValiderClient(ActionEvent event) {
	  Main.afficherClient(tvClients.getSelectionModel().getSelectedItem());
	}
	 
	
	@FXML void clicValiderSpectacle(ActionEvent event) {
		  Main.afficherSpectacle(tvSpectacle.getSelectionModel().getSelectedItem());
		}
		 

	
	@FXML void clicValider(ActionEvent event) { 
		Main.validerNouvelleResa( 
			tvClients.getSelectionModel().getSelectedItem(),
			tvSpectacle.getSelectionModel().getSelectedItem(),
			txtDateResa.getValue(),
			txtDateConfResa.getValue()
			);
	}

    
    @FXML void clicFermer(ActionEvent event) {
    	Main.fermerAppli();
    }
    
    @FXML void clicNbTicketInf(ActionEvent event){
    		nombreTicket = nombreTicket - 1;
    		if(nombreTicket < 0) {
    			nombreTicket = 0;
    		}
    		txtNbTicket.setText(nombreTicket + "");
    	
    }
    
    @FXML void clicNbTicketSup(ActionEvent event){
    	nombreTicket = nombreTicket + 1;
    	txtNbTicket.setText(nombreTicket + "");
    }
    
	
    public void afficheLeClient(Client c) { 
		txtNumero.setText(c.getNumero());
		txtPrenom.setText(c.getPrenom());
		txtNom.setText(c.getNom()); 
	}
	 
	public void afficheLeSpectacle(Spectacle s) { 
		txtNomSpectacle.setText(s.getNomSpectacle()); 
		txtArtiste.setText(s.getArtiste());
		txtGenre.setText(s.getGenre());
	}
	 
    private boolean nbTicketValide(String num) {
    	for (char c : num.toCharArray()) {
    		if(!Character.isDigit(c))
    			return false;
    	}
    	return true;
    }
    
    @FXML void verifieNbTicket(KeyEvent event) {
    	if(!nbTicketValide(txtNbTicket.getText()) ) {
    		txtNbTicket.setTooltip(new Tooltip("Format incorrect"));
    		txtNbTicket.setStyle("-fx-text-fill: red;");
    	}
    	else {
    		txtNbTicket.setStyle("-fx-text-fill: #00007B;");
    		txtNbTicket.setTooltip(new Tooltip("Un nombre"));
    	}
    }
    
    public void effacer() {
    	txtNom.clear();
    	txtNomSpectacle.clear();
    	txtPrenom.clear();
    	txtNumero.clear();
    	txtArtiste.clear();
    	txtGenre.clear();
    }
    
    public void initialize() {
    	nombreTicket = 1;
    	BooleanBinding manque = txtNom.textProperty().isEmpty();
    	bnValider.disableProperty().bind(Bindings.when(manque).then(true).otherwise(false));
    	
		TableColumn<Client,String> colonne1 = new TableColumn<Client,String>("Numero");
		colonne1.setCellValueFactory(new PropertyValueFactory<Client,String>("numero"));
		tvClients.getColumns().set(0, colonne1);
		TableColumn<Client, String> colonne2 = new TableColumn<Client,String>("Nom");
		colonne2.setCellValueFactory(new PropertyValueFactory<Client, String>("nom"));
		tvClients.getColumns().set(1, colonne2);
    	TableColumn<Client,String> colonne3 = new TableColumn<Client,String>("Prenom");
		colonne3.setCellValueFactory(new PropertyValueFactory<Client,String>("prenom"));	
		tvClients.getColumns().set(2, colonne3);
		TableColumn<Client,String> colonne4 = new TableColumn<Client,String>("Ville");
		colonne4.setCellValueFactory(new PropertyValueFactory<Client,String>("ville"));
		tvClients.getColumns().set(3, colonne4);
		
		tvClients.setItems(Donnees.getLesClients());
		
		TableColumn<Spectacle,String> colonne10 = new TableColumn<Spectacle,String>("Numero");
		colonne10.setCellValueFactory(new PropertyValueFactory<Spectacle,String>("numero"));
		tvSpectacle.getColumns().set(0, colonne10);
    	TableColumn<Spectacle,String> colonne25 = new TableColumn<Spectacle,String>("Nom");
		colonne25.setCellValueFactory(new PropertyValueFactory<Spectacle,String>("nom"));	
		tvSpectacle.getColumns().set(1, colonne25);
		TableColumn<Spectacle, String> colonne20 = new TableColumn<Spectacle,String>("Genre");
		colonne20.setCellValueFactory(new PropertyValueFactory<Spectacle, String>("genre"));
		tvSpectacle.getColumns().set(2, colonne20);
    	TableColumn<Spectacle,String> colonne30 = new TableColumn<Spectacle,String>("Duree");
		colonne30.setCellValueFactory(new PropertyValueFactory<Spectacle,String>("duree"));	
		tvSpectacle.getColumns().set(3, colonne30);
		TableColumn<Spectacle,String> colonne40 = new TableColumn<Spectacle,String>("Artiste");
		colonne40.setCellValueFactory(new PropertyValueFactory<Spectacle,String>("artiste"));
		tvSpectacle.getColumns().set(4, colonne40);
		TableColumn<Spectacle,Integer> colonne50 = new TableColumn<Spectacle,Integer>("nbMaxSpectateur");
		colonne50.setCellValueFactory(new PropertyValueFactory<Spectacle,Integer>("nbMaxSpectateur"));
		tvSpectacle.getColumns().set(5, colonne50);
		
		tvSpectacle.setItems(Donnees.getLesSpectacle());
    }

}
