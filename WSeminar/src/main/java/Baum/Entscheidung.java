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
public class Entscheidung {
    //positive Antwort
    private String r;
    
    //negative Antwort
    private String f;
    
    public Entscheidung(String r, String f) {
        this.r = r;
        this.f = f;
        
    }
    
    public boolean antwortGeben(String s) {
        if(s.equals(r)) 
            return true;
        return false;
        
    }
    
}
