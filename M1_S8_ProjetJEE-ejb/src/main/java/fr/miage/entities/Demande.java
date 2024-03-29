package fr.miage.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author aympa
 */
@Entity
public class Demande implements Serializable {

    public Demande() {
    }
   

    //Attributs
    @ManyToMany
    private List<Competence> competencesDemandees;

    @OneToOne
    private Equipe equipeDemandeuse;

    @OneToOne
    private FicheDePoste fichePosteDemandeuse;

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

    public List<Competence> getCompetencesDemandees() {
        return competencesDemandees;
    }

    public void setCompetencesDemandees(List<Competence> competencesDemandees) {
        this.competencesDemandees = competencesDemandees;
    }

    public Equipe getEquipeDemandeuse() {
        return equipeDemandeuse;
    }

    public void setEquipeDemandeuse(Equipe equipeDemandeuse) {
        this.equipeDemandeuse = equipeDemandeuse;
    }

    public FicheDePoste getFichePosteDemandeuse() {
        return fichePosteDemandeuse;
    }

    public void setFichePosteDemandeuse(FicheDePoste fichePosteDemandeuse) {
        this.fichePosteDemandeuse = fichePosteDemandeuse;
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
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.miage.entities.Demande[ id=" + id + " ]";
    }

}
