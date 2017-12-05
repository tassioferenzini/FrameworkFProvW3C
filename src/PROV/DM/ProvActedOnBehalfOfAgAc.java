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
@Table(name = "ProvActedOnBehalfOfAgAc")
public class ProvActedOnBehalfOfAgAc implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idActedOnBehalfOfAgAc;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private ProvAgent agent;
    private String id;

    public ProvActedOnBehalfOfAgAc() {
    }

    public ProvActedOnBehalfOfAgAc(Integer idActedOnBehalfOfAgAc) {
        this.idActedOnBehalfOfAgAc = idActedOnBehalfOfAgAc;
    }

    public Integer getIdActedOnBehalfOfAgAc() {
        return idActedOnBehalfOfAgAc;
    }

    public void setIdActedOnBehalfOfAgAc(Integer idActedOnBehalfOfAgAc) {
        this.idActedOnBehalfOfAgAc = idActedOnBehalfOfAgAc;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvActedOnBehalfOfAgAc{" + "idActedOnBehalfOfAgAc=" + idActedOnBehalfOfAgAc + ", activity=" + activity + ", agent=" + agent + '}';
    }

}
