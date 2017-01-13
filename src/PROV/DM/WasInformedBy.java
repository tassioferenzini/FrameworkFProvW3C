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
@Table(name = "WasInformedBy")
public class WasInformedBy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column
    private Integer idWasInformedBy;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private Activity activity1;

    public WasInformedBy() {
    }

    public WasInformedBy(Integer idWasInformedBy) {
        this.idWasInformedBy = idWasInformedBy;
    }

    public Integer getIdWasInformedBy() {
        return idWasInformedBy;
    }

    public void setIdWasInformedBy(Integer idWasInformedBy) {
        this.idWasInformedBy = idWasInformedBy;
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
    
}
