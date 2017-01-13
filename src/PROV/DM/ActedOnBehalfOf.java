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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@Entity
@Table(name = "ActedOnBehalfOf")
public class ActedOnBehalfOf implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idActedOnBehalfOf;
    @JoinColumn
    @OneToOne
    private Activity activity;
    @JoinColumn
    @OneToOne
    private Agent agent;
    @JoinColumn
    @OneToOne
    private Agent agent1;

    public ActedOnBehalfOf() {
    }

    public ActedOnBehalfOf(Integer idActedOnBehalfOf) {
        this.idActedOnBehalfOf = idActedOnBehalfOf;
    }

    public Integer getIdActedOnBehalfOf() {
        return idActedOnBehalfOf;
    }

    public void setIdActedOnBehalfOf(Integer idActedOnBehalfOf) {
        this.idActedOnBehalfOf = idActedOnBehalfOf;
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

    public Agent getAgent1() {
        return agent1;
    }

    public void setAgent1(Agent agent1) {
        this.agent1 = agent1;
    }

}
