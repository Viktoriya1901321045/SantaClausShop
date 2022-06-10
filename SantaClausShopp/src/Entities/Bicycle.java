package Entities;

import java.util.Date;

public class Bicycle extends Plaything {
	
	private String blossom;
    private String category;
    private String mark;
    private int numOfWheels;
    private int numOfSpeeds;

	public Bicycle(Date CreationDate, String playthingName, String creator, String[] additionDetails) {
		super(CreationDate, playthingName, creator, additionDetails);
		
		this.setBlossom(additionDetails[0]);
        this.setNumOfWheels(additionDetails[1]);
        this.setNumOfSpeeds(additionDetails[2]);
        this.setCategory(additionDetails[3]);
        this.setMark(additionDetails[4]);
	}

	 private void setBlossom(String blossom){
	     this.blossom = blossom;
	 }

	 private String getBlossom(){
	     return this.blossom;
	 }

	 private void setNumOfWheels(String numOfWheels){
	     this.numOfWheels = Integer.parseInt(numOfWheels);
	 }

	 private int getNumOfWheels(){
	     return this.numOfWheels;
	 }

	 private void setNumOfSpeeds(String numOfSpeeds){
	     this.numOfSpeeds = Integer.parseInt(numOfSpeeds);
	 }

	 private int getNumOfSpeeds(){
	     return this.numOfSpeeds;
	 }

	 private void setCategory(String category){
	     this.category = category;
	 }

	 private String getCategory(){
	     return this.category;
	 }
	 
	 private void setMark(String mark) {
		 this.mark = mark;
	 }
	 
	 private String getMark() {
		 return this.mark;
	 }
	 
	 public String toString() {
	        String currPlaything = String.format("%s - Цвят: %s, с %d колелета и %d скорости на марката %s",
	                            this.getCategory().toUpperCase(),
	                            this.getBlossom(),
	                            this.getNumOfWheels(),
	                            this.getNumOfSpeeds(),
	        					this.getMark());

	        String dataCreation = super.toString();

	        return currPlaything + System.lineSeparator() + dataCreation;
	    }
}
