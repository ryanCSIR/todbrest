package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "WFD0026_TODB_THE_DIS_REQS")
public class TheDisReqs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_NO")
    private String requestNo;
    @Column(name = "PUBLICATION_TYPE")
    private String publicationType;
    @Column(name = "SECURITY_CLASSIFICATION")
    private String securityClassification;
    @Column(name = "ACADEMIC_INSTITUTION")
    private String academicInstitution;
    @Column(name = "DOCUMENT_TITLE")
    private String documentTitle;
    @Column(name = "MONTH")
    private String month;
    @Column(name = "YEAR")
    private String year;
    @Column(name = "KEYWORDS")
    private String keywords;
    @Column(name = "ABSTRACT")
    private String abstract1;
    @Column(name = "NOTES")
    private String notes;
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
    @Column(name = "PUBL_TYPE_OTHER")
    private String publTypeOther;

    public TheDisReqs() {
    }

    public TheDisReqs(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }

    public String getSecurityClassification() {
		return securityClassification;
	}

	public void setSecurityClassification(String securityClassification) {
		this.securityClassification = securityClassification;
	}

	public String getAcademicInstitution() {
        return academicInstitution;
    }

    public void setAcademicInstitution(String academicInstitution) {
        this.academicInstitution = academicInstitution;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getPublTypeOther() {
        return publTypeOther;
    }

    public void setPublTypeOther(String publTypeOther) {
        this.publTypeOther = publTypeOther;
    }
}
