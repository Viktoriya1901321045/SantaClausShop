package Entities;

import java.util.Date;

public class Kukla extends Plaything{
	
	private String colorOfHair;
	private String eyeColor;
    private double Kuklaheight;
    private double Kuklawidth;

	public Kukla(Date CreationDate, String playthingName, String creator, String[] additionDetails) {
		super(CreationDate, playthingName, creator, additionDetails);
		
		this.setColorOfHair(additionDetails[0]);
        this.setKuklaHeight(additionDetails[1]);
        this.setKuklaWidth(additionDetails[2]);
        this.setEyeColor(additionDetails[3]);
	}

	private void setColorOfHair(String colorOfHair){
        this.colorOfHair = colorOfHair;
    }

    private String getColorOfHair(){
        return this.colorOfHair;
    }

    private void setKuklaHeight(String kuklaheight){
        this.Kuklaheight = Double.parseDouble(kuklaheight);
    }

    private double getKuklaHeight(){
        return this.Kuklaheight;
    }

    private void setKuklaWidth(String kuklawidth){
        this.Kuklawidth = Double.parseDouble(kuklawidth);
    }

    private double getKuklaWidth(){
        return this.Kuklawidth;
    }
    
    private void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    private String getEyeColor(){
        return this.eyeColor;
    }
    
    @Override
    public String toString() {
        String currentPlaything = String.format("Кукла с %s коса, %s очи, %f висока и %f широка",
                this.getColorOfHair(),
                this.getEyeColor(),
                this.getKuklaHeight(),
                this.getKuklaWidth());

        String dataCreation = super.toString();

        return currentPlaything + System.lineSeparator() + dataCreation;
    }
}

