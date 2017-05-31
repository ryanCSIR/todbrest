package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author RDekker
 */
@Embeddable
public class ExternalAuthorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "REQUEST_NO")
    private String requestNo;
    @Basic(optional = false)
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    public ExternalAuthorPK() {
    }

    public ExternalAuthorPK(String requestNo, String authorName) {
        this.requestNo = requestNo;
        this.authorName = authorName;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
   }
