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
@Table(name = "WasAttributedTo")
public class ProvWasAttributedTo implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAttributedTo;
    @JoinColumn
    @ManyToOne
    private ProvAgent agent;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity entity;

    public ProvWasAttributedTo() {
    }

    public ProvWasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public Integer getIdWasAttributedTo() {
        return idWasAttributedTo;
    }

    public void setIdWasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public ProvAgent getAgent() {
        return agent;
    }

    public void setAgent(ProvAgent agent) {
        this.agent = agent;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }
    
}