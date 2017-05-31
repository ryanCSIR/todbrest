package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the WFD0000_REPORTING_STRUCTURE database table.
 * 
 */
@Embeddable
public class ReportingStructurePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EMP_NO")
	private String empNo;

	@Temporal(TemporalType.DATE)
	@Column(name="START_EFFECTIVE_DATE")
	private java.util.Date startEffectiveDate;

	public ReportingStructurePK() {
	}
	public String getEmpNo() {
		return this.empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public java.util.Date getStartEffectiveDate() {
		return this.startEffectiveDate;
	}
	public void setStartEffectiveDate(java.util.Date startEffectiveDate) {
		this.startEffectiveDate = startEffectiveDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReportingStructurePK)) {
			return false;
		}
		ReportingStructurePK castOther = (ReportingStructurePK)other;
		return 
			this.empNo.equals(castOther.empNo)
			&& this.startEffectiveDate.equals(castOther.startEffectiveDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNo.hashCode();
		hash = hash * prime + this.startEffectiveDate.hashCode();
		
		return hash;
	}
}