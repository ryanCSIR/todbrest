package model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author Ryan Dekker
 *
 */
@Embeddable
public class CSIRAuthorsPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	@Column(name = "REQUEST_NO")
	private String requestNo;
	@Basic(optional = false)
	@Column(name = "EMP_NO")
	private String empNo;

	public CSIRAuthorsPK() {
	}
	
	public CSIRAuthorsPK(String empNo) {
		this.empNo = empNo;
	}

	public CSIRAuthorsPK(String requestNo, String empNo) {
		this.requestNo = requestNo;
		this.empNo = empNo;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (requestNo != null ? requestNo.hashCode() : 0);
		hash += (empNo != null ? empNo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof CSIRAuthorsPK)) {
			return false;
		}
		CSIRAuthorsPK other = (CSIRAuthorsPK) object;
		if ((this.requestNo == null && other.requestNo != null)
				|| (this.requestNo != null && !this.requestNo.equals(other.requestNo))) {
			return false;
		}
		if ((this.empNo == null && other.empNo != null) || (this.empNo != null && !this.empNo.equals(other.empNo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entities.CsirAuthorsPK[ requestNo=" + requestNo + ", empNo=" + empNo + " ]";
	}

}
