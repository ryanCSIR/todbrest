package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the WFD0026_REQ_PROJECT database table.
 * 
 */
@Entity
@Table(name="WFD0026_REQ_PROJECT")
public class ReqProject implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="PROJECT_ID", nullable=false, length=20)
	private String projectId;

	@Column(name="REQUEST_NO", nullable=false, length=30)
	private String requestNo;

	public ReqProject() {
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}