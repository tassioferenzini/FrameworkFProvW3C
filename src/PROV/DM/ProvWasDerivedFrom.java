package PROV.DM;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@Table(name = "ProvWasDerivedFrom")
public class ProvWasDerivedFrom implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idwasDerivedFrom;
    @Column
    private String generation;
    @Column
    private String usage;
    @JoinColumn
    @ManyToOne
    private ProvActivity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity generatedEntity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.ProvEntity usedEntity;

    public ProvWasDerivedFrom() {
    }

    public ProvWasDerivedFrom(Integer idwasDerivedFrom) {
        this.idwasDerivedFrom = idwasDerivedFrom;
    }

    public Integer getIdwasDerivedFrom() {
        return idwasDerivedFrom;
    }

    public void setIdwasDerivedFrom(Integer idwasDerivedFrom) {
        this.idwasDerivedFrom = idwasDerivedFrom;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvEntity getGeneratedEntity() {
        return generatedEntity;
    }

    public void setGeneratedEntity(ProvEntity generatedEntity) {
        this.generatedEntity = generatedEntity;
    }

    public ProvEntity getUsedEntity() {
        return usedEntity;
    }

    public void setUsedEntity(ProvEntity usedEntity) {
        this.usedEntity = usedEntity;
    }

}
