package se254.a03;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent homePage = FXMLLoader.load(getClass().getResource("./resources/homeSelector.fxml"));
		homePage.getStylesheets().add(getClass().getResource("./resources/style.css").toExternalForm());
		Scene scene = new Scene(homePage, 600, 400);
		primaryStage.setTitle("Lease Right client");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main (String[] args) {
		launch(args);
	}
}
