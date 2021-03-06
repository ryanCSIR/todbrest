package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="WFD0026_TODB_PUBLICATION_TYPES")
public class PublicationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PublicationTypePK id;

	@Column(length=50)
	private String description;

	@Column(name="DOCUMENT_WF_ROUTE")
	private BigDecimal documentWfRoute;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE")
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME", length=240)
	private String insertPgmName;

	@Column(name="INSERT_USER", length=30)
	private String insertUser;

	@Column(name="REPORT_TYPE_CODE", length=20)
	private String reportTypeCode;

	@Column(name="RESEARCH_DATA_YN", length=1)
	private String researchDataYn;

	@Column(name="RESEARCH_DETAIL_COMP_YN", length=1)
	private String researchDetailCompYn;

	@Column(name="SORT_ORDER")
	private BigDecimal sortOrder;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=240)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENT_TYPE_CODE", nullable=false, insertable=false, updatable=false)
	//@JsonIgnore
	private DocumentType wfd0026TodbDocumentType;

	public PublicationType() {
	}

	public PublicationTypePK getId() {
		return this.id;
	}

	public void setId(PublicationTypePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDocumentWfRoute() {
		return this.documentWfRoute;
	}

	public void setDocumentWfRoute(BigDecimal documentWfRoute) {
		this.documentWfRoute = documentWfRoute;
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

	public String getReportTypeCode() {
		return this.reportTypeCode;
	}

	public void setReportTypeCode(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}

	public String getResearchDataYn() {
		return this.researchDataYn;
	}

	public void setResearchDataYn(String researchDataYn) {
		this.researchDataYn = researchDataYn;
	}

	public String getResearchDetailCompYn() {
		return this.researchDetailCompYn;
	}

	public void setResearchDetailCompYn(String researchDetailCompYn) {
		this.researchDetailCompYn = researchDetailCompYn;
	}

	public BigDecimal getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(BigDecimal sortOrder) {
		this.sortOrder = sortOrder;
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

	public DocumentType getWfd0026TodbDocumentType() {
		return this.wfd0026TodbDocumentType;
	}

	public void setWfd0026TodbDocumentType(DocumentType wfd0026TodbDocumentType) {
		this.wfd0026TodbDocumentType = wfd0026TodbDocumentType;
	}

}