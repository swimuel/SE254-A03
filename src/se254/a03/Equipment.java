package se254.a03;

import javafx.beans.property.SimpleStringProperty;

public class Equipment {
	public SimpleStringProperty uID, type, year, weight, repairs, pType, pSpeed, os, dSize, tScreen;
	
	public Equipment(String uID, String type, String year, String weight, String repairs, String pType,
			String pSpeed, String os, String dSize, String tScreen) {
		this.uID = new SimpleStringProperty(uID);
		this.type = new SimpleStringProperty(type);
		this.year = new SimpleStringProperty(year);
		this.weight = new SimpleStringProperty(weight);
		this.repairs = new SimpleStringProperty(repairs);
		this.pType = new SimpleStringProperty(pType);
		this.pSpeed = new SimpleStringProperty(pSpeed);
		this.os = new SimpleStringProperty(os);
		this.dSize = new SimpleStringProperty(dSize);
		this.tScreen = new SimpleStringProperty(tScreen);
	}
	public String getUID(){
		return uID.get();
	}
	public String getType(){
		return type.get();
	}
	public String getYear(){
		return year.get();
	}
	public String getWeight(){
		return weight.get();
	}
	public String getRepairs(){
		return repairs.get();
	}
	public String getPType(){
		return pType.get();
	}
	public String getPSpeed(){
		return pSpeed.get();
	}
	public String getOs(){
		return os.get();
	}
	public String getDSize(){
		return dSize.get();
	}
	public String getTScreen(){
		return tScreen.get();
	}
}
