package se254.a03;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController extends Application {
	@FXML
	private Button leases, equipment, customers, employees;
	private Parent equipmentParent, customersParent, employeesParent;
	private Scene scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent homePage = FXMLLoader.load(getClass().getResource("./resources/homeSelector.fxml"));
		homePage.getStylesheets().add(getClass().getResource("./resources/style.css").toExternalForm());
		scene = new Scene(homePage, 600, 400);
		primaryStage.setTitle("Lease Right client");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		System.out.println("www");
	}
	public void changeScreenLeases(ActionEvent event) throws IOException{
		Parent leaseParent = FXMLLoader.load(getClass().getResource("./resources/leasesScreen.fxml"));
		Scene leaseScene = new Scene(leaseParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(leaseScene);
		window.show();
	}
	public static void main (String[] args) {
		launch(args);
	}
}
