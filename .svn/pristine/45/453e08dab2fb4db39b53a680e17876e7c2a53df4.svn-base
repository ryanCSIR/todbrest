package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Ryan Dekker
 *
 */
@Entity
@Table(name="WFD0026_TODB_DOCUMENT_TYPES")
public class DocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DOCUMENT_TYPE_CODE", unique=true, nullable=false, length=20)
	private String documentTypeCode;

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

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=240)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;

	//bi-directional many-to-one association to PublicationType
	@OneToMany(mappedBy="wfd0026TodbDocumentType")
	@JsonIgnore
	private List<PublicationType> wfd0026TodbPublicationTypes;

	public DocumentType() {
	}

	public String getDocumentTypeCode() {
		return this.documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
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

	public List<PublicationType> getWfd0026TodbPublicationTypes() {
		return this.wfd0026TodbPublicationTypes;
	}

	public void setWfd0026TodbPublicationTypes(List<PublicationType> wfd0026TodbPublicationTypes) {
		this.wfd0026TodbPublicationTypes = wfd0026TodbPublicationTypes;
	}

	public PublicationType addWfd0026TodbPublicationType(PublicationType wfd0026TodbPublicationType) {
		getWfd0026TodbPublicationTypes().add(wfd0026TodbPublicationType);
		wfd0026TodbPublicationType.setWfd0026TodbDocumentType(this);

		return wfd0026TodbPublicationType;
	}

	public PublicationType removeWfd0026TodbPublicationType(PublicationType wfd0026TodbPublicationType) {
		getWfd0026TodbPublicationTypes().remove(wfd0026TodbPublicationType);
		wfd0026TodbPublicationType.setWfd0026TodbDocumentType(null);

		return wfd0026TodbPublicationType;
	}

}