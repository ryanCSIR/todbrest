package model;


import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the WFD0026_SAVED_PROJECT database table.
 * 
 */
@Entity
@Table(name="WFD0026_SAVED_PROJECT")
public class SavedProjects implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="PROJECT_ID")
	private String projectId;

	@Column(name="SAVED_REQUEST_NO")
	private String savedRequestNo;

	public SavedProjects() {
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSavedRequestNo() {
		return this.savedRequestNo;
	}

	public void setSavedRequestNo(String savedRequestNo) {
		this.savedRequestNo = savedRequestNo;
	}

}