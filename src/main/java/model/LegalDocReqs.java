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
@Table(name = "WFD0026_TODB_LEGAL_DOC_REQS")
public class LegalDocReqs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_NO")
    private String requestNo;
    @Column(name = "PUBLICATION_TYPE")
    private String publicationType;
    @Column(name = "SECURITY_CLASSIFICATION")
    private String securityClassification;
    @Column(name = "EXTERNAL_SIGNATORY")
    private String externalSignatory;
    @Column(name = "COMPANY_OF_SIGNATORY")
    private String companyOfSignatory;
    @Column(name = "DOCUMENT_TITLE")
    private String documentTitle;
    @Column(name = "PROJECT_PROPOSAL_NO")
    private String projectProposalNo;
    @Column(name = "SIGNED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date signedDate;
    @Column(name = "DURATION")
    private String duration;
    @Column(name = "TERMINATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date terminationDate;
    @Column(name = "PROJECT_ID")
    private String projectId;
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
    @Column(name = "PROJECT_ID2")
    private String projectId2;

    public LegalDocReqs() {
    }

    public LegalDocReqs(String requestNo) {
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

	public String getExternalSignatory() {
        return externalSignatory;
    }

    public void setExternalSignatory(String externalSignatory) {
        this.externalSignatory = externalSignatory;
    }

    public String getCompanyOfSignatory() {
        return companyOfSignatory;
    }

    public void setCompanyOfSignatory(String companyOfSignatory) {
        this.companyOfSignatory = companyOfSignatory;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getProjectProposalNo() {
        return projectProposalNo;
    }

    public void setProjectProposalNo(String projectProposalNo) {
        this.projectProposalNo = projectProposalNo;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getProjectId2() {
        return projectId2;
    }

    public void setProjectId2(String projectId2) {
        this.projectId2 = projectId2;
    }
}