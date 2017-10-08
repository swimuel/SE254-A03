package se254.a03;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AddController {
	@FXML
	void initialize() throws IOException{
	}
	public void confirmScreenEqt(ActionEvent event) throws IOException{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Equipment added");
		alert.setHeaderText(null);
		alert.setContentText("Equipment has been added");
		alert.showAndWait();
		Parent leaseParent = FXMLLoader.load(getClass().getResource("./resources/eqtScreen.fxml"));
		Scene leaseScene = new Scene(leaseParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(leaseScene);
		window.show();
	}
	public void cancelScreenEqt(ActionEvent event) throws IOException{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Equipment not added");
		alert.setHeaderText(null);
		alert.setContentText("You pressed cancel, the equipment has not been added");
		alert.showAndWait();
		Parent leaseParent = FXMLLoader.load(getClass().getResource("./resources/eqtScreen.fxml"));
		Scene leaseScene = new Scene(leaseParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(leaseScene);
		window.show();
	}	
}
