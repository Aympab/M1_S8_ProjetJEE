/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.repositories;

import fr.miage.entities.DemandeDeCompetence;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface DemandeDeCompetenceFacadeLocal {

    void create(DemandeDeCompetence demandeDeCompetence);

    void edit(DemandeDeCompetence demandeDeCompetence);

    void remove(DemandeDeCompetence demandeDeCompetence);

    DemandeDeCompetence find(Object id);

    List<DemandeDeCompetence> findAll();

    List<DemandeDeCompetence> findRange(int[] range);

    int count();
    
}
