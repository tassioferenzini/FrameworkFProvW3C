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
@Table(name = "WasGeneratedBy")
public class WasGeneratedBy implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasGeneratedBy;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeWasGeneratedBy;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public WasGeneratedBy() {
    }

    public WasGeneratedBy(Integer idWasGeneratedBy) {
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
