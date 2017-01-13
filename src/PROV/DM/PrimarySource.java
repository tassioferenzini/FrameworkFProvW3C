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
@Table(name = "PrimarySource")
public class PrimarySource implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idPrimarySource;
    @Column
    private String type;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity1;

    public PrimarySource() {
    }

    public PrimarySource(Integer idPrimarySource) {
        this.idPrimarySource = idPrimarySource;
    }

    public Integer getIdPrimarySource() {
        return idPrimarySource;
    }

    public void setIdPrimarySource(Integer idPrimarySource) {
        this.idPrimarySource = idPrimarySource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PROV.DM.Entity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.Entity entity) {
        this.entity = entity;
    }

    public PROV.DM.Entity getEntity1() {
        return entity1;
    }

    public void setEntity1(PROV.DM.Entity entity1) {
        this.entity1 = entity1;
    }
    
}
