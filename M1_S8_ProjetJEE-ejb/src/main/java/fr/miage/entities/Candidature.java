package fr.miage.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author aympa
 */
@Entity
public class Candidature implements Serializable {

    public Candidature() {
    }

    //Attributs
    public enum StatutCandidature{
        Validee,
        Refusee,
        Active
    }
    
    private StatutCandidature statutCandidature;
    
    @OneToOne
    private Acteur candidat;
    
    @OneToOne
    private FicheDePoste poste;
    
    //LIENS BD
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatutCandidature getStatutCandidature() {
        return statutCandidature;
    }

    public void setStatutCandidature(StatutCandidature statutCandidature) {
        this.statutCandidature = statutCandidature;
    }

    public Acteur getCandidat() {
        return candidat;
    }

    public void setCandidat(Acteur candidat) {
        this.candidat = candidat;
    }

    public FicheDePoste getPoste() {
        return poste;
    }

    public void setPoste(FicheDePoste poste) {
        this.poste = poste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidature)) {
            return false;
        }
        Candidature other = (Candidature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Candidature[ id=" + id + " ]";
    }
    
}
