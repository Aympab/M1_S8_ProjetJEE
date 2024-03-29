package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Candidature;
import fr.miage.entities.Candidature.StatutCandidature;
import fr.miage.entities.Competence;
import fr.miage.entities.FicheDePoste;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;

/**
 *Permet de gérer les candidatures 
 * @author aympa
 */
@Local
public interface GestionCandidatureLocal {
    
    public void creerCandidat(String nom, String prenom, List<Competence> listComp);
    
    public void creerCandidature(StatutCandidature statut, Acteur candidat, FicheDePoste poste);
    public void modifierCandidature(Long idCandidature, StatutCandidature statut, ArrayList<Acteur> candidats, FicheDePoste poste);
    public void supprimerCandidature(Long idCandidature);
    
    public ArrayList<Candidature> listerCandidatures();
    
    /**
     * Change le statut de la candidature à Validée
     * @param idCandidature 
     */
    public void validerCandidature(Long idCandidature);
    
    public Acteur getCandidatById(Long idCandidat);
    
}
