package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Ryan Dekker
 *
 */
@Entity
@Table(name = "WFD0026_TODB_CSIR_AUTHORS")
public class CSIRAuthors implements Serializable {
	private static final long serialVersionUID = 1L;
    @EmbeddedId
    private CSIRAuthorsPK csirAuthorsPK;
    @Column(name = "INSERT_USER")
    private String insertUser;
    @Column(name = "INSERT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDate;
    @Column(name = "INSERT_PGM_NAME")
    private String insertPgmName;
    @Column(name = "UPDATE_USER")
    private String updateUser;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "UPDATE_PGM_NAME")
    private String updatePgmName;

    public CSIRAuthors() {
    }

    public CSIRAuthors(CSIRAuthorsPK csirAuthorsPK) {
        this.csirAuthorsPK = csirAuthorsPK;
    }

    public CSIRAuthors(String requestNo, String empNo) {
        this.csirAuthorsPK = new CSIRAuthorsPK(requestNo, empNo);
    }

    public CSIRAuthorsPK getCsirAuthorsPK() {
        return csirAuthorsPK;
    }

    public void setCsirAuthorsPK(CSIRAuthorsPK csirAuthorsPK) {
        this.csirAuthorsPK = csirAuthorsPK;
    }

    public String getInsertUser() {
        return insertUser;
    }

    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public String getInsertPgmName() {
        return insertPgmName;
    }

    public void setInsertPgmName(String insertPgmName) {
        this.insertPgmName = insertPgmName;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdatePgmName() {
        return updatePgmName;
    }

    public void setUpdatePgmName(String updatePgmName) {
        this.updatePgmName = updatePgmName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (csirAuthorsPK != null ? csirAuthorsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CSIRAuthors)) {
            return false;
        }
        CSIRAuthors other = (CSIRAuthors) object;
        if ((this.csirAuthorsPK == null && other.csirAuthorsPK != null) || (this.csirAuthorsPK != null && !this.csirAuthorsPK.equals(other.csirAuthorsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CsirAuthors[ csirAuthorsPK=" + csirAuthorsPK + " ]";
    }
    
}
