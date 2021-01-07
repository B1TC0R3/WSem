/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wald;

import Baum.Baum;

/**
 *
 * @author thoma
 */
public class Wald {
    private Baum[] b;
    private String[][] tage;
    
    private int min_EZ, max_EZ;
    
    public Wald(String[][] e, String[][] tage, int min_EZ, int max_EZ) {
        this.tage = tage;
        this.min_EZ = min_EZ;
        this.max_EZ = max_EZ;
        
        //Erzeugt den Array mit Bäumen mit verschiedenen maximalen Eingabezahlen
        b = new Baum[max_EZ-min_EZ];
        int size = max_EZ-min_EZ;
        for (int i = 0; i < size; i++) {
            b[i] = new Baum(e, i);
            
        }
        
    }
    
    public int antwortScore() {
        int as = 0;
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < tage.length; j++) {
                if(b[i].antwortGeben(tage[j])) 
                as++;
                
            }
            
        }
        
        return as;
        
    }
    
    public double avg_EZ() {
        return (min_EZ+max_EZ)/2;
        
    }
    
}
