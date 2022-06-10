package Commands;

import Entities.MagicPlank;


public class BicycleCommand implements SantaClaus_PlaythingCommandInterface{

	private MagicPlank magicPlank;

    private String blossom;
    private String category;
    private String mark;
    private String numOfWheels;
    private String numOfSpeeds;
    
    public BicycleCommand(MagicPlank magicPlank){
        this.magicPlank = magicPlank;
    }
	
	public void commandExecute() {
		this.magicPlank.setPlaything("колело",blossom,numOfWheels,numOfSpeeds,category,mark);
	}

	public void setAdditionDetailsForPlaything(String... additionDetails) {
		this.blossom = additionDetails[0];
        this.numOfWheels = additionDetails[1];
        this.numOfSpeeds = additionDetails[2];
        this.category = additionDetails[3];
        this.mark = additionDetails[4];
	}

}

