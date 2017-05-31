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
@Table(name = "WFD0026_TODB_PUBL_NO_BREAKDOWN")
public class PublNoBreakdown implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_NO")
    private String requestNo;
    @Column(name = "SETID")
    private String setid;
    @Column(name = "BU")
    private String bu;
    @Column(name = "COMPETENCE_AREA")
    private String competenceArea;
    @Column(name = "REPORT_TYPE")
    private String reportType;
    @Column(name = "YEAR")
    private String year;
    @Column(name = "UNIQUE_NUMBER")
    private String uniqueNumber;
    @Column(name = "SECURITY_CATEGORY")
    private String securityCategory;
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
    @Column(name = "SAFETY_DOC_VERSION_NO")
    private String safetyDocVersionNo;
    @Column(name = "BU_ID")
    private String buId;

    public PublNoBreakdown() {
    }

    public PublNoBreakdown(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getSetid() {
        return setid;
    }

    public void setSetid(String setid) {
        this.setid = setid;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public String getCompetenceArea() {
        return competenceArea;
    }

    public void setCompetenceArea(String competenceArea) {
        this.competenceArea = competenceArea;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
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

    public String getSafetyDocVersionNo() {
        return safetyDocVersionNo;
    }

    public void setSafetyDocVersionNo(String safetyDocVersionNo) {
        this.safetyDocVersionNo = safetyDocVersionNo;
    }

    public String getBuId() {
        return buId;
    }

    public void setBuId(String buId) {
        this.buId = buId;
    }
}