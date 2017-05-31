package model;


import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the WFD0026_SAVED_FLAGSHIPS database table.
 * 
 */
@Entity
@Table(name="WFD0026_SAVED_FLAGSHIPS")
public class SavedFlagships implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="FLAGSHIP_CODE")
	private String flagshipCode;

	@Column(name="SAVED_REQUEST_NO")
	private String savedRequestNo;

	public SavedFlagships() {
	}

	public String getFlagshipCode() {
		return this.flagshipCode;
	}

	public void setFlagshipCode(String flagshipCode) {
		this.flagshipCode = flagshipCode;
	}

	public String getSavedRequestNo() {
		return this.savedRequestNo;
	}

	public void setSavedRequestNo(String savedRequestNo) {
		this.savedRequestNo = savedRequestNo;
	}

}