package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="WFD0026_TODB_SECURITY_CLASS")
public class SecurityClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLASSIFICATION_TYPE", unique=true, nullable=false, length=3)
	private String classificationType;

	@Column(name="CLASSIFICATION_DESCR", length=100)
	private String classificationDescr;

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

	public SecurityClass() {
	}

	public String getClassificationType() {
		return this.classificationType;
	}

	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

	public String getClassificationDescr() {
		return this.classificationDescr;
	}

	public void setClassificationDescr(String classificationDescr) {
		this.classificationDescr = classificationDescr;
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

}