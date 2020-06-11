package fr.miage.repositories;

import fr.miage.entities.Candidature;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface CandidatureFacadeLocal {

    void create(Candidature candidature);

    void edit(Candidature candidature);

    void remove(Candidature candidature);

    Candidature find(Object id);

    List<Candidature> findAll();

    List<Candidature> findRange(int[] range);

    int count();
    
}
