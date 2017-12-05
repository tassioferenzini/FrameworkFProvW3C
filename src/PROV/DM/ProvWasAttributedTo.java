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
@Table(name = "ProvWasAttributedTo")
public class ProvWasAttributedTo implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAttributedTo;
    @JoinColumn
    @ManyToOne
    private ProvAgent agent;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    private String id;

    public ProvWasAttributedTo() {
    }

    public ProvWasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public Integer getIdWasAttributedTo() {
        return idWasAttributedTo;
    }

    public void setIdWasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public ProvAgent getAgent() {
        return agent;
    }

    public void setAgent(ProvAgent agent) {
        this.agent = agent;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvWasAttributedTo{" + "idWasAttributedTo=" + idWasAttributedTo + ", agent=" + agent + ", entity=" + entity + '}';
    }

}
