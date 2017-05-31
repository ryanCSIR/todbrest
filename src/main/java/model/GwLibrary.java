package model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="WFD0026_TODB_GW_LIBRARIES")
public class GwLibrary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOCUMENT_LIBRARY", length=30)
	private String documentLibrary;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE")
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME", length=100)
	private String insertPgmName;

	@Column(name="INSERT_USER", length=30)
	private String insertUser;

	@Column(name="STATUS_IND", length=8)
	private String statusInd;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=100)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;

	public GwLibrary() {
	}

	public String getDocumentLibrary() {
		return this.documentLibrary;
	}

	public void setDocumentLibrary(String documentLibrary) {
		this.documentLibrary = documentLibrary;
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

	public String getStatusInd() {
		return this.statusInd;
	}

	public void setStatusInd(String statusInd) {
		this.statusInd = statusInd;
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

}