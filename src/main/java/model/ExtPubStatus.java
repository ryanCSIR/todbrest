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
 * The persistent class for the WFD0026_TODB_EXT_PUB_STATUSES database table.
 * 
 */
@Entity
@Table(name="WFD0026_TODB_EXT_PUB_STATUSES")
public class ExtPubStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DOCUMENT_STATUS", nullable=false, length=100)
	private String documentStatus;

	@Column(name="GW_DOC_NO", nullable=false, length=20)
	private String gwDocNo;

	@Column(name="GW_LIBRARY", length=40)
	private String gwLibrary;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE", nullable=false)
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME", length=400)
	private String insertPgmName;

	@Column(name="INSERT_USER", length=30)
	private String insertUser;

	@Column(name="PEER_GW_DOC_NO", length=20)
	private String peerGwDocNo;

	@Column(name="PEER_GW_LIBRARY", length=40)
	private String peerGwLibrary;

	@Id
	@Column(name="REQUEST_NO", nullable=false, length=30)
	private String requestNo;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=400)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;

	public ExtPubStatus() {
	}

	public String getDocumentStatus() {
		return this.documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
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

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
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