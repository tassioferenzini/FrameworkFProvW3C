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
@Table(name = "ProvEntity")
public abstract class ProvEntity implements Serializable {

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
