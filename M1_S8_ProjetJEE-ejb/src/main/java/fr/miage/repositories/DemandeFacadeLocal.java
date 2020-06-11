package fr.miage.repositories;

import fr.miage.entities.Demande;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface DemandeFacadeLocal {

    void create(Demande demande);

    void edit(Demande demande);

    void remove(Demande demande);

    Demande find(Object id);

    List<Demande> findAll();

    List<Demande> findRange(int[] range);

    int count();
    
}
