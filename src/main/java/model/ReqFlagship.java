package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the WFD0026_REQ_FLAGSHIPS database table.
 * 
 */
@Entity
@Table(name="WFD0026_REQ_FLAGSHIPS")
public class ReqFlagship implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="FLAGSHIP_CODE", nullable=false, length=20)
	private String flagshipCode;

	@Column(name="REQUEST_NO", nullable=false, length=30)
	private String requestNo;

	public ReqFlagship() {
	}

	public String getFlagshipCode() {
		return this.flagshipCode;
	}

	public void setFlagshipCode(String flagshipCode) {
		this.flagshipCode = flagshipCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}