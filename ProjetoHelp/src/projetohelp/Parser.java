
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */
public class Parser {
    
    private Scanner reader;

    public Parser() {
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        String inputLine = "";   // Armazena String completa introduzida
        String wordOne;
        String wordTwo;
        
        System.out.println("Please enter a command \n");
        System.out.print("> ");
        inputLine = reader.nextLine();

        wordOne = readWord(inputLine, 0); // Obter primeira palavra
        wordTwo = readWord(inputLine, 1); // Obter segunda palavra
        
        /*MEACNISM TO MAKE THE PARCER MORE TOLERENT AND USER FREANDLY*/
        wordOne = wordOne.toUpperCase(); // this make the command non case sensetive
        wordTwo = wordTwo.toUpperCase(); 
        wordOne = wordOne.trim();       //this protects the command from extra white space
        wordTwo = wordTwo.trim();       //this trim method sould be always after readword, 
                              // readword uses white space to sparete commands
        
        if (isCommand( wordOne, wordOne)) {
            return new Command(wordOne, wordTwo);
        } else {
            return new Command("","");
        }
    }

    /**
     * Metodo que recebe uma String e um index, e devolve a palavra referente a
     * essa mesma posição na String.
     *
     * @param string
     * @param index
     * @return
     */
    private String readWord(String string, int index) {
        String allWords[] = string.split(" ");
        String word = "";

        if (allWords.length-1 >= index) {
            word = allWords[index];
        }
        return word;
    }
 
    private boolean isCommand(String wordOne,String wordTwo){
        
        
        
        if(wordOne.equals("SEE")){
        switch(wordTwo){
        case "": 
        case "BAG": 
        case "CHEST":
        case "QUIT":return true;
        default: return false;
        }
        }
        if(wordOne.equals("MOVE")){
        switch(wordTwo){
        case "EAST": 
        case "WEST": 
        case "NORTH":
        case "SOUTH":return true;
        default: return false;
        }
        }
        if(wordOne.equals("GET")||wordOne.equals("DROP")||wordOne.equals("USE")){
        switch(wordTwo){
        case "DPPOTION": 
        case "APPOTTION": 
        case "MONEYSMALL":
        case "MONEYBIG":
        case "MONEYMEDIUM":return true;
        default: return false;
        }
        }
        if(wordOne.equals("ATTACK")){
        switch(wordTwo){
        case "MONSTER": 
        case "ALIEN": return true;
        default: return false;
        }
      }
     switch(wordOne){ // this checks for single word commads
        case "MYSELF":
        case "QUIT" :
        case "HELP": return wordTwo.equals(""); // checks secund word is empty
        default: return false;  // Cai nesta condiçao se wordOne nao for valida 
         }
           
    }

   
}
