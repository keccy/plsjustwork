/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */



public class Artefact {
   public enum Type {ALIEN,MONSTER,DEFENCE,ATTACK,KEY,VAULT};
    
    private String description;
    private  Type type;
    private String name;
    private int attack;
    private int defence;
    private int weight;
    private int experiencePoints;

    public Artefact(Type type){
        
        switch(type){
            case ALIEN:  new Artefact(String description, int attack, int defence, int experiencePoints,);
            case MONSTER:
            case DEFENCE:
            case ATTACK:
        }
    
    }
    
    public Artefact(String description, int attack, int defence, int experiencePoints, int weight){
        Generator generator = new Generator();
        this.description = description;
        this.attack = generator.generateApDp();
        this.defence = generator.generateApDp(); 
        this.weight = weight;
        this.experiencePoints = generator.generateExp(); 
    }
    
    public String getName(){
    return name; 
}

    public int getAttack(){
    return attack;
    }
        public int getDefence(){
    return defence;
    }
        public int getWeight(){
    return weight;
    }
    public int getExperiencePoints(){
    return experiencePoints;
    }
    public String getDescription(){
    return description;
    }
    public Type getType(){
    return type;
    }

   
    
    
}
*/