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
@Table(name = "WasAssociatedWith")
public class WasAssociatedWith implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAssociatedWith;
    @Column
    private String plan;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private Agent agent;

    public WasAssociatedWith() {
    }

    public WasAssociatedWith(Integer idWasAssociatedWith) {
        this.idWasAssociatedWith = idWasAssociatedWith;
    }

    public Integer getIdWasAssociatedWith() {
        return idWasAssociatedWith;
    }

    public void setIdWasAssociatedWith(Integer idWasAssociatedWith) {
        this.idWasAssociatedWith = idWasAssociatedWith;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
