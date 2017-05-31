package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the WFD0026_TODB_PUBLICATION_TYPES database table.
 * 
 */
@Embeddable
public class PublicationTypePK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DOCUMENT_TYPE_CODE", insertable=false, updatable=false, unique=true, nullable=false, length=20)
	private String documentTypeCode;
	@Column(name="PUBLICATION_TYPE_CODE", unique=true, nullable=false, length=20)
	private String publicationTypeCode;

	public PublicationTypePK() {
	}
	public String getDocumentTypeCode() {
		return this.documentTypeCode;
	}
	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}
	public String getPublicationTypeCode() {
		return this.publicationTypeCode;
	}
	public void setPublicationTypeCode(String publicationTypeCode) {
		this.publicationTypeCode = publicationTypeCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PublicationTypePK)) {
			return false;
		}
		PublicationTypePK castOther = (PublicationTypePK)other;
		return 
			this.documentTypeCode.equals(castOther.documentTypeCode)
			&& this.publicationTypeCode.equals(castOther.publicationTypeCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.documentTypeCode.hashCode();
		hash = hash * prime + this.publicationTypeCode.hashCode();
		
		return hash;
	}
}