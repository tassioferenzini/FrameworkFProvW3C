/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "WasAssociatedWithAE")
public class WasAssociatedWithAE implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAssociatedWithAE;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public WasAssociatedWithAE() {
    }

    public WasAssociatedWithAE(Integer idWasAssociatedWithAE) {
        this.idWasAssociatedWithAE = idWasAssociatedWithAE;
    }

    public Integer getIdWasAssociatedWithAE() {
        return idWasAssociatedWithAE;
    }

    public void setIdWasAssociatedWithAE(Integer idWasAssociatedWithAE) {
        this.idWasAssociatedWithAE = idWasAssociatedWithAE;
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
