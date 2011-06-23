package com.cisco.altcso.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Intesar Mohammed
 */
@Entity
@Table(name = "TRANSLATION_CONTENT_")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TranslationContent.findAll", query = "SELECT t FROM TranslationContent t"),
    @NamedQuery(name = "TranslationContent.findByRequestId", query = "SELECT t FROM TranslationContent t WHERE t.requestId = :requestId")})
public class TranslationContent implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Lob
    @Column(name = "SOURCE_CONTENT")
    private String sourceContent;
    @Lob
    @Column(name = "TMX_CONTENT")
    private String tmxContent;
    @Lob
    @Column(name = "TRANSLATED_CONTENT")
    private String translatedContent;

    public TranslationContent() {
    }

    public TranslationContent(Long requestId) {
        this.requestId = requestId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getSourceContent() {
        return sourceContent;
    }

    public void setSourceContent(String sourceContent) {
        this.sourceContent = sourceContent;
    }

    public String getTmxContent() {
        return tmxContent;
    }

    public void setTmxContent(String tmxContent) {
        this.tmxContent = tmxContent;
    }

    public String getTranslatedContent() {
        return translatedContent;
    }

    public void setTranslatedContent(String translatedContent) {
        this.translatedContent = translatedContent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestId != null ? requestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TranslationContent)) {
            return false;
        }
        TranslationContent other = (TranslationContent) object;
        if ((this.requestId == null && other.requestId != null) || (this.requestId != null && !this.requestId.equals(other.requestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cisco.altcso.domain.TranslationContent[ requestId=" + requestId + " ]";
    }
    
}
