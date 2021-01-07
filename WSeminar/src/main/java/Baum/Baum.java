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
public class Baum {
    private DatenObject anfang;
    
    public Baum(String[][] e) {
        anfang = new Abschluss(false);
        
        //erstellt einen Array mit allen möglichen Entscheidungen
        Entscheidung[] e_final = new Entscheidung[e.length];
        for(int i = 0; i < e.length; i++) {
            e_final[i] = new Entscheidung(e[i][0], e[i][1]);
            
        }
        
        //Fügt alle Entscheidungen in den Baum ein
        for(int i = 0; i < e_final.length; i++) {
            if(e_final.length%2 != 0) {
                anfang = anfang.hinzufuegen(e_final[i], 0, (int)Math.ceil((double)e_final.length/2));
                
            }else {
                anfang = anfang.hinzufuegen(e_final[i], 0, (e_final.length/2));
                
            }
            
        }
        
    }
    
    public Baum(String[][] e, int max_EZ) {
        anfang = new Abschluss(false);
        
        //erstellt einen Array mit allen möglichen Entscheidungen
        Entscheidung[] e_final = new Entscheidung[e.length];
        for(int i = 0; i < e.length; i++) {
            e_final[i] = new Entscheidung(e[i][0], e[i][1]);
            
        }
        
        //Fügt alle Entscheidungen in den Baum ein
        for(int i = 0; i < e_final.length; i++) {
            if(e_final.length%2 != 0) {
                anfang = anfang.hinzufuegen(e_final[i], 0, max_EZ);
                
            }else {
                anfang = anfang.hinzufuegen(e_final[i], 0, max_EZ);
                
            }
            
        }
        
    }
    
    public boolean antwortGeben(String[] s) {
        return anfang.antwortGeben(s, 0);
        
    }
    
}
