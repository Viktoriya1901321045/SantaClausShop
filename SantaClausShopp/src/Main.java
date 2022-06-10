import Entities.Gnome;
import Entities.MagicPlank;
import Entities.SantaClaus;
import Entities.Shop;

public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop();

	    String commandFile = "src/RunComm.txt";

	    MagicPlank magicPlank= new MagicPlank();
	    Gnome Gnome1 = new Gnome(magicPlank,"Viki", shop);
	    Gnome Gnome2 = new Gnome(magicPlank,"Moni", shop);
	    Gnome Gnome3 = new Gnome(magicPlank,"Deni", shop);
	    Gnome Gnome4 = new Gnome(magicPlank,"Steli", shop);
	    Gnome Gnome5 = new Gnome(magicPlank,"Nikol", shop);
	    Gnome Gnome6 = new Gnome(magicPlank,"Kameliya", shop);
	    Gnome Gnome7 = new Gnome(magicPlank,"Ani", shop);
	    Gnome Gnome8 = new Gnome(magicPlank,"Petko", shop);

	    magicPlank.assignGnomeToMagicPlank(Gnome1);
	    magicPlank.assignGnomeToMagicPlank(Gnome2);
	    magicPlank.assignGnomeToMagicPlank(Gnome3);
	    magicPlank.assignGnomeToMagicPlank(Gnome4);
	    magicPlank.assignGnomeToMagicPlank(Gnome5);
	    magicPlank.assignGnomeToMagicPlank(Gnome6);
	    magicPlank.assignGnomeToMagicPlank(Gnome7);
	    magicPlank.assignGnomeToMagicPlank(Gnome8);

	    SantaClaus santaclaus = new SantaClaus(magicPlank);
	    santaclaus.readCommandsFromInputFile(commandFile);
	    
	    try{
	        santaclaus.SantaClausCommandExecutor();
	        System.out.println("\n" + santaclaus.getNumOfExecutedCommands() + 
	        		" Jingle bells, jingle bells.");
	    }catch(Exception e){
	        System.out.println("End of operations."); 
	    }
	}

}
