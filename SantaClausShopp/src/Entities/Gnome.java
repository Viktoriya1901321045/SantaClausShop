package Entities;

import Observables.ObserverInterface;

public class Gnome implements ObserverInterface{

	private MagicPlank magicPlank;
	private String name;

    private String playthingType;
    private String[] playthingTypeDetails;

    private Plaything playthingCreation;

    private Shop shop;
    
    public Gnome(MagicPlank Plank,String gnomeName, Shop shop){
        this.magicPlank = Plank;
        this.setName(gnomeName);
        this.shop = new Shop();
    }
	
	@Override
	public void getPlaythingDetails() {
		this.playthingType = this.magicPlank.getPlaythingType();
        this.playthingTypeDetails = this.magicPlank.getPlaythingDetails();

        playthingCreation = shop.create(this.getName(),this.playthingType,this.playthingTypeDetails);

        System.out.println(System.lineSeparator() + playthingCreation);
	}

	private void setName(String gnomeName){
        this.name = gnomeName;
    }
	
	@Override
	public String getName() {
		return this.name;
	}
	

}
