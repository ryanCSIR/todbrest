package model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the WFD0026_TODB_SAVED_REQUESTS database table.
 * 
 */
@Entity
@Table(name="WFD0026_TODB_SAVED_REQUESTS")
public class SavedRequests implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="ABSTRACT")
	private String abstract_;

	@Column(name="ACADEMIC_INSTITUTION")
	private String academicInstitution;

	private String affiliation;

	@Column(name="CLIENT_NAME")
	private String clientName;

	@Column(name="COMPANY_OF_SIGNATORY")
	private String companyOfSignatory;

	@Column(name="COMPETENCE_AREA")
	private String competenceArea;

	@Column(name="CONFERENCE_LOCATION_DATE")
	private String conferenceLocationDate;

	@Column(name="CSIR_TODB_VIEW_RIGHTS_YN")
	private String csirTodbViewRightsYn;

	@Column(name="DOCUMENT_STATUS")
	private String documentStatus;

	@Column(name="DOCUMENT_TITLE")
	private String documentTitle;

	@Column(name="DOCUMENT_TYPE_CODE")
	private String documentTypeCode;

	@Column(name="DOI_NUMBER")
	private String doiNumber;

	private String duration;

	@Column(name="EMP_NO")
	private String empNo;

	@Column(name="EXTERNAL_AUTHOR")
	private String externalAuthor;

	@Column(name="EXTERNAL_SIGNATORY")
	private String externalSignatory;

	@Column(name="FUNDING_CODE")
	private String fundingCode;

	@Column(name="GW_DOC_NO")
	private String gwDocNo;

	@Column(name="GW_LIBRARY")
	private String gwLibrary;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE")
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME")
	private String insertPgmName;

	@Column(name="INSERT_USER")
	private String insertUser;

	private String isbn;

	private String issn;

	private String keywords;

	@Column(name="\"MONTH\"")
	private String month;

	private String notes;

	@Column(name="\"PAGES\"")
	private String pages;

	@Column(name="PEER_GW_DOC_NO")
	private String peerGwDocNo;

	@Column(name="PEER_GW_LIBRARY")
	private String peerGwLibrary;

	@Column(name="PROJECT_ID")
	private String projectId;

	@Column(name="PROJECT_ID2")
	private String projectId2;

	@Column(name="PROJECT_PROPOSAL_NO")
	private String projectProposalNo;

	@Column(name="PROXY_EMP_NO")
	private String proxyEmpNo;

	@Column(name="PUBL_TYPE_OTHER")
	private String publTypeOther;

	@Column(name="PUBLICATION_TITLE")
	private String publicationTitle;

	@Column(name="PUBLICATION_TYPE")
	private String publicationType;

	@Column(name="RESEARCH_DATA_LOCATION")
	private String researchDataLocation;

	@Column(name="RESEARCH_DATA_SEC_CLASS")
	private String researchDataSecClass;

	@Column(name="RESEARCH_DATA_URL")
	private String researchDataUrl;

	@Column(name="RESEARCH_DATA_YN")
	private String researchDataYn;

	@Column(name="RESPONSIBILITY_CODE")
	private String responsibilityCode;

	@Column(name="RETENTION_CODE")
	private String retentionCode;

	@Column(name="RIA_CODE")
	private String riaCode;

	@Column(name="SAFETY_DOC_NEW_VERSION_YN")
	private String safetyDocNewVersionYn;

	@Column(name="SAFETY_DOC_PUBL_NO")
	private String safetyDocPublNo;

	@Column(name="SAVED_REQUEST_NO")
	private String savedRequestNo;

	@Column(name="SECURITY_CLASSIFICATION")
	private String securityClassification;

	@Temporal(TemporalType.DATE)
	@Column(name="SIGNED_DATE")
	private Date signedDate;

	@Column(name="SIMS_PROPOSAL_NO")
	private String simsProposalNo;

	@Column(name="STATUS_IND")
	private String statusInd;

	@Temporal(TemporalType.DATE)
	@Column(name="TERMINATION_DATE")
	private Date terminationDate;

	@Column(name="TODB_INDEXING_YN")
	private String todbIndexingYn;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME")
	private String updatePgmName;

	@Column(name="UPDATE_USER")
	private String updateUser;

	@Column(name="VOLUME_AND_NUMBER")
	private String volumeAndNumber;

	@Column(name="\"YEAR\"")
	private String year;

	public SavedRequests() {
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getAcademicInstitution() {
		return this.academicInstitution;
	}

	public void setAcademicInstitution(String academicInstitution) {
		this.academicInstitution = academicInstitution;
	}

	public String getAffiliation() {
		return this.affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCompanyOfSignatory() {
		return this.companyOfSignatory;
	}

	public void setCompanyOfSignatory(String companyOfSignatory) {
		this.companyOfSignatory = companyOfSignatory;
	}

	public String getCompetenceArea() {
		return this.competenceArea;
	}

	public void setCompetenceArea(String competenceArea) {
		this.competenceArea = competenceArea;
	}

	public String getConferenceLocationDate() {
		return this.conferenceLocationDate;
	}

	public void setConferenceLocationDate(String conferenceLocationDate) {
		this.conferenceLocationDate = conferenceLocationDate;
	}

	public String getCsirTodbViewRightsYn() {
		return this.csirTodbViewRightsYn;
	}

	public void setCsirTodbViewRightsYn(String csirTodbViewRightsYn) {
		this.csirTodbViewRightsYn = csirTodbViewRightsYn;
	}

	public String getDocumentStatus() {
		return this.documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

	public String getDocumentTitle() {
		return this.documentTitle;
	}

	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}

	public String getDocumentTypeCode() {
		return this.documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDoiNumber() {
		return this.doiNumber;
	}

	public void setDoiNumber(String doiNumber) {
		this.doiNumber = doiNumber;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getExternalAuthor() {
		return this.externalAuthor;
	}

	public void setExternalAuthor(String externalAuthor) {
		this.externalAuthor = externalAuthor;
	}

	public String getExternalSignatory() {
		return this.externalSignatory;
	}

	public void setExternalSignatory(String externalSignatory) {
		this.externalSignatory = externalSignatory;
	}

	public String getFundingCode() {
		return this.fundingCode;
	}

	public void setFundingCode(String fundingCode) {
		this.fundingCode = fundingCode;
	}

	public String getGwDocNo() {
		return this.gwDocNo;
	}

	public void setGwDocNo(String gwDocNo) {
		this.gwDocNo = gwDocNo;
	}

	public String getGwLibrary() {
		return this.gwLibrary;
	}

	public void setGwLibrary(String gwLibrary) {
		this.gwLibrary = gwLibrary;
	}

	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertPgmName() {
		return this.insertPgmName;
	}

	public void setInsertPgmName(String insertPgmName) {
		this.insertPgmName = insertPgmName;
	}

	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPages() {
		return this.pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getPeerGwDocNo() {
		return this.peerGwDocNo;
	}

	public void setPeerGwDocNo(String peerGwDocNo) {
		this.peerGwDocNo = peerGwDocNo;
	}

	public String getPeerGwLibrary() {
		return this.peerGwLibrary;
	}

	public void setPeerGwLibrary(String peerGwLibrary) {
		this.peerGwLibrary = peerGwLibrary;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectId2() {
		return this.projectId2;
	}

	public void setProjectId2(String projectId2) {
		this.projectId2 = projectId2;
	}

	public String getProjectProposalNo() {
		return this.projectProposalNo;
	}

	public void setProjectProposalNo(String projectProposalNo) {
		this.projectProposalNo = projectProposalNo;
	}

	public String getProxyEmpNo() {
		return this.proxyEmpNo;
	}

	public void setProxyEmpNo(String proxyEmpNo) {
		this.proxyEmpNo = proxyEmpNo;
	}

	public String getPublTypeOther() {
		return this.publTypeOther;
	}

	public void setPublTypeOther(String publTypeOther) {
		this.publTypeOther = publTypeOther;
	}

	public String getPublicationTitle() {
		return this.publicationTitle;
	}

	public void setPublicationTitle(String publicationTitle) {
		this.publicationTitle = publicationTitle;
	}

	public String getPublicationType() {
		return this.publicationType;
	}

	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
	}

	public String getResearchDataLocation() {
		return this.researchDataLocation;
	}

	public void setResearchDataLocation(String researchDataLocation) {
		this.researchDataLocation = researchDataLocation;
	}

	public String getResearchDataSecClass() {
		return this.researchDataSecClass;
	}

	public void setResearchDataSecClass(String researchDataSecClass) {
		this.researchDataSecClass = researchDataSecClass;
	}

	public String getResearchDataUrl() {
		return this.researchDataUrl;
	}

	public void setResearchDataUrl(String researchDataUrl) {
		this.researchDataUrl = researchDataUrl;
	}

	public String getResearchDataYn() {
		return this.researchDataYn;
	}

	public void setResearchDataYn(String researchDataYn) {
		this.researchDataYn = researchDataYn;
	}

	public String getResponsibilityCode() {
		return this.responsibilityCode;
	}

	public void setResponsibilityCode(String responsibilityCode) {
		this.responsibilityCode = responsibilityCode;
	}

	public String getRetentionCode() {
		return this.retentionCode;
	}

	public void setRetentionCode(String retentionCode) {
		this.retentionCode = retentionCode;
	}

	public String getRiaCode() {
		return this.riaCode;
	}

	public void setRiaCode(String riaCode) {
		this.riaCode = riaCode;
	}

	public String getSafetyDocNewVersionYn() {
		return this.safetyDocNewVersionYn;
	}

	public void setSafetyDocNewVersionYn(String safetyDocNewVersionYn) {
		this.safetyDocNewVersionYn = safetyDocNewVersionYn;
	}

	public String getSafetyDocPublNo() {
		return this.safetyDocPublNo;
	}

	public void setSafetyDocPublNo(String safetyDocPublNo) {
		this.safetyDocPublNo = safetyDocPublNo;
	}

	public String getSavedRequestNo() {
		return this.savedRequestNo;
	}

	public void setSavedRequestNo(String savedRequestNo) {
		this.savedRequestNo = savedRequestNo;
	}

	public String getSecurityClassification() {
		return this.securityClassification;
	}

	public void setSecurityClassification(String securityClassification) {
		this.securityClassification = securityClassification;
	}

	public Date getSignedDate() {
		return this.signedDate;
	}

	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}

	public String getSimsProposalNo() {
		return this.simsProposalNo;
	}

	public void setSimsProposalNo(String simsProposalNo) {
		this.simsProposalNo = simsProposalNo;
	}

	public String getStatusInd() {
		return this.statusInd;
	}

	public void setStatusInd(String statusInd) {
		this.statusInd = statusInd;
	}

	public Date getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getTodbIndexingYn() {
		return this.todbIndexingYn;
	}

	public void setTodbIndexingYn(String todbIndexingYn) {
		this.todbIndexingYn = todbIndexingYn;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatePgmName() {
		return this.updatePgmName;
	}

	public void setUpdatePgmName(String updatePgmName) {
		this.updatePgmName = updatePgmName;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getVolumeAndNumber() {
		return this.volumeAndNumber;
	}

	public void setVolumeAndNumber(String volumeAndNumber) {
		this.volumeAndNumber = volumeAndNumber;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}