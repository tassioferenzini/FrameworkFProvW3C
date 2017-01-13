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
@Table(name = "HadMember")
public class HadMember implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idHadMember;
    @Column
    private String collection;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity entity;

    public HadMember() {
    }

    public HadMember(Integer idHadMember) {
        this.idHadMember = idHadMember;
    }

    public Integer getIdHadMember() {
        return idHadMember;
    }

    public void setIdHadMember(Integer idHadMember) {
        this.idHadMember = idHadMember;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public PROV.DM.Entity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.Entity entity) {
        this.entity = entity;
    }

}
