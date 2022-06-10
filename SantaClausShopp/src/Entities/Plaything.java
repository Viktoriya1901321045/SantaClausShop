package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Plaything {
	
	private Date creationDate;
	private String creator;
	private String playthingName;
    private SimpleDateFormat formatterDate;
    
    public Plaything(Date creationDate, String playthingName, String creator, String...additionDetails) {
    	this.setCreator(creator);
    	this.setCreationDate(creationDate);
    	this.setPlaythingName(playthingName);
    	this.formatterDate = new SimpleDateFormat("yyyy-MM-dd в HH:mm:ss часа");
    }
    
    private void setCreator(String gnomeName){
        this.creator = gnomeName;
    }

    protected String getCreator(){
        return this.creator;
    }

    private void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }

    protected String getCreationDate(){
        return formatterDate.format(this.creationDate);
    }
    
    private void setPlaythingName(String playthingName) {
    	this.playthingName = playthingName;
    }
    
    protected String getPlaythingName() {
    	return this.playthingName;
    }
    
    @Override
    public String toString() {
        return String.format("%s създаде %s на %s",this.getPlaythingName() ,this.getCreator(), this.getCreationDate());
    }
}
