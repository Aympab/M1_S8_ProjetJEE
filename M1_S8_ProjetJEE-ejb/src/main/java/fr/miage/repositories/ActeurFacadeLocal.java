package fr.miage.repositories;

import fr.miage.entities.Acteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface ActeurFacadeLocal {

    void create(Acteur acteur);

    void edit(Acteur acteur);

    void remove(Acteur acteur);

    Acteur find(Object id);

    List<Acteur> findAll();

    List<Acteur> findRange(int[] range);

    int count();
    
}
