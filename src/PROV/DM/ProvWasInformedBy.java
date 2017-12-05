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
@Table(name = "ProvWasInformedBy")
public class ProvWasInformedBy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column
    private Integer idWasInformedBy;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity1;
    private String id;

    public ProvWasInformedBy() {
    }

    public ProvWasInformedBy(Integer idWasInformedBy) {
        this.idWasInformedBy = idWasInformedBy;
    }

    public Integer getIdWasInformedBy() {
        return idWasInformedBy;
    }

    public void setIdWasInformedBy(Integer idWasInformedBy) {
        this.idWasInformedBy = idWasInformedBy;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvActivity getActivity1() {
        return activity1;
    }

    public void setActivity1(ProvActivity activity1) {
        this.activity1 = activity1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvWasInformedBy{" + "idWasInformedBy=" + idWasInformedBy + ", activity=" + activity + ", activity1=" + activity1 + '}';
    }

}
