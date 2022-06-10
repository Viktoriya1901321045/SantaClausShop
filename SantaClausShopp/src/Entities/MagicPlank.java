package Entities;

import java.util.HashMap;

import Observables.ObservableInterface;
import Observables.ObserverInterface;

public class MagicPlank implements ObservableInterface {

	private String playthingType;
    private String[] playthingDetails;
    private HashMap<String,ObserverInterface> gnomeAssignedToMagicPlank;
	
    public MagicPlank(){
        this.gnomeAssignedToMagicPlank = new HashMap<String,ObserverInterface>();
    }
    
    public void setPlaything(String playthingType,String...playthingDetails){
        this.setPlaythingType(playthingType);
        this.setPlaythingDetails(playthingDetails);
        notifyAllGnomes();
    }
    
    public String getPlaythingType(){
        return this.playthingType;
    }

    private void setPlaythingType(String playthingType){
        this.playthingType = playthingType;
    }

    public String[] getPlaythingDetails(){
        return this.playthingDetails;
    }

    private void setPlaythingDetails(String[] playthingDetails){
        this.playthingDetails = playthingDetails;
    }

    
	@Override
	public void assignGnomeToMagicPlank(ObserverInterface gnome) {
		this.gnomeAssignedToMagicPlank.put(gnome.getName(),gnome);
	}

	@Override
	public void releaseGnomeFromMagicPlank(String gnomeName) {
		this.gnomeAssignedToMagicPlank.remove(gnomeName);
	}

	@Override
	public void notifyAllGnomes() {
		gnomeAssignedToMagicPlank.forEach((key,value)-> value.getPlaythingDetails());
	}
}


