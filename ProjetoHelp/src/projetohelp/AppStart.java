/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohelp;
import java.util.StringTokenizer;
import readfile.ReadFile;


/**
 *
 * @author esoj
 */
public class AppStart {
static Game g = new Game();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        
        rf.open("Base_Espacial.txt");
        
                     
        
       
        g.start();
        
        int id;
        String name;
        String nameEtended;
        int north;
        int east;
        int south;
        int west;
        
        String linha = rf.readOneLine();
        
        while(linha!=null){
        
             String[] campos = linha.split(",");
            
             for (String campo : campos) {
                 System.out.print(campo+" ");
            }
             System.out.println("");
             
             linha = rf.readOneLine();
        
        }
        rf.close();
        
       
       game.start();
        
        
        /*
        String linha = rf.readOneLine();
        
        System.out.println(linha);   
        
        rf.close();
        
        
       String[] campos = linha.split(",");
       
        for (String campo : campos) {
            System.out.println(campo);
        }
        
        campos[0] = campos[0].replace("\"", "");
        
        System.out.println("Sector ID:"+Integer.parseInt(campos[0]));
        
        
        StringTokenizer st = new StringTokenizer(linha,",");
        
        System.out.println("Tokens:"+st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        */
        
    }
    
}
