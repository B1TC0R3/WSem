/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wald;

/**
 *
 * @author thoma
 */
public class Ensemble {
    private Wald[] w;
    
    public Ensemble(String[][] e, String[][] tage, int size) {
        w = new Wald[size];
        int min_EZ = 0;
        int max_EZ = 0;
        
        for(int i = 0; i < size; i++) {
            //wählt einen zufälligen Wert aus der unteren und oberen Hälfte der Menge an Entscheidungen
            min_EZ = (int)(Math.random()*(e.length/2));
            max_EZ = (int)((Math.random()*(e.length/2))+(e.length/2));
            w[i] = new Wald(e, tage, min_EZ, max_EZ);
            System.out.println("Neuen Wald erstellt mit [min_EZ = " + min_EZ + " | max_EZ = " + max_EZ + "]");
           
        }
        
    }
    
    public Ensemble(String[][] e, String[][] tage, int size, int min_EZ, int max_EZ) {
        w = new Wald[size];
        int min_EZ_n = 0;
        int max_EZ_n = 0;
        int buffer = 0;
        
        for(int i = 0; i < size; i++) {
            buffer = (int)(Math.random()*((max_EZ-min_EZ)/2));
            min_EZ_n = min_EZ+buffer;
            max_EZ_n = max_EZ-buffer;
            w[i] = new Wald(e, tage, min_EZ_n, min_EZ_n);
           
        }
        
    }
    
    public double auswerten() {
        int highscore = 0;
        double val = 0.0;
        for(int i = 0; i < w.length; i++) {
            System.out.println("Wald[" + i + "] hat positive Antworten: " + w[i].antwortScore());
            
            if(w[i].antwortScore()>highscore) {
                highscore = w[i].antwortScore();
                val = w[i].avg_EZ();
                System.out.println("->Neue optimale Entscheidungszahl: " + val);
                
            }
            
        }
        
        return val;
        
    }
    
}
