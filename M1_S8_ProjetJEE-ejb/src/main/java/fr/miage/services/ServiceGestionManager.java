package fr.miage.services;

import fr.miage.business.GestionCompetenceLocal;
import fr.miage.business.GestionEmploiLocal;
import fr.miage.entities.Competence;
import fr.miage.entities.Equipe;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author astrid
 */
@Stateless
@LocalBean
public class ServiceGestionManager implements ServiceGestionManagerLocal {

    
    @EJB
    GestionCompetenceLocal gestionCompetence;// = new GestionCompetence();
    
    @EJB
    GestionEmploiLocal gestionEmploi;// = new GestionEmploi();
 

    @Override
    public Collection<Competence> listerCompetencesEquipe(Long idEquipe) {
        return gestionCompetence.listerCompetencesEquipe(idEquipe);
    }

    @Override
    public void createCompetence(String nomCompetence) {
        gestionCompetence.creerCompetence(nomCompetence);
    }

    @Override
    public void creerDemande(Equipe equipe, ArrayList<Competence> competencesDemandees) {
        gestionEmploi.creerDemande(equipe, competencesDemandees);
    }
}
