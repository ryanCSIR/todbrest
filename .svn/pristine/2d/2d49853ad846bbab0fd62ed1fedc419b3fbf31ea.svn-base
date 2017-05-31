package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Ryan Dekker
 *
 */
@NamedNativeQueries({ @NamedNativeQuery(name = "getEmployees", query = "select eide.* "
		+ "from   wfd0000_entity_ident eide, wfd0000_reporting_structure rstr "
		+ "where eide.emp_no = rstr.emp_no "
		+ "and trunc(sysdate) >= trunc(rstr.start_effective_date) "
		+ "and (trunc(sysdate) <= trunc(rstr.end_effective_date) "
		+ "      or trunc(rstr.end_effective_date) is null)", resultClass = EntityIdent.class) })
@Entity
@Table(name = "WFD0000_ENTITY_IDENT")
public class EntityIdent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ENTITY_UQ_ID", unique = true, nullable = false, precision = 10)
	private long entityUqId;

	@Column(name = "ADMIN_OE", length = 10)
	private String adminOe;

	@Column(name = "ADULT_DEPENT", precision = 5)
	private BigDecimal adultDepent;

	@Column(name = "ASSET_MGR_EMAIL_IND", length = 1)
	private String assetMgrEmailInd;

	@Column(name = "BANK_ACCOUNT", length = 16)
	private String bankAccount;

	@Column(name = "BANK_ACCOUNT_TYPE", length = 2)
	private String bankAccountType;

	@Column(length = 8)
	private String bankname;

	@Column(name = "CELL_NO", length = 10)
	private String cellNo;

	@Column(name = "CHILD_DEPEN", precision = 5)
	private BigDecimal childDepen;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "DOMAIN_SPEC_EMAIL_IND", length = 1)
	private String domainSpecEmailInd;

	@Column(name = "EMAIL_ADDRESS", length = 240)
	private String emailAddress;

	@Column(name = "EMP_LANGUAGE", length = 2)
	private String empLanguage;

	@Column(name = "EMP_NO", nullable = false, length = 12)
	private String empNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "END_EFFECTIVE_DATE")
	private Date endEffectiveDate;

	@Column(name = "ENTITY_DESC", length = 240)
	private String entityDesc;

	@Column(name = "ENTITY_OE1", length = 5)
	private String entityOe1;

	@Column(name = "ENTITY_OE2", length = 5)
	private String entityOe2;

	@Column(name = "FIRE_TRIGGER_IND", length = 2)
	private String fireTriggerInd;

	@Column(name = "HOME_TEL_AREA_CODE", length = 12)
	private String homeTelAreaCode;

	@Column(name = "HOME_TEL_NO", length = 12)
	private String homeTelNo;

	@Column(name = "ID_NO", length = 15)
	private String idNo;

	@Column(length = 10)
	private String initials;

	@Temporal(TemporalType.DATE)
	@Column(name = "INSERT_DATE", nullable = false)
	private Date insertDate;

	@Column(name = "INSERT_PGM_NAME", nullable = false, length = 400)
	private String insertPgmName;

	@Column(name = "INSERT_USER", nullable = false, length = 30)
	private String insertUser;

	@Column(name = "LAN_USERID", length = 30)
	private String lanUserid;

	@Temporal(TemporalType.DATE)
	@Column(name = "MARITAL_DATE")
	private Date maritalDate;

	@Column(name = "MARITAL_STATUS", length = 1)
	private String maritalStatus;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(name = "NICK_NAME", length = 60)
	private String nickName;

	@Column(name = "NOK_ADR_LIN1", length = 35)
	private String nokAdrLin1;

	@Column(name = "NOK_ADR_LIN2", length = 35)
	private String nokAdrLin2;

	@Column(name = "NOK_ADR_LIN3", length = 35)
	private String nokAdrLin3;

	@Column(name = "NOK_ADR_LIN4", length = 35)
	private String nokAdrLin4;

	@Column(name = "NOK_CELL_NO", length = 10)
	private String nokCellNo;

	@Column(name = "NOK_EMP_NAME", length = 25)
	private String nokEmpName;

	@Column(name = "NOK_FIRST_NAME", length = 20)
	private String nokFirstName;

	@Column(name = "NOK_HOME_TEL_AREA_CODE", length = 12)
	private String nokHomeTelAreaCode;

	@Column(name = "NOK_HOME_TEL_NO", length = 12)
	private String nokHomeTelNo;

	@Column(name = "NOK_POSTAL_CODE", length = 12)
	private String nokPostalCode;

	@Column(name = "NOK_RELATION_DESCR", length = 20)
	private String nokRelationDescr;

	@Column(name = "NOK_SURNAME", length = 40)
	private String nokSurname;

	@Column(name = "NOK_WORK_TEL_AREA_CODE", length = 12)
	private String nokWorkTelAreaCode;

	@Column(name = "NOK_WORK_TEL_NO", length = 12)
	private String nokWorkTelNo;

	@Column(length = 2000)
	private String note;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORACLE_DATE_CREATED")
	private Date oracleDateCreated;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORACLE_DATE_REMOVED")
	private Date oracleDateRemoved;

	@Column(name = "ORACLE_STATUS", length = 10)
	private String oracleStatus;

	@Column(name = "ORACLE_USERID", length = 30)
	private String oracleUserid;

	@Column(name = "PASSPORT_NO", length = 15)
	private String passportNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "POS_START_DATE")
	private Date posStartDate;

	@Column(name = "POSTAL_ADDR1", length = 35)
	private String postalAddr1;

	@Column(name = "POSTAL_ADDR2", length = 35)
	private String postalAddr2;

	@Column(name = "POSTAL_ADDR3", length = 35)
	private String postalAddr3;

	@Column(name = "POSTAL_ADDR4", length = 35)
	private String postalAddr4;

	@Column(name = "POSTAL_CODE", length = 35)
	private String postalCode;

	@Column(name = "RESIDENT_ADDR1", length = 35)
	private String residentAddr1;

	@Column(name = "RESIDENT_ADDR2", length = 35)
	private String residentAddr2;

	@Column(name = "RESIDENT_ADDR3", length = 35)
	private String residentAddr3;

	@Column(name = "RESIDENT_ADDR4", length = 35)
	private String residentAddr4;

	@Column(name = "RESIDENT_CODE", length = 35)
	private String residentCode;

	@Column(name = "SECOND_NAME", length = 20)
	private String secondName;

	@Temporal(TemporalType.DATE)
	@Column(name = "SPOUSE_BIRTH_DATE")
	private Date spouseBirthDate;

	@Column(name = "SPOUSE_CELL_NO", length = 10)
	private String spouseCellNo;

	@Column(name = "SPOUSE_EMP_NAME", length = 25)
	private String spouseEmpName;

	@Column(name = "SPOUSE_FIRST_NAME", length = 20)
	private String spouseFirstName;

	@Column(name = "SPOUSE_HOME_TEL_AREA_CODE", length = 12)
	private String spouseHomeTelAreaCode;

	@Column(name = "SPOUSE_HOME_TEL_NO", length = 12)
	private String spouseHomeTelNo;

	@Column(name = "SPOUSE_ID_NO", length = 13)
	private String spouseIdNo;

	@Column(name = "SPOUSE_NICKNAME", length = 20)
	private String spouseNickname;

	@Column(name = "SPOUSE_PASSPORT_NO", length = 15)
	private String spousePassportNo;

	@Column(name = "SPOUSE_SECOND_NAME", length = 20)
	private String spouseSecondName;

	@Column(name = "SPOUSE_SURNAME", length = 40)
	private String spouseSurname;

	@Column(name = "SPOUSE_WORK_TEL_AREA_CODE", length = 12)
	private String spouseWorkTelAreaCode;

	@Column(name = "SPOUSE_WORK_TEL_NO", length = 12)
	private String spouseWorkTelNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "START_EFFECTIVE_DATE")
	private Date startEffectiveDate;

	@Column(name = "STATUS_IND", nullable = false, length = 10)
	private String statusInd;

	@Column(nullable = false, length = 100)
	private String surname;

	@Column(name = "TAX_NUMBER", length = 16)
	private String taxNumber;

	@Column(length = 6)
	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_PGM_NAME", length = 400)
	private String updatePgmName;

	@Column(name = "UPDATE_USER", length = 30)
	private String updateUser;

	@Temporal(TemporalType.DATE)
	@Column(name = "WITHDRAWAL_DATE")
	private Date withdrawalDate;

	public EntityIdent() {
	}

	public long getEntityUqId() {
		return this.entityUqId;
	}

	public void setEntityUqId(long entityUqId) {
		this.entityUqId = entityUqId;
	}

	public String getAdminOe() {
		return this.adminOe;
	}

	public void setAdminOe(String adminOe) {
		this.adminOe = adminOe;
	}

	public BigDecimal getAdultDepent() {
		return this.adultDepent;
	}

	public void setAdultDepent(BigDecimal adultDepent) {
		this.adultDepent = adultDepent;
	}

	public String getAssetMgrEmailInd() {
		return this.assetMgrEmailInd;
	}

	public void setAssetMgrEmailInd(String assetMgrEmailInd) {
		this.assetMgrEmailInd = assetMgrEmailInd;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getCellNo() {
		return this.cellNo;
	}

	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}

	public BigDecimal getChildDepen() {
		return this.childDepen;
	}

	public void setChildDepen(BigDecimal childDepen) {
		this.childDepen = childDepen;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDomainSpecEmailInd() {
		return this.domainSpecEmailInd;
	}

	public void setDomainSpecEmailInd(String domainSpecEmailInd) {
		this.domainSpecEmailInd = domainSpecEmailInd;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmpLanguage() {
		return this.empLanguage;
	}

	public void setEmpLanguage(String empLanguage) {
		this.empLanguage = empLanguage;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public Date getEndEffectiveDate() {
		return this.endEffectiveDate;
	}

	public void setEndEffectiveDate(Date endEffectiveDate) {
		this.endEffectiveDate = endEffectiveDate;
	}

	public String getEntityDesc() {
		return this.entityDesc;
	}

	public void setEntityDesc(String entityDesc) {
		this.entityDesc = entityDesc;
	}

	public String getEntityOe1() {
		return this.entityOe1;
	}

	public void setEntityOe1(String entityOe1) {
		this.entityOe1 = entityOe1;
	}

	public String getEntityOe2() {
		return this.entityOe2;
	}

	public void setEntityOe2(String entityOe2) {
		this.entityOe2 = entityOe2;
	}

	public String getFireTriggerInd() {
		return this.fireTriggerInd;
	}

	public void setFireTriggerInd(String fireTriggerInd) {
		this.fireTriggerInd = fireTriggerInd;
	}

	public String getHomeTelAreaCode() {
		return this.homeTelAreaCode;
	}

	public void setHomeTelAreaCode(String homeTelAreaCode) {
		this.homeTelAreaCode = homeTelAreaCode;
	}

	public String getHomeTelNo() {
		return this.homeTelNo;
	}

	public void setHomeTelNo(String homeTelNo) {
		this.homeTelNo = homeTelNo;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
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

	public String getLanUserid() {
		return this.lanUserid;
	}

	public void setLanUserid(String lanUserid) {
		this.lanUserid = lanUserid;
	}

	public Date getMaritalDate() {
		return this.maritalDate;
	}

	public void setMaritalDate(Date maritalDate) {
		this.maritalDate = maritalDate;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public String getNokAdrLin1() {
		return this.nokAdrLin1;
	}

	public void setNokAdrLin1(String nokAdrLin1) {
		this.nokAdrLin1 = nokAdrLin1;
	}

	public String getNokAdrLin2() {
		return this.nokAdrLin2;
	}

	public void setNokAdrLin2(String nokAdrLin2) {
		this.nokAdrLin2 = nokAdrLin2;
	}

	public String getNokAdrLin3() {
		return this.nokAdrLin3;
	}

	public void setNokAdrLin3(String nokAdrLin3) {
		this.nokAdrLin3 = nokAdrLin3;
	}

	public String getNokAdrLin4() {
		return this.nokAdrLin4;
	}

	public void setNokAdrLin4(String nokAdrLin4) {
		this.nokAdrLin4 = nokAdrLin4;
	}

	public String getNokCellNo() {
		return this.nokCellNo;
	}

	public void setNokCellNo(String nokCellNo) {
		this.nokCellNo = nokCellNo;
	}

	public String getNokEmpName() {
		return this.nokEmpName;
	}

	public void setNokEmpName(String nokEmpName) {
		this.nokEmpName = nokEmpName;
	}

	public String getNokFirstName() {
		return this.nokFirstName;
	}

	public void setNokFirstName(String nokFirstName) {
		this.nokFirstName = nokFirstName;
	}

	public String getNokHomeTelAreaCode() {
		return this.nokHomeTelAreaCode;
	}

	public void setNokHomeTelAreaCode(String nokHomeTelAreaCode) {
		this.nokHomeTelAreaCode = nokHomeTelAreaCode;
	}

	public String getNokHomeTelNo() {
		return this.nokHomeTelNo;
	}

	public void setNokHomeTelNo(String nokHomeTelNo) {
		this.nokHomeTelNo = nokHomeTelNo;
	}

	public String getNokPostalCode() {
		return this.nokPostalCode;
	}

	public void setNokPostalCode(String nokPostalCode) {
		this.nokPostalCode = nokPostalCode;
	}

	public String getNokRelationDescr() {
		return this.nokRelationDescr;
	}

	public void setNokRelationDescr(String nokRelationDescr) {
		this.nokRelationDescr = nokRelationDescr;
	}

	public String getNokSurname() {
		return this.nokSurname;
	}

	public void setNokSurname(String nokSurname) {
		this.nokSurname = nokSurname;
	}

	public String getNokWorkTelAreaCode() {
		return this.nokWorkTelAreaCode;
	}

	public void setNokWorkTelAreaCode(String nokWorkTelAreaCode) {
		this.nokWorkTelAreaCode = nokWorkTelAreaCode;
	}

	public String getNokWorkTelNo() {
		return this.nokWorkTelNo;
	}

	public void setNokWorkTelNo(String nokWorkTelNo) {
		this.nokWorkTelNo = nokWorkTelNo;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getOracleDateCreated() {
		return this.oracleDateCreated;
	}

	public void setOracleDateCreated(Date oracleDateCreated) {
		this.oracleDateCreated = oracleDateCreated;
	}

	public Date getOracleDateRemoved() {
		return this.oracleDateRemoved;
	}

	public void setOracleDateRemoved(Date oracleDateRemoved) {
		this.oracleDateRemoved = oracleDateRemoved;
	}

	public String getOracleStatus() {
		return this.oracleStatus;
	}

	public void setOracleStatus(String oracleStatus) {
		this.oracleStatus = oracleStatus;
	}

	public String getOracleUserid() {
		return this.oracleUserid;
	}

	public void setOracleUserid(String oracleUserid) {
		this.oracleUserid = oracleUserid;
	}

	public String getPassportNo() {
		return this.passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Date getPosStartDate() {
		return this.posStartDate;
	}

	public void setPosStartDate(Date posStartDate) {
		this.posStartDate = posStartDate;
	}

	public String getPostalAddr1() {
		return this.postalAddr1;
	}

	public void setPostalAddr1(String postalAddr1) {
		this.postalAddr1 = postalAddr1;
	}

	public String getPostalAddr2() {
		return this.postalAddr2;
	}

	public void setPostalAddr2(String postalAddr2) {
		this.postalAddr2 = postalAddr2;
	}

	public String getPostalAddr3() {
		return this.postalAddr3;
	}

	public void setPostalAddr3(String postalAddr3) {
		this.postalAddr3 = postalAddr3;
	}

	public String getPostalAddr4() {
		return this.postalAddr4;
	}

	public void setPostalAddr4(String postalAddr4) {
		this.postalAddr4 = postalAddr4;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getResidentAddr1() {
		return this.residentAddr1;
	}

	public void setResidentAddr1(String residentAddr1) {
		this.residentAddr1 = residentAddr1;
	}

	public String getResidentAddr2() {
		return this.residentAddr2;
	}

	public void setResidentAddr2(String residentAddr2) {
		this.residentAddr2 = residentAddr2;
	}

	public String getResidentAddr3() {
		return this.residentAddr3;
	}

	public void setResidentAddr3(String residentAddr3) {
		this.residentAddr3 = residentAddr3;
	}

	public String getResidentAddr4() {
		return this.residentAddr4;
	}

	public void setResidentAddr4(String residentAddr4) {
		this.residentAddr4 = residentAddr4;
	}

	public String getResidentCode() {
		return this.residentCode;
	}

	public void setResidentCode(String residentCode) {
		this.residentCode = residentCode;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getSpouseBirthDate() {
		return this.spouseBirthDate;
	}

	public void setSpouseBirthDate(Date spouseBirthDate) {
		this.spouseBirthDate = spouseBirthDate;
	}

	public String getSpouseCellNo() {
		return this.spouseCellNo;
	}

	public void setSpouseCellNo(String spouseCellNo) {
		this.spouseCellNo = spouseCellNo;
	}

	public String getSpouseEmpName() {
		return this.spouseEmpName;
	}

	public void setSpouseEmpName(String spouseEmpName) {
		this.spouseEmpName = spouseEmpName;
	}

	public String getSpouseFirstName() {
		return this.spouseFirstName;
	}

	public void setSpouseFirstName(String spouseFirstName) {
		this.spouseFirstName = spouseFirstName;
	}

	public String getSpouseHomeTelAreaCode() {
		return this.spouseHomeTelAreaCode;
	}

	public void setSpouseHomeTelAreaCode(String spouseHomeTelAreaCode) {
		this.spouseHomeTelAreaCode = spouseHomeTelAreaCode;
	}

	public String getSpouseHomeTelNo() {
		return this.spouseHomeTelNo;
	}

	public void setSpouseHomeTelNo(String spouseHomeTelNo) {
		this.spouseHomeTelNo = spouseHomeTelNo;
	}

	public String getSpouseIdNo() {
		return this.spouseIdNo;
	}

	public void setSpouseIdNo(String spouseIdNo) {
		this.spouseIdNo = spouseIdNo;
	}

	public String getSpouseNickname() {
		return this.spouseNickname;
	}

	public void setSpouseNickname(String spouseNickname) {
		this.spouseNickname = spouseNickname;
	}

	public String getSpousePassportNo() {
		return this.spousePassportNo;
	}

	public void setSpousePassportNo(String spousePassportNo) {
		this.spousePassportNo = spousePassportNo;
	}

	public String getSpouseSecondName() {
		return this.spouseSecondName;
	}

	public void setSpouseSecondName(String spouseSecondName) {
		this.spouseSecondName = spouseSecondName;
	}

	public String getSpouseSurname() {
		return this.spouseSurname;
	}

	public void setSpouseSurname(String spouseSurname) {
		this.spouseSurname = spouseSurname;
	}

	public String getSpouseWorkTelAreaCode() {
		return this.spouseWorkTelAreaCode;
	}

	public void setSpouseWorkTelAreaCode(String spouseWorkTelAreaCode) {
		this.spouseWorkTelAreaCode = spouseWorkTelAreaCode;
	}

	public String getSpouseWorkTelNo() {
		return this.spouseWorkTelNo;
	}

	public void setSpouseWorkTelNo(String spouseWorkTelNo) {
		this.spouseWorkTelNo = spouseWorkTelNo;
	}

	public Date getStartEffectiveDate() {
		return this.startEffectiveDate;
	}

	public void setStartEffectiveDate(Date startEffectiveDate) {
		this.startEffectiveDate = startEffectiveDate;
	}

	public String getStatusInd() {
		return this.statusInd;
	}

	public void setStatusInd(String statusInd) {
		this.statusInd = statusInd;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Date getWithdrawalDate() {
		return this.withdrawalDate;
	}

	public void setWithdrawalDate(Date withdrawalDate) {
		this.withdrawalDate = withdrawalDate;
	}

}