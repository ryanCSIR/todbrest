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
@Table(name="WFD0000_REGISTERED_PROXIES")
public class RegisteredProxy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADMIN_OE", nullable=false, length=10)
	private String adminOe;

	@Temporal(TemporalType.DATE)
	@Column(name="END_EFFECTIVE_DATE", nullable=false)
	private Date endEffectiveDate;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE", nullable=false)
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME", nullable=false, length=400)
	private String insertPgmName;

	@Column(name="INSERT_USER", nullable=false, length=30)
	private String insertUser;

	@Column(name="PROCESS_CODE", nullable=false, length=20)
	private String processCode;

	@Column(name="PROXY_EMP_NO", nullable=false, length=12)
	private String proxyEmpNo;

	@Temporal(TemporalType.DATE)
	@Column(name="START_EFFECTIVE_DATE", nullable=false)
	private Date startEffectiveDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME", length=400)
	private String updatePgmName;

	@Column(name="UPDATE_USER", length=30)
	private String updateUser;

	public RegisteredProxy() {
	}

	public String getAdminOe() {
		return this.adminOe;
	}

	public void setAdminOe(String adminOe) {
		this.adminOe = adminOe;
	}

	public Date getEndEffectiveDate() {
		return this.endEffectiveDate;
	}

	public void setEndEffectiveDate(Date endEffectiveDate) {
		this.endEffectiveDate = endEffectiveDate;
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

	public String getProcessCode() {
		return this.processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProxyEmpNo() {
		return this.proxyEmpNo;
	}

	public void setProxyEmpNo(String proxyEmpNo) {
		this.proxyEmpNo = proxyEmpNo;
	}

	public Date getStartEffectiveDate() {
		return this.startEffectiveDate;
	}

	public void setStartEffectiveDate(Date startEffectiveDate) {
		this.startEffectiveDate = startEffectiveDate;
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