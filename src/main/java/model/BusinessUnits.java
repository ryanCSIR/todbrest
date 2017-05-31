package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Ryan Dekker
 *
 */
@Entity
@Table(name = "WFD0000_BUSINESS_UNITS")
public class BusinessUnits implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "BU_DESC")
	private String buDesc;

	@Column(name = "BU_ACRONYM")
	private String buAcronym;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "INSERT_USER")
	private String insertUser;

	@Column(name = "INSERT_DATE")
	private Date insertDate;

	@Column(name = "INSERT_PGM_NAME")
	private String insertPgmName;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_PGM_NAME")
	private String updatePgmName;

	public BusinessUnits() {
	}

	public String getBuId() {
		return this.buId;
	}

	public void setBuId(String buId) {
		this.buId = buId;
	}

	public String getBuDesc() {
		return this.buDesc;
	}

	public void setBuDesc(String buDesc) {
		this.buDesc = buDesc;
	}

	public String getBuAcronym() {
		return this.buAcronym;
	}

	public void setBuAcronym(String buAcronym) {
		this.buAcronym = buAcronym;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
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

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
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
}
