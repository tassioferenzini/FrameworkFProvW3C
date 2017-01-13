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
@Table(name = "ActedOnBehalfOfAgAc")
public class ActedOnBehalfOfAgAc implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idActedOnBehalfOfAgAc;
    @JoinColumn
    @ManyToOne
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private Agent agent;

    public ActedOnBehalfOfAgAc() {
    }

    public ActedOnBehalfOfAgAc(Integer idActedOnBehalfOfAgAc) {
        this.idActedOnBehalfOfAgAc = idActedOnBehalfOfAgAc;
    }

    public Integer getIdActedOnBehalfOfAgAc() {
        return idActedOnBehalfOfAgAc;
    }

    public void setIdActedOnBehalfOfAgAc(Integer idActedOnBehalfOfAgAc) {
        this.idActedOnBehalfOfAgAc = idActedOnBehalfOfAgAc;
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
