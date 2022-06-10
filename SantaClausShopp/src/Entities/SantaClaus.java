package Entities;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Commands.BicycleCommand;
import Commands.KuklaCommand;
import Commands.SantaClaus_PlaythingCommandInterface;

public class SantaClaus {
	private ArrayList<String> Commands;
	
	SantaClaus_PlaythingCommandInterface bicycleCommand;
	SantaClaus_PlaythingCommandInterface kuklaCommand;
	
	public SantaClaus(MagicPlank magicPlank){
        this.kuklaCommand = new KuklaCommand(magicPlank);
        this.bicycleCommand = new BicycleCommand(magicPlank);
    }
	
	public void readCommandsFromInputFile(String fileLocation){
        try (Stream<String> lines = Files.lines(Paths.get(fileLocation),Charset.defaultCharset())) {
            this.Commands = (ArrayList<String>) lines.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("End");
        }
    }
	
	public void SantaClausCommandExecutor(){
        for(String Command : Commands){

            String[] commandParts = Command.split("-");

            String commandType = commandParts[0];
            String playthingType = commandParts[1];

            if (commandType.equalsIgnoreCase("Трябват ми")){

                if(playthingType.equalsIgnoreCase(("кукли"))){
                    this.kuklaCommand.setAdditionDetailsForPlaything(commandParts[2], commandParts[3], commandParts[4], commandParts[5]);
                    this.kuklaCommand.commandExecute();

                }else if(playthingType.equalsIgnoreCase("колелета")){
                    this.bicycleCommand.setAdditionDetailsForPlaything(commandParts[2], commandParts[3], commandParts[4], commandParts[5], commandParts[6]);
                    this.bicycleCommand.commandExecute();
                }

            }
        }
    }
	
	public int getNumOfExecutedCommands(){
        return this.Commands.size();
    }
}
