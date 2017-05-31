package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WFD0000_REPORTING_STRUCTURE database table.
 * 
 */
@Entity
@Table(name="WFD0000_REPORTING_STRUCTURE")
@NamedQuery(name="ReportingStructure.findAll", query="SELECT r FROM ReportingStructure r")
public class ReportingStructure implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReportingStructurePK id;

	@Temporal(TemporalType.DATE)
	@Column(name="END_EFFECTIVE_DATE")
	private Date endEffectiveDate;

	@Column(name="ID_EMAIL_YN")
	private String idEmailYn;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_DATE")
	private Date insertDate;

	@Column(name="INSERT_PGM_NAME")
	private String insertPgmName;

	@Column(name="INSERT_USER")
	private String insertUser;

	@Column(name="LEVEL_NO")
	private BigDecimal levelNo;

	private String name;

	@Column(name="NICK_NAME")
	private String nickName;

	private String note;

	@Column(name="REPORTING_TO_EMP_NO")
	private String reportingToEmpNo;

	@Column(name="REPORTING_TO_LEVEL_NO")
	private BigDecimal reportingToLevelNo;

	private String surname;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_PGM_NAME")
	private String updatePgmName;

	@Column(name="UPDATE_USER")
	private String updateUser;

	public ReportingStructure() {
	}

	public ReportingStructurePK getId() {
		return this.id;
	}

	public void setId(ReportingStructurePK id) {
		this.id = id;
	}

	public Date getEndEffectiveDate() {
		return this.endEffectiveDate;
	}

	public void setEndEffectiveDate(Date endEffectiveDate) {
		this.endEffectiveDate = endEffectiveDate;
	}

	public String getIdEmailYn() {
		return this.idEmailYn;
	}

	public void setIdEmailYn(String idEmailYn) {
		this.idEmailYn = idEmailYn;
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

	public BigDecimal getLevelNo() {
		return this.levelNo;
	}

	public void setLevelNo(BigDecimal levelNo) {
		this.levelNo = levelNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReportingToEmpNo() {
		return this.reportingToEmpNo;
	}

	public void setReportingToEmpNo(String reportingToEmpNo) {
		this.reportingToEmpNo = reportingToEmpNo;
	}

	public BigDecimal getReportingToLevelNo() {
		return this.reportingToLevelNo;
	}

	public void setReportingToLevelNo(BigDecimal reportingToLevelNo) {
		this.reportingToLevelNo = reportingToLevelNo;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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