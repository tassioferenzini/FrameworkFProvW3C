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
public class ProvEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idEntity;
    @Column
    private String nameEntity;
    private String id;

    public Integer getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(Integer idEntity) {
        this.idEntity = idEntity;
    }

    public String getNameEntity() {
        return nameEntity;
    }

    public void setNameEntity(String nameEntity) {
        this.nameEntity = nameEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvEntity{" + "idEntity=" + idEntity + ", nameEntity=" + nameEntity + '}';
    }

}
