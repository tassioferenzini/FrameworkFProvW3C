package PROV.DM;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tassio
 */
@Entity
@Table(name = "ProvActivity")
public abstract class ProvActivity implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idActivity;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    public ProvActivity() {
    }

    public ProvActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
