/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.business.GestionEmploi;
import fr.miage.entities.Demande;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author astrid
 */
@Stateless
@LocalBean
public class GestionServiceCodir {
    
    private GestionEmploi gestionEmploi ;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public ArrayList<Demande> listerDemandesACombler() {
        return gestionEmploi.listerDemandesACombler();
    }
    
}
