package mx.utng.s28.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String local;
    
    private String visitante;
    
    private Integer golesLocal;
    
    private Integer golesVisitante;

    public Partido() {
    }

    public Partido(Long id, String local, String visitante, Integer golesLocal, Integer golesVisitante) {
        this.id = id;
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public Integer getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(Integer golesLocal) {
        this.golesLocal = golesLocal;
    }

    public Integer getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(Integer golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((visitante == null) ? 0 : visitante.hashCode());
        result = prime * result + ((golesLocal == null) ? 0 : golesLocal.hashCode());
        result = prime * result + ((golesVisitante == null) ? 0 : golesVisitante.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partido other = (Partido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (visitante == null) {
            if (other.visitante != null)
                return false;
        } else if (!visitante.equals(other.visitante))
            return false;
        if (golesLocal == null) {
            if (other.golesLocal != null)
                return false;
        } else if (!golesLocal.equals(other.golesLocal))
            return false;
        if (golesVisitante == null) {
            if (other.golesVisitante != null)
                return false;
        } else if (!golesVisitante.equals(other.golesVisitante))
            return false;
        return true;
    }

}
