package fr.miage.business;

import fr.miage.entities.Acteur;
import fr.miage.entities.Competence;
import fr.miage.entities.Demande;
import fr.miage.entities.Equipe;
import fr.miage.repositories.ActeurFacadeLocal;
import fr.miage.repositories.CompetenceFacadeLocal;
import fr.miage.repositories.DemandeFacadeLocal;
import fr.miage.repositories.EquipeFacadeLocal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class GestionCompetence implements GestionCompetenceLocal {

    @EJB
    private ActeurFacadeLocal acteurFacade;

    @EJB
    private CompetenceFacadeLocal competenceFacade;

    @EJB
    private EquipeFacadeLocal equipeFacade;
    
    @EJB
    private DemandeFacadeLocal demandeFacade;

    @Override
    public void creerCompetence(String nomCompetence) {
        Competence comp = new Competence();
        comp.setNomCompetence(nomCompetence);
        
        competenceFacade.create(comp);
    }

    @Override
    public void supprimerCompetence(Long idCompetence) {
    }

    @Override
    public void modifierCompetence(Long idCompetence, String nouveauNomCompetence) {
    }

    @Override
    public Collection<Competence> listerCompetences() {
        return competenceFacade.findAll();
    }

    @Override
    public Collection<Competence> listerCompetencesEquipe(Long idEquipe) {
        //On récupère l'équipe
        Equipe equip = equipeFacade.find(idEquipe);
        
        return equip.listerCompetences();
    }

    @Override
    public Collection<Competence> listerCompetencesActeur(Long idActeur) {
        return acteurFacade.find(idActeur).getListeCompetences();
    }

    @Override
    public Collection<Competence> listerCompetencesManquantes() {
        //Les compétences manquantes sont celles pour lesquelles il existe une demande de competence
        Collection<Demande> listeDemande = demandeFacade.findAll();
        Collection<Competence> compManquantes = new HashSet<>();
        
        for(Demande d : listeDemande){
            compManquantes.addAll(d.getCompetencesDemandees());
        }
        
        return compManquantes;
    }

    @Override
    public void creerEquipe(String nomEquipe) {
        Equipe equipe = new Equipe();
        equipe.setNomEquipe(nomEquipe);

        this.equipeFacade.create(equipe);
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
    }

    @Override
    public Collection<Acteur> listerCollaborateurs() {
        Collection<Acteur> acteurs = this.acteurFacade.findAll();
        
        Collection<Acteur> collab = new ArrayList<>();
        
        for(Acteur a : acteurs){
            if(a.getRoleActeur() == Acteur.RoleActeur.Collaborateur){
                collab.add(a);
            }
        }
        
        return collab;
    }
}
