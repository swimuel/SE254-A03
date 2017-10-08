package se254.a03;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class HomeController extends Application {
	@FXML
	private Button leases, equipment, customers, employees;
	private Parent equipmentParent, customersParent, employeesParent;
	private Scene scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent homePage = FXMLLoader.load(getClass().getResource("./resources/homeSelector.fxml"));
		scene = new Scene(homePage, 600, 400);
		primaryStage.setTitle("Lease Right client");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public void changeScreenEqt(ActionEvent event) throws IOException{
		Parent eqtParent = FXMLLoader.load(getClass().getResource("./resources/eqtScreen.fxml"));
		Scene eqtScene = new Scene(eqtParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(eqtScene);
		window.show();
	}
	public void changeScreenOther(ActionEvent event) throws IOException{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Functionally identically to Equipment");
		alert.setHeaderText(null);
		alert.setContentText("All 4 options are functionally identical so you will"
				+ " now be taken to the Equipment screen");
		alert.showAndWait();
		Parent eqtParent = FXMLLoader.load(getClass().getResource("./resources/eqtScreen.fxml"));
		Scene eqtScene = new Scene(eqtParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(eqtScene);
		window.show();
	}
	public static void main (String[] args) {
		launch(args);
	}
}
