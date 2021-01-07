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
public class Abschluss extends DatenObject{
    private boolean antwort;
    
    public Abschluss(boolean antwort) {
        this.antwort = antwort;
        
    }
    
    @Override
    public DatenObject hinzufuegen(Entscheidung e, int l_count, int l_max) {
        if(l_count == l_max+1) {
            this.antwort = false;
            return this;
            
        }
        
        if(l_count == -l_max) {
            this.antwort = true;
            return this;
            
        }
        
        return new Knoten(e);
        
    }
    
    @Override
    public boolean antwortGeben(String[] s, int e) {
        return antwort;
        
    }
    
}
