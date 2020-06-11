package fr.miage.services;

import fr.miage.servicesRemote.ServiceRHRemote;
import fr.miage.business.GestionEmploiLocal;
import fr.miage.business.GestionCompetenceLocal;
import fr.miage.entities.Acteur;
import fr.miage.entities.Competence;
import fr.miage.millan.sharedjee.ActeurExport;
import fr.miage.millan.sharedjee.ActeurExport.RoleActeur;
import fr.miage.millan.sharedjee.FicheDePosteExport;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class ServiceRH implements ServiceRHRemote {

    @EJB
    private GestionEmploiLocal gestionEmploi;
    
    @EJB
    private GestionCompetenceLocal gestionCompetence;

    @Override
    public void proposerFicheDePoste(FicheDePosteExport fiche) {
        gestionEmploi.creerFicheDePoste(fiche.getNomPoste(), fiche.getPresentationEntreprise(), fiche.getPresentationPoste());

    }

    @Override
    public Collection<ActeurExport> getCollaborateurs() {
        Collection<Acteur> collabs = gestionCompetence.listerCollaborateurs();
        
        Collection<ActeurExport> collabExport = new ArrayList<>();
        ActeurExport acteur;
        
        for(Acteur a : collabs){
            acteur = new ActeurExport();
            acteur.setNomActeur(a.getNomActeur());
            acteur.setPrenomActeur(a.getPrenomActeur());
            acteur.setRoleActeur(RoleActeur.Collaborateur);
            acteur.setCompetencesToStr(parseCompToCompToStr(a.getListeCompetences()));
            
            
            collabExport.add(acteur);
        }
        
        return collabExport;
    }
    
    
    private String parseCompToCompToStr(Collection<Competence> comps){
        String ret = "";
        for(Competence c : comps){
            ret += c.getNomCompetence() + "\n";
        }
        
        return ret;
    }
}
