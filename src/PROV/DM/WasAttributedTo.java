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
public class WasAttributedTo implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idWasAttributedTo;
    @JoinColumn
    @ManyToOne
    private Agent agent;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public WasAttributedTo() {
    }

    public WasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public Integer getIdWasAttributedTo() {
        return idWasAttributedTo;
    }

    public void setIdWasAttributedTo(Integer idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public PROV.DM.Entity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.Entity entity) {
        this.entity = entity;
    }
    
}
