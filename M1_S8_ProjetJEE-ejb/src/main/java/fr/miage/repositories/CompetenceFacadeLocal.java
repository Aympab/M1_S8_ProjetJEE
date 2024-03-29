package fr.miage.repositories;

import fr.miage.entities.Competence;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface CompetenceFacadeLocal {

    void create(Competence competence);

    void edit(Competence competence);

    void remove(Competence competence);

    Competence find(Object id);

    List<Competence> findAll();

    List<Competence> findRange(int[] range);

    int count();
    
}
