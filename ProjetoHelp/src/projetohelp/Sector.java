/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jguil
 */
public class Sector {
   private int identificador;
    private String shortDescription;
    private String longDescription;
    private  int[] exits;
    private Artefacto[] chest;

    /**
     * Constructor for objects of class Sector
     */
    public Sector(int identificador,String shortDescription, String longDescription,int[] exits ){
        this.identificador = identificador;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.exits = exits; 
        chest = new Artefacto[5];
    }
    
    public int getIdentificador(){
    return identificador;
    }
    public String getShortDescription(){
    return shortDescription;
    }
    public String getLongDescription(){
    return longDescription;
    }
   /* public String getExits(){ 
    return ;}*/
    
    public int getChestlength(){
    return chest.length;
    }


     public void printChestContents(){
         System.out.println("You are in :" + getShortDescription());
        System.out.println("");
        System.out.println("There is a chest with" + getChestlength() + " artifacts");

    for (int i=0; i <= chest.length;i++){
        System.out.println((i+1) + " - "+chest[i].getName() + ": "
               + chest[i].getDescription()+"; " + "wt:" + chest[i].getWeight() + "\n");
    }
    }
        
    }
    