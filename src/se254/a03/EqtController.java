package se254.a03;

import java.io.IOException;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EqtController {
	@FXML
	TableView<Equipment> table;
	TableColumn<Equipment, String> id, type, year, weight, repairs, ptype, pspeed, os, dsize, tscreen;
	TableColumn<Equipment, Void> print, computer;
	@FXML
	void initialize() throws IOException {
		id = new TableColumn<Equipment, String>("Unique ID");
		id.setCellValueFactory(new PropertyValueFactory<Equipment,String>("uID"));
		type = new TableColumn<Equipment, String>("Type");
		type.setCellValueFactory(new PropertyValueFactory<Equipment,String>("type"));

		year = new TableColumn<Equipment, String>("Year");
		year.setCellValueFactory(new PropertyValueFactory<Equipment,String>("year"));

		weight = new TableColumn<Equipment, String>("Weight");
		weight.setCellValueFactory(new PropertyValueFactory<Equipment,String>("weight"));

		repairs = new TableColumn<Equipment, String>("Repairs");
		repairs.setCellValueFactory(new PropertyValueFactory<Equipment,String>("repairs"));
		
		print = new TableColumn<Equipment, Void>("Printer");
		
		ptype = new TableColumn<Equipment, String>("Page Type");
		ptype.setCellValueFactory(new PropertyValueFactory<Equipment,String>("pType"));

		pspeed = new TableColumn<Equipment, String>("Print Speed");
		pspeed.setCellValueFactory(new PropertyValueFactory<Equipment,String>("pSpeed"));
		
		print.getColumns().add(ptype);
		print.getColumns().add(pspeed);
		
		computer = new TableColumn<Equipment,Void>("Computer");

		os = new TableColumn<Equipment, String>("OS");
		os.setCellValueFactory(new PropertyValueFactory<Equipment,String>("os"));

		dsize = new TableColumn<Equipment, String>("Display Size");
		dsize.setCellValueFactory(new PropertyValueFactory<Equipment,String>("dSize"));
		
		tscreen = new TableColumn<Equipment, String>("Touch Screen");
		tscreen.setCellValueFactory(new PropertyValueFactory<Equipment,String>("tScreen"));
		
		computer.getColumns().addAll(os, dsize, tscreen);
		
		table.setItems(getEqt());
		table.getColumns().addAll(id, type, year, weight, repairs, print, computer);
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	public ObservableList<Equipment> getEqt(){
		ObservableList<Equipment> eqt = FXCollections.observableArrayList();
		eqt.add(new Equipment("p12367", "PRINTER", "2012", "2.7", "none", "A4", "47", "null", "null", "null"));
		eqt.add(new Equipment("l65739", "LAPTOP", "2016", "1.5", "none", "null", "null", "Win7", "13\"", "Yes"));
		eqt.add(new Equipment("p27674", "PRINTER", "2014", "4.6", "none", "A3", "28", "null", "null", "null"));
		eqt.add(new Equipment("d34598", "DESKTOP", "2016", "6.8", "none", "null", "null", "Win10", "25\"", "No"));
		return eqt;
	}
	public void changeScreenHome(ActionEvent event) throws IOException{
		Parent homeParent = FXMLLoader.load(getClass().getResource("./resources/homeSelector.fxml"));
		Scene homeScene = new Scene(homeParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(homeScene);
		window.show();
	}
	public void changeScreenSearch(ActionEvent event) throws IOException{
		Parent searchParent = FXMLLoader.load(getClass().getResource("./resources/searchScreen.fxml"));
		Scene searchScene = new Scene(searchParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(searchScene);
		window.show();
	}
	public void changeScreenAdd(ActionEvent event) throws IOException{
		Parent addParent = FXMLLoader.load(getClass().getResource("./resources/addScreen.fxml"));
		Scene addScene = new Scene(addParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(addScene);
		window.show();
	}
	public void changeScreenUpdate(ActionEvent event) throws IOException{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information missing from dummy model");
		alert.setHeaderText(null);
		alert.setContentText("Information missing from dummy model");
		alert.showAndWait();
		Parent addParent = FXMLLoader.load(getClass().getResource("./resources/addScreen.fxml"));
		Scene addScene = new Scene(addParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(addScene);
		window.show();
	}
	public void delete(){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Are you sure");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure you want to delete this equipment?");
		alert.showAndWait();
	}
}
