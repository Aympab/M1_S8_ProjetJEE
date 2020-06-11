package fr.miage.repositories;

import fr.miage.entities.FicheDePoste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aympa
 */
@Local
public interface FicheDePosteFacadeLocal {

    void create(FicheDePoste ficheDePoste);

    void edit(FicheDePoste ficheDePoste);

    void remove(FicheDePoste ficheDePoste);

    FicheDePoste find(Object id);

    List<FicheDePoste> findAll();

    List<FicheDePoste> findRange(int[] range);

    int count();
    
}
