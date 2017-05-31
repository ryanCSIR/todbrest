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
 *
 * @author RDekker
 */
@Entity
@Table(name = "WFD0026_TODB_EXTERNAL_AUTHORS")
public class ExternalAuthor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExternalAuthorPK externalAuthorPK;
    @Column(name = "AUTHOR_AFFILIATION")
    private String authorAffiliation;
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

    public ExternalAuthor() {
    }

    public ExternalAuthor(ExternalAuthorPK externalAuthorPK) {
        this.externalAuthorPK = externalAuthorPK;
    }

    public ExternalAuthor(String requestNo, String authorName) {
        this.externalAuthorPK = new ExternalAuthorPK(requestNo, authorName);
    }

    public ExternalAuthorPK getExternalAuthorPK() {
        return externalAuthorPK;
    }

    public void setExternalAuthorPK(ExternalAuthorPK externalAuthorPK) {
        this.externalAuthorPK = externalAuthorPK;
    }

    public String getAuthorAffiliation() {
        return authorAffiliation;
    }

    public void setAuthorAffiliation(String authorAffiliation) {
        this.authorAffiliation = authorAffiliation;
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
}
