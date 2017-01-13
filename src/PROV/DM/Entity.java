/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROV.DM;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@javax.persistence.Entity
@Table(name = "Entity")
public class Entity implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idEntity;

    public Integer getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(Integer idEntity) {
        this.idEntity = idEntity;
    }
    
}
