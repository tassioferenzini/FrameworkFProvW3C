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
@Table(name = "ProvHadMember")
public abstract class ProvHadMember implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idHadMember;
    @Column
    private String collection;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;

    public ProvHadMember() {
    }

    public ProvHadMember(Integer idHadMember) {
        this.idHadMember = idHadMember;
    }

    public Integer getIdHadMember() {
        return idHadMember;
    }

    public void setIdHadMember(Integer idHadMember) {
        this.idHadMember = idHadMember;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

}
