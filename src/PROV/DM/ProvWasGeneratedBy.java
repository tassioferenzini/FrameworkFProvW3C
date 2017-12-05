package PROV.DM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tassio
 */
@Entity
@Table(name = "ProvWasGeneratedBy")
public class ProvWasGeneratedBy implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasGeneratedBy;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeWasGeneratedBy;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    private String id;

    public ProvWasGeneratedBy() {
    }

    public ProvWasGeneratedBy(Integer idWasGeneratedBy) {
        this.idWasGeneratedBy = idWasGeneratedBy;
    }

    public Integer getIdWasGeneratedBy() {
        return idWasGeneratedBy;
    }

    public void setIdWasGeneratedBy(Integer idWasGeneratedBy) {
        this.idWasGeneratedBy = idWasGeneratedBy;
    }

    public Date getTimeWasGeneratedBy() {
        return timeWasGeneratedBy;
    }

    public void setTimeWasGeneratedBy(Date timeWasGeneratedBy) {
        this.timeWasGeneratedBy = timeWasGeneratedBy;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvWasGeneratedBy{" + "idWasGeneratedBy=" + idWasGeneratedBy + ", timeWasGeneratedBy=" + timeWasGeneratedBy + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
