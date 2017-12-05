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
@Table(name = "ProvSpecializationOf")
public class ProvSpecializationOf implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idSpecializationOf;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity1;
    private String id;

    public ProvSpecializationOf() {
    }

    public ProvSpecializationOf(Integer idSpecializationOf) {
        this.idSpecializationOf = idSpecializationOf;
    }

    public Integer getIdSpecializationOf() {
        return idSpecializationOf;
    }

    public void setIdSpecializationOf(Integer idSpecializationOf) {
        this.idSpecializationOf = idSpecializationOf;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvSpecializationOf{" + "idSpecializationOf=" + idSpecializationOf + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
