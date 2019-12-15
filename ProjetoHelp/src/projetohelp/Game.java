/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */
public class Game {
    private Parser parser;
    Command command;
    private CommandActions processor;
    public  Player player;
  
    
    public Game(){
        parser = new Parser();
        player = new Player("Robin");
        processor = new CommandActions();
   
    }
    
    
    public void start(){
    boolean gameOn = true;
    //should i store the coomand and processor atribute here? 
    while(gameOn){
       command = parser.getCommand();
        if(command.isUnknown()){
            System.out.println("This command is invalid");
           
        }else if(command.getFirstWord().equalsIgnoreCase("Quit") && command.getSecondWord().equals("")){
            gameOn=false;
        }else{
        processor.processCommand(command,this);
        } 
    }
        System.out.println("game is over!");
    
    
    }

    
    /*
    public  void See(){
        System.out.println(player.getCurrentSector().getLongDescription());
        System.out.println("");
        System.out.println("There is a chest with "
                           + player.getCurrentSector().getChestlength() + "artifcats");
        System.out.println("");
        System.out.println(""); // print exits       
    }
    
    private void seeBag(){
       player.printBag();
    }
    
    private void seeChest(){
        player.getCurrentSector().printChestContents();
    }
    
    
    
    
    
    
    
    
    
    
    
    private void help(){
        parser.showCommands();
    
}*/
    
    
  
    
}
