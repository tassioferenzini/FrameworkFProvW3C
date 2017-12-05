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
@Table(name = "ProvWasEndedBy")
public class ProvWasEndedBy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column
    private Integer idWasEndedBy;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity1;
    private String id;

    public ProvWasEndedBy() {
    }

    public ProvWasEndedBy(Integer idWasEndedBy) {
        this.idWasEndedBy = idWasEndedBy;
    }

    public Integer getIdWasEndedBy() {
        return idWasEndedBy;
    }

    public void setIdWasEndedBy(Integer idWasEndedBy) {
        this.idWasEndedBy = idWasEndedBy;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
        return "ProvWasEndedBy{" + "idWasEndedBy=" + idWasEndedBy + ", time=" + time + ", activity=" + activity + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
