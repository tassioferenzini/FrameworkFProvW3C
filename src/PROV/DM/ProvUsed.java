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
@Table(name = "ProvUsed")
public class ProvUsed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column
    private Integer idUsed;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUsed;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;
    private String id;

    public ProvUsed() {
    }

    public ProvUsed(Integer idUsed) {
        this.idUsed = idUsed;
    }

    public Integer getIdUsed() {
        return idUsed;
    }

    public void setIdUsed(Integer idUsed) {
        this.idUsed = idUsed;
    }

    public Date getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Date timeUsed) {
        this.timeUsed = timeUsed;
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
        return "ProvUsed{" + "idUsed=" + idUsed + ", timeUsed=" + timeUsed + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
