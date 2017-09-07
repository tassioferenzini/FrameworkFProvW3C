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
@Table(name = "ProvWasStartedByAA")
public class ProvWasStartedByAA implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasStartedBy;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity1;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;

    public ProvWasStartedByAA() {
    }

    public ProvWasStartedByAA(Integer idWasStartedBy) {
        this.idWasStartedBy = idWasStartedBy;
    }

    public Integer getIdWasStartedBy() {
        return idWasStartedBy;
    }

    public void setIdWasStartedBy(Integer idWasStartedBy) {
        this.idWasStartedBy = idWasStartedBy;
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

    public ProvActivity getActivity1() {
        return activity1;
    }

    public void setActivity1(ProvActivity activity1) {
        this.activity1 = activity1;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

}
