package fr.miage.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author aympa
 */
@Entity
public class Equipe implements Serializable {

    public Equipe() {
    }

    //Attributs
    private String nomEquipe;
    
    @OneToMany
    List<Acteur> membres;
    
    
    //LIENS BD
    @OneToOne
    private Demande demandeEquipe;
    
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

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public List<Acteur> getMembres() {
        return membres;
    }

    public void setMembres(List<Acteur> membres) {
        this.membres = membres;
    }

    public Demande getDemandeEquipe() {
        return demandeEquipe;
    }

    public void setDemandeEquipe(Demande demandeEquipe) {
        this.demandeEquipe = demandeEquipe;
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
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Equipe[ id=" + id + " ]";
    }
    
    public Collection<Competence> listerCompetences(){
        Collection<Competence> comps = new HashSet<>();
        
        for(Acteur a : this.membres){
            comps.addAll(a.getListeCompetences());
        }
        
        return comps;
    }
    
}
