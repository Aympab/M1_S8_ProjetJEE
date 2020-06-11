/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import fr.miage.entities.Competence;
import java.util.Collection;

/**
 *
 * @author aympa
 */
public interface ServiceGestionCodirLocal {

    public Collection<Competence> listerCompetencesManquantes();

    public void validerCandidature(Long idCandidature);
}
