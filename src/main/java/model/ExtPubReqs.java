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
@Table(name = "WFD0026_TODB_EXT_PUB_REQS")
public class ExtPubReqs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_NO")
    private String requestNo;
    @Column(name = "PUBLICATION_TYPE")
    private String publicationType;
    @Column(name = "EXTERNAL_AUTHOR")
    private String externalAuthor;
    @Column(name = "AFFILIATION")
    private String affiliation;
    @Column(name = "DOCUMENT_TITLE")
    private String documentTitle;
    @Column(name = "PUBLICATION_TITLE")
    private String publicationTitle;
    @Column(name = "CONFERENCE_LOCATION_DATE")
    private String conferenceLocationDate;
    @Column(name = "MONTH")
    private String month;
    @Column(name = "YEAR")
    private String year;
    @Column(name = "VOLUME_AND_NUMBER")
    private String volumeAndNumber;
    @Column(name = "PAGES")
    private String pages;
    @Column(name = "ISSN")
    private String issn;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "DOCUMENT_STATUS")
    private String documentStatus;
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
    @Column(name = "DOI_NUMBER")
    private String doiNumber;
    @Column(name = "IP_APPROVED_YN")
    private String ipApprovedYn;
    @Column(name = "IP_REQUEST_NO")
    private String ipRequestNo;
    @Column(name = "IP_TITLE")
    private String ipTitle;

    public ExtPubReqs() {
    }

    public ExtPubReqs(String requestNo) {
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

    public String getExternalAuthor() {
        return externalAuthor;
    }

    public void setExternalAuthor(String externalAuthor) {
        this.externalAuthor = externalAuthor;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getConferenceLocationDate() {
        return conferenceLocationDate;
    }

    public void setConferenceLocationDate(String conferenceLocationDate) {
        this.conferenceLocationDate = conferenceLocationDate;
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

    public String getVolumeAndNumber() {
        return volumeAndNumber;
    }

    public void setVolumeAndNumber(String volumeAndNumber) {
        this.volumeAndNumber = volumeAndNumber;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
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

    public String getDoiNumber() {
        return doiNumber;
    }

    public void setDoiNumber(String doiNumber) {
        this.doiNumber = doiNumber;
    }

    public String getIpApprovedYn() {
        return ipApprovedYn;
    }

    public void setIpApprovedYn(String ipApprovedYn) {
        this.ipApprovedYn = ipApprovedYn;
    }

    public String getIpRequestNo() {
        return ipRequestNo;
    }

    public void setIpRequestNo(String ipRequestNo) {
        this.ipRequestNo = ipRequestNo;
    }

    public String getIpTitle() {
        return ipTitle;
    }

    public void setIpTitle(String ipTitle) {
        this.ipTitle = ipTitle;
    }
}


