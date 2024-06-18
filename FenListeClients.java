package SAE201;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenListeClients extends Stage{
	public FenListeClients() throws IOException {
		this.setTitle("Liste des clients : ");
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
		this.setResizable(false);
		this.show();
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/listeClient.fxml"));
        Pane root = loader.load();
        loader.getController();
     	return root;
	}
}
