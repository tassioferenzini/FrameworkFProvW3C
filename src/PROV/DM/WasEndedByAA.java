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
@Table(name = "WasEndedByAA")
public class WasEndedByAA implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasEndedBy;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private Activity activity1;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public WasEndedByAA() {
    }

    public WasEndedByAA(Integer idWasEndedBy) {
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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity1() {
        return activity1;
    }

    public void setActivity1(Activity activity1) {
        this.activity1 = activity1;
    }

    public PROV.DM.Entity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.Entity entity) {
        this.entity = entity;
    }

}
