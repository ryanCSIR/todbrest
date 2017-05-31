package model;


import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the WFD0026_SAVED_RIA database table.
 * 
 */
@Entity
@Table(name="WFD0026_SAVED_RIA")
public class SavedRias implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="RIA_CODE")
	private String riaCode;

	@Column(name="SAVED_REQUEST_NO")
	private String savedRequestNo;

	public SavedRias() {
	}

	public String getRiaCode() {
		return this.riaCode;
	}

	public void setRiaCode(String riaCode) {
		this.riaCode = riaCode;
	}

	public String getSavedRequestNo() {
		return this.savedRequestNo;
	}

	public void setSavedRequestNo(String savedRequestNo) {
		this.savedRequestNo = savedRequestNo;
	}

}