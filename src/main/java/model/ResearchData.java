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
@Table(name = "WFD0026_TODB_RESEARCH_DATA")
public class ResearchData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "REQUEST_NO")
	private String requestNo;
	@Column(name = "RESEARCH_DATA_LOCATION")
	private String researchDataLocation;
	@Column(name = "RESEARCH_DATA_URL")
	private String researchDataUrl;
	@Column(name = "SECURITY_CLASSIFICATION")
	private String securityClassification;
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
	@Column(name = "RETENTION_CODE")
	private String retentionCode;
	@Column(name = "RESPONSIBILITY_CODE")
	private String responsibilityCode;

	public ResearchData() {
	}

	public ResearchData(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getResearchDataLocation() {
		return researchDataLocation;
	}

	public void setResearchDataLocation(String researchDataLocation) {
		this.researchDataLocation = researchDataLocation;
	}

	public String getResearchDataUrl() {
		return researchDataUrl;
	}

	public void setResearchDataUrl(String researchDataUrl) {
		this.researchDataUrl = researchDataUrl;
	}

	public String getSecurityClassification() {
		return securityClassification;
	}

	public void setSecurityClassification(String securityClassification) {
		this.securityClassification = securityClassification;
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

	public String getRetentionCode() {
		return retentionCode;
	}

	public void setRetentionCode(String retentionCode) {
		this.retentionCode = retentionCode;
	}

	public String getResponsibilityCode() {
		return responsibilityCode;
	}

	public void setResponsibilityCode(String responsibilityCode) {
		this.responsibilityCode = responsibilityCode;
	}
}
