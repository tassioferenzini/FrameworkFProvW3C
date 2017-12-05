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
@Table(name = "ProvAgent")
public class ProvAgent implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer idAgent;
    @Column
    private String typeAgent;
    @Column
    private String nameAgent;
    private String id;

    public ProvAgent() {
    }

    public ProvAgent(Integer idAgent) {
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

    public String getNameAgent() {
        return nameAgent;
    }

    public void setNameAgent(String nameAgent) {
        this.nameAgent = nameAgent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProvAgent{" + "idAgent=" + idAgent + ", typeAgent=" + typeAgent + ", nameAgent=" + nameAgent + '}';
    }

}
