package fr.miage.services;

import fr.miage.business.GestionCandidatureLocal;
import fr.miage.business.GestionCompetenceLocal;
import fr.miage.entities.Competence;
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
public class ServiceGestionCodir implements ServiceGestionCodirLocal {

    @EJB
    GestionCompetenceLocal gestionCompetence;// = new GestionCompetence();

    @EJB
    GestionCandidatureLocal gestionCandidature;// = new GestionCandidature();

    @Override
    public Collection<Competence> listerCompetencesManquantes() {
        return gestionCompetence.listerCompetencesManquantes();
    }

    @Override
    public void validerCandidature(Long idCandidature) {
        gestionCandidature.validerCandidature(idCandidature);
    }

}
