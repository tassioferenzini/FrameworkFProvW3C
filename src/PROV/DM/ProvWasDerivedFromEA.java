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
@Table(name = "ProvWasDerivedFromEA")
public abstract class ProvWasDerivedFromEA implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasDerivedFromEA;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;

    public ProvWasDerivedFromEA() {
    }

    public ProvWasDerivedFromEA(Integer idWasDerivedFromEA) {
        this.idWasDerivedFromEA = idWasDerivedFromEA;
    }

    public Integer getIdWasDerivedFromEA() {
        return idWasDerivedFromEA;
    }

    public void setIdWasDerivedFromEA(Integer idWasDerivedFromEA) {
        this.idWasDerivedFromEA = idWasDerivedFromEA;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

}
