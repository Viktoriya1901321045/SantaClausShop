package Commands;

import Entities.MagicPlank;


public class KuklaCommand implements SantaClaus_PlaythingCommandInterface {
	
	private MagicPlank magicPlank;

    private String colorOfHair;
    private String eyeColor;
    private String Kuklaheight;
    private String Kuklawidth;
    
    public KuklaCommand(MagicPlank magicPlank){
        this.magicPlank = magicPlank;
    }
	
	public void commandExecute() {
		this.magicPlank.setPlaything("кукла",colorOfHair,Kuklaheight,Kuklawidth,eyeColor);
	}

	public void setAdditionDetailsForPlaything(String... additionDetails) {
		this.colorOfHair = additionDetails[0];
        this.Kuklaheight = additionDetails[1];
        this.Kuklawidth = additionDetails[2];
        this.eyeColor = additionDetails[3];
	}
}

