package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the WFD0026_REQ_RIA database table.
 * 
 */
@Entity
@Table(name="WFD0026_REQ_RIA")
public class ReqRia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REQUEST_NO", nullable=false, length=30)
	private String requestNo;
	
	@Id
	@Column(name="RIA_CODE", nullable=false, length=20)
	private String riaCode;

	public ReqRia() {
	}

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRiaCode() {
		return this.riaCode;
	}

	public void setRiaCode(String riaCode) {
		this.riaCode = riaCode;
	}

}