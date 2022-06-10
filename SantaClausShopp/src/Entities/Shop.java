package Entities;

import java.util.Date;

public class Shop implements ShopInterface {

	private Plaything plaything;

    private Date getCurrDate(){
        Date currDate = new Date();
        return currDate;
    }
	
	public Plaything create(String createdBy, String playthingType, String... playthingDetails) {
		if (playthingType.equalsIgnoreCase("�����")){
            plaything = new Kukla(this.getCurrDate(),createdBy,playthingType, playthingDetails);
        }else if(playthingType.equalsIgnoreCase("������")){
            plaything = new Bicycle(this.getCurrDate(),createdBy,playthingType, playthingDetails);
        }

        return plaything;
	}
}
