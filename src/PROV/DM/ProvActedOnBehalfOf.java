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
@Table(name = "ProvActedOnBehalfOf")
public class ProvActedOnBehalfOf implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idActedOnBehalfOf;
    @JoinColumn
    @OneToOne
    private ProvActivity activity;
    @JoinColumn
    @OneToOne
    private ProvAgent agent;
    @JoinColumn
    @OneToOne
    private ProvAgent agent1;
    private String id;

    public ProvActedOnBehalfOf() {
    }

    public ProvActedOnBehalfOf(Integer idActedOnBehalfOf) {
        this.idActedOnBehalfOf = idActedOnBehalfOf;
    }

    public Integer getIdActedOnBehalfOf() {
        return idActedOnBehalfOf;
    }

    public void setIdActedOnBehalfOf(Integer idActedOnBehalfOf) {
        this.idActedOnBehalfOf = idActedOnBehalfOf;
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

    public ProvAgent getAgent1() {
        return agent1;
    }

    public void setAgent1(ProvAgent agent1) {
        this.agent1 = agent1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvActedOnBehalfOf{" + "idActedOnBehalfOf=" + idActedOnBehalfOf + ", activity=" + activity + ", agent=" + agent + ", agent1=" + agent1 + '}';
    }

}
