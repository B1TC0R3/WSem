/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baum;

/**
 *
 * @author thoma
 */
public class Knoten extends DatenObject {
    private Entscheidung e;
    
    //linker und rechter Nachbar
    private DatenObject rn, ln;
    
    public Knoten(Entscheidung e) {
        this.e = e;
        
        ln = new Abschluss(false);
        rn = new Abschluss(true);
        
        
    }
    
    @Override
    public DatenObject hinzufuegen(Entscheidung e, int l_count, int l_max) {
        ln = ln.hinzufuegen(e, l_count+1, l_max);
        rn = rn.hinzufuegen(e, l_count-1, l_max);
        return this;
        
    }
    
    @Override
    public boolean antwortGeben(String[] s, int index) {
        if(e.antwortGeben(s[index])) {
            return rn.antwortGeben(s, index+1);
            
        }else {
            return ln.antwortGeben(s, index+1);
            
        }
        
    }
    
}
