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
public abstract class DatenObject {
    public abstract DatenObject hinzufuegen(Entscheidung e, int l_count, int l_max);
    public abstract boolean antwortGeben(String[] s, int index);
    
}
