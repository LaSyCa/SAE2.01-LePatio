package SAE201;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class CtrlAccueil {
	
    @FXML private Button bnResa;
    @FXML private ImageView reserv;
    @FXML private MenuButton btn_tarif;
    @FXML private Button bnTarification;
    @FXML private Button bnFermer;
    @FXML private Button bnSpectacle;
    @FXML private ImageView spetacle;
    @FXML private Button bnClient;
    @FXML private ImageView tarif;
    @FXML private MenuButton btn_spectacle;
    @FXML private ImageView client;
	@FXML private MenuItem menuListeResa;
    @FXML private MenuItem menuListeClient;
    @FXML private MenuItem menuAjoutResa;
    @FXML private MenuItem menuAjoutClient;
    @FXML private MenuButton bnMenuResa;
    @FXML private MenuButton bnMenuClient;

    @FXML void clicClient(ActionEvent event) {
    	Main.ouvrirListeClient();
    }

    @FXML void clicReservation(ActionEvent event) {
    	Main.ouvrirListeResa();
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

    @FXML void clicFermer(ActionEvent event) {
    	Main.fermerAppli();
    }
}
