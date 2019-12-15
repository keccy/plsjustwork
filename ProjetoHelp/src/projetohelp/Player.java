
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */
public class Player {
    private String nickName;
    private Sector currentSector;
    private int attackPoints;
    private int defensePoints;
    private int expPoints;
    private Artefact[] bag;
    private int numberOfArtifacts;
    private int currentBagWeight;
    private int bagWeightMax;
    
    
    public Player(String nickName){
        if(nickName != null){
            this.nickName = nickName;
        }else{
            this.nickName = "Robin";
        }
        attackPoints = 100;
        defensePoints = 100;
        expPoints = 0;
        bag = new Artefact[50];
        bagWeightMax = 2000;
    }
    
    public String getName(){
        return nickName;
    }
    
    public int getAttackPoints(){
        return attackPoints;
}
    
    public int getDefensePoints(){
        return defensePoints;
    }
    
    public int getExpPoints(){
        return expPoints;
    }
    
    public int getNumberOfBagArtifacts(){
        return numberOfArtifacts;
    }
    
    public Sector getCurrentSector(){
        return currentSector; 
}
    
    public void printBag(){
           System.out.println("Your bag has "+bag.length+" artifacts");
        for (int i=0; i<=bag.length;i++){
            System.out.println((i+1)+" - "+bag[i].getType()+": "
                    +bag[i].getDescription()+"; "+"wt:"+bag[i].getWeight()+"\n");
        }
    }
    
    public void pickItem(){
        
        
        
    }

   
    
    
    
}
