/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */
public class CommandActions {
    public CommandActions(){
        
    }
    
    public void showAllCommands(){
         System.out.println("\nYou can enter one of the following valid actions:"
                + "\n\t> MYSELF"
                + "\n\t> SEE"
                + "\n\t> MYSELF"
                + "\n\t> SEE CHEST"
                + "\n\t> SEE BAG"
                + "\n\t> GET <NOME DO ARTEFACTO>"
                + "\n\t> DROP <NOME DO ARTEFACTO>"
                + "\n\t> MOVE <DIRECTION>"
                + "\n\t> ATACK <NOME DO ARTEFACTO>"
                + "\n\t> SHOW"
                + "\n\t> HELP"
                + "\n\t> QUIT\n");
         
    }
    public void processCommand(Command command,Game game){
    if(command.getFirstWord().equals("MYSELF")){
        
        System.out.println("Hello, " + game.player.getName());
        System.out.println("");
        System.out.println("your status are:");
        System.out.println("ap: " + game.player.getAttackPoints());
        System.out.println("dp: "+ game.player.getDefensePoints());
        System.out.println("xp: " + game.player.getExpPoints());
        System.out.println("");
        System.out.println("Your bag has " + game.player.getNumberOfBagArtifacts()
                          + "artifacts\n");
        
        System.out.println("parser is working!");
    }
    if(command.getFirstWord().equals("SEE")){
    
    }
    if(command.getFirstWord().equals("SEE") && command.getSecondWord().equals("BAG")){
    
    }
    if(command.getFirstWord().equals("SEE") && command.getSecondWord().equals("CHEST")){
    
    }
    if(command.getFirstWord().equals("GET") && command.getSecondWord().equals("APPOTION")){
    
    }
    if(command.getFirstWord().equals("GET") && command.getSecondWord().equals("DPPOTION")){
    
    }
    if(command.getFirstWord().equals("GET") && command.getSecondWord().equals("MONEYSMALL")){
    
    }
    if(command.getFirstWord().equals("GET") && command.getSecondWord().equals("MONEYMEDIUM")){
    
    }
    if(command.getFirstWord().equals("GET") && command.getSecondWord().equals("MONEYBIG")){
    
    }
    if(command.getFirstWord().equals("DROP") && command.getSecondWord().equals("MONEYMEDIUM")){
    
    }
    if(command.getFirstWord().equals("DROP") && command.getSecondWord().equals("DPPOTION")){
    
    }
    if(command.getFirstWord().equals("DROP") && command.getSecondWord().equals("APPOTION")){
    
    }
    if(command.getFirstWord().equals("DROP") && command.getSecondWord().equals("MONEYSMALL")){
    
    }
    if(command.getFirstWord().equals("DROP") && command.getSecondWord().equals("MONEYBIG")){
    
    }
    if(command.getFirstWord().equals("USE") && command.getSecondWord().equals("DPPOTION")){
    
    }
    if(command.getFirstWord().equals("USE") && command.getSecondWord().equals("MONEYMEDIUM")){
    
    }
    if(command.getFirstWord().equals("USE") && command.getSecondWord().equals("APPOTION")){
    
    }
    if(command.getFirstWord().equals("USE") && command.getSecondWord().equals("MONEYSMALL")){
    
    }
    if(command.getFirstWord().equals("USE") && command.getSecondWord().equals("MONEYBIG")){
    
    }
    if(command.getFirstWord().equals("HELP") && command.getSecondWord().equals("")){
    
    }
    if(command.getFirstWord().equals("SHOW") ){
    
    }
    if(command.getFirstWord().equals("ATTACK") && command.getSecondWord().equals("ALIEN")){
    
    }
    if(command.getFirstWord().equals("ATTACK") && command.getSecondWord().equals("MONSTER")){
    
    }
    if(command.getFirstWord().equals("MOVE") && command.getSecondWord().equals("NORTH")){
    
    }
    if(command.getFirstWord().equals("MOVE") && command.getSecondWord().equals("WEST")){
    
    }
    if(command.getFirstWord().equals("MOVE") && command.getSecondWord().equals("EAST")){
    
    }
    if(command.getFirstWord().equals("MOVE") && command.getSecondWord().equals("SOUTH")){
    
    }
    
    
    }
    
    public void processSingleWordCommand(Command command){
    
    }
    public void processDoubleWordCommand(Command command){
    
    }
    
}
