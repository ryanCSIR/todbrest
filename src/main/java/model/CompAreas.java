package model;

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
@Table(name = "WFD0026_TODB_COMP_AREAS")
public class CompAreas implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="BU_ID", length=5)
	private String buId;

	@Id
	@Column(name="COMP_AREA_ABBR", length=60)
	private String compAreaAbbr;

	@Column(name="COMP_AREA_DESCR", length=240)
	private String compAreaDescr;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE")
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME", length=400)
	private String insertPgmName;

	@Column(name="INSERT_USER", length=30)
	private String insertUser;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=400)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;
	
	public CompAreas() {
	}

	public String getBuId() {
		return this.buId;
	}

	public void setBuId(String buId) {
		this.buId = buId;
	}

	public String getCompAreaAbbr() {
		return this.compAreaAbbr;
	}

	public void setCompAreaAbbr(String compAreaAbbr) {
		this.compAreaAbbr = compAreaAbbr;
	}

	public String getCompAreaDescr() {
		return this.compAreaDescr;
	}

	public void setCompAreaDescr(String compAreaDescr) {
		this.compAreaDescr = compAreaDescr;
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
