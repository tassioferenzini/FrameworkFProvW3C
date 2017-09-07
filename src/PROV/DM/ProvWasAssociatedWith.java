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
@Table(name = "ProvWasAssociatedWith")
public class ProvWasAssociatedWith implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAssociatedWith;
    @Column
    private String plan;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private ProvAgent agent;

    public ProvWasAssociatedWith() {
    }

    public ProvWasAssociatedWith(Integer idWasAssociatedWith) {
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

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvAgent getAgent() {
        return agent;
    }

    public void setAgent(ProvAgent agent) {
        this.agent = agent;
    }

}
