package SAE201;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenAccueil extends Stage{
	private CtrlAccueil ctrl;
	
	public FenAccueil() throws IOException {
		this.setTitle("Accueil : ");
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
		this.setResizable(false);
		this.show();
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Accueil.fxml"));
        Pane root = loader.load();
        ctrl = loader.getController();
     	return root;
	}
}
