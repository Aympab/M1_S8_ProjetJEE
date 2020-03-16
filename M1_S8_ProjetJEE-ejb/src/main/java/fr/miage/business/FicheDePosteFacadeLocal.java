/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.business;

import fr.miage.entities.FicheDePoste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface FicheDePosteFacadeLocal {

    void create(FicheDePoste ficheDePoste);

    void edit(FicheDePoste ficheDePoste);

    void remove(FicheDePoste ficheDePoste);

    FicheDePoste find(Object id);

    List<FicheDePoste> findAll();

    List<FicheDePoste> findRange(int[] range);

    int count();
    
}
