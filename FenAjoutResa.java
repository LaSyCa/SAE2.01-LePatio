package SAE201;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenAjoutResa extends Stage{
	private CtrlAjoutResa ctrl;

	public FenAjoutResa() throws IOException {
		this.setTitle("Nouvelle réservation");
		this.setResizable(false);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/FormulaireReservation.fxml"));
        Pane root = loader.load();
        ctrl = loader.getController();
     	return root;
	}
	
	public void effacer() {
		ctrl.effacer();
	}

	public void afficheLeClient(Client c) {
		ctrl.afficheLeClient(c);
	}
	
	public void afficheLeSpectacle(Spectacle s) {
		ctrl.afficheLeSpectacle(s);
	}
}
