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
public class ProvHadMember implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idHadMember;
    @Column
    private String collection;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvHadMember{" + "idHadMember=" + idHadMember + ", collection=" + collection + ", entity=" + entity + '}';
    }

}
