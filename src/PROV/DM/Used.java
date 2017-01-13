/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "Used")
public class Used implements Serializable {

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
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public Used() {
    }

    public Used(Integer idUsed) {
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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public PROV.DM.Entity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.Entity entity) {
        this.entity = entity;
    }

}
