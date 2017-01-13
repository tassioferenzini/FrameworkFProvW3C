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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tassio
 */
@Table(name = "WasDerivedFrom")
public class WasDerivedFrom implements Serializable {

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
    private Activity activity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity generatedEntity;
    @JoinColumn
    @ManyToOne
    private PROV.DM.Entity usedEntity;

    public WasDerivedFrom() {
    }

    public WasDerivedFrom(Integer idwasDerivedFrom) {
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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Entity getGeneratedEntity() {
        return generatedEntity;
    }

    public void setGeneratedEntity(Entity generatedEntity) {
        this.generatedEntity = generatedEntity;
    }

    public Entity getUsedEntity() {
        return usedEntity;
    }

    public void setUsedEntity(Entity usedEntity) {
        this.usedEntity = usedEntity;
    }

}
