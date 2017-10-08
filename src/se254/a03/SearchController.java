package se254.a03;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SearchController {
	@FXML
	void initialize() throws IOException{
	}
	public void changeScreenEqt(ActionEvent event) throws IOException{
		Parent leaseParent = FXMLLoader.load(getClass().getResource("./resources/eqtScreen.fxml"));
		Scene leaseScene = new Scene(leaseParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(leaseScene);
		window.show();
	}
}
