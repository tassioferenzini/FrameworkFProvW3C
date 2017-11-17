package PROV.DM;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@Entity
@Table(name = "ProvAlternateOf")
public abstract class ProvAlternateOf implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idAlterneteOf;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity1;

    public ProvAlternateOf() {
    }

    public ProvAlternateOf(Integer idAlterneteOf) {
        this.idAlterneteOf = idAlterneteOf;
    }

    public Integer getIdAlterneteOf() {
        return idAlterneteOf;
    }

    public void setIdAlterneteOf(Integer idAlterneteOf) {
        this.idAlterneteOf = idAlterneteOf;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    public PROV.DM.ProvEntity getEntity1() {
        return entity1;
    }

    public void setEntity1(PROV.DM.ProvEntity entity1) {
        this.entity1 = entity1;
    }

}
