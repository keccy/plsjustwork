/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohelp;

/**
 *
 * @author esoj
 */
public enum PontosCardeais {
    NORTH(1), EAST(2), SOUTH(3), WEST(4);
    
    private final int idx;
    
    private PontosCardeais(int idx){
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }

    

}



