/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vorführung;

import Baum.Baum;
import Wald.Ensemble;

import java.util.Scanner;

/**
 *
 * @author thoma
 */
public class Main {
    private static final String[][] struktur_b = {{"Sonnig", "Regen"},    //Wetter
                                                {"Ja", "Nein"},           //Motivation
                                                {"Nein", "Ja"},           //Muskelkater
                                                {"unter 2h", "über 2h"}}; //Dauer
    
    private static final String[] daten_tag1_b = {"Sonnig", "Ja", "Nein", "unter 2h"}; 
    private static final String[] daten_tag2_b = {"Regen", "Ja", "Ja", "über 2h"};
    private static final String[] daten_tag3_b = {"Regen", "Nein", "Ja", "unter 2h"};
    private static final String[] daten_tag4_b = {"Regen", "Ja", "Ja", "über 2h"};
    
    private static final String[][] struktur_w = {{"Sonnig", "Regen"},     //Wetter
                                                  {"Ja", "Nein"},          //Motivation
                                                  {"Nein", "Ja"},          //Muskelkater
                                                  {"unter 2h", "über 2h"}, //Dauer
                                                  {"Leicht", "Schwer"},    //Schwierigkeit
                                                  {"Gesund", "Krank"},     //Gesundheit
                                                  {"Ja", "Nein"},          //Daheim
                                                  {"Ja", "Nein"}};         //Gegessen
    
    private static final String[][] daten_w = {{"Sonnig", "Ja", "Nein", "unter 2h", "Schwer", "Gesund", "Nein", "Ja"},
                                               {"Regen", "Ja", "Ja", "über 2h", "Leicht", "Gesund", "Ja", "Ja"},
                                               {"Regen", "Nein", "Ja", "unter 2h", "Leicht", "Krank", "Ja", "Nein"},
                                               {"Regen", "Ja", "Ja", "über 2h", "Schwer", "Gesund", "Ja", "Nein"},
                                               {"Sonnig", "Ja", "Nein", "über 2h", "Schwer", "Gesund", "Ja", "Ja"},
                                               {"Regen", "Ja", "Nein", "über 2h", "Schwer", "Gesund", "Ja", "Ja"},
                                               {"Sonnig", "Nein", "Nein", "unter 2h", "Leicht", "Krank", "Nein", "Nein"},
                                               {"Regen", "Nein", "Ja", "über 2h", "Leicht", "Krank", "Ja", "Ja"},
                                               {"Sonnig", "Ja", "Nein", "unter 2h", "Schwer", "Gesund", "Nein", "Nein"}};
    
    
    //Main-Methode enthaelt KEINEN wichtigen Code für das Projekt!
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        
        System.out.println("Program gestartet");
        
        while(true) {
            System.out.println("#==========================================================#");
            System.out.print("Bitte wählen sie Nummer:\n[1] Vorfuehrung Baum\n[2] Vorfuehrung Wald\n[3] Exit\nInput: ");
            input = scan.nextInt();
        
            switch(input) {
                case 1:
                    v_Baum();
                    break;
                case 2:
                    v_Wald();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("[" + input + "] ist kein gueltiger Input");
            
            }
            
        }
        
    }
    
    public static void v_Baum() {
        System.out.println("#==========================================================#");
        System.out.println("Vorfuehrung Baum");
        
        Baum baum = new Baum(struktur_b);                                          //Manuell vorhergesagte Ergebnisse:
        System.out.println("Sport an [Tag 1]: " + baum.antwortGeben(daten_tag1_b));//true
        System.out.println("Sport an [Tag 2]: " + baum.antwortGeben(daten_tag2_b));//false
        System.out.println("Sport an [Tag 3]: " + baum.antwortGeben(daten_tag3_b));//false
        System.out.println("Sport an [Tag 4]: " + baum.antwortGeben(daten_tag4_b));//false
        
    }
    
    public static void v_Wald() {
        System.out.println("#==========================================================#");
        System.out.println("Vorfuehrung Wald");
        Ensemble e = new Ensemble(struktur_w, daten_w, 10);
        System.out.println("->Optimale Entscheidungszahl für den meisten Sport: " + e.auswerten());
        
    }
    
}
