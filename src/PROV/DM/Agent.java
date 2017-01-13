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
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@Entity
@Table(name = "Agent")
public class Agent implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idAgent;
    @Column
    private String typeAgent;

    public Agent() {
    }

    public Agent(Integer idAgent) {
        this.idAgent = idAgent;
    }

    public Integer getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(Integer idAgent) {
        this.idAgent = idAgent;
    }

    public String getTypeAgent() {
        return typeAgent;
    }

    public void setTypeAgent(String typeAgent) {
        this.typeAgent = typeAgent;
    }

}
