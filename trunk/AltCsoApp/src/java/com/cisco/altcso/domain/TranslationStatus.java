package com.cisco.altcso.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Intesar Mohammed
 */
@Entity
@Table(name = "TRANSLATION_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TranslationStatus.findByCustomerIdBetweenDates", query = "SELECT t FROM TranslationStatus t "
    + "WHERE t.customerId.customerId = :customerId AND t.startTime >= :startTime AND t.endTime <= :endTime"),
    @NamedQuery(name = "TranslationStatus.findBetweenDates", query = "SELECT t FROM TranslationStatus t "
    + "WHERE t.startTime >= :startTime AND t.endTime <= :endTime"),
    @NamedQuery(name = "TranslationStatus.findAll", query = "SELECT t FROM TranslationStatus t"),
    @NamedQuery(name = "TranslationStatus.findByRequestId", query = "SELECT t FROM TranslationStatus t WHERE t.requestId = :requestId"),
    @NamedQuery(name = "TranslationStatus.findByStatus", query = "SELECT t FROM TranslationStatus t WHERE t.status = :status"),
    @NamedQuery(name = "TranslationStatus.findByStartTime", query = "SELECT t FROM TranslationStatus t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "TranslationStatus.findByEndTime", query = "SELECT t FROM TranslationStatus t WHERE t.endTime = :endTime"),
    @NamedQuery(name = "TranslationStatus.findByCustomerId", query = "SELECT t FROM TranslationStatus t WHERE t.customerId = :customerId"),
    @NamedQuery(name = "TranslationStatus.findBySourceWordCount", query = "SELECT t FROM TranslationStatus t WHERE t.sourceWordCount = :sourceWordCount"),
    @NamedQuery(name = "TranslationStatus.findBySourceLanguageId", query = "SELECT t FROM TranslationStatus t WHERE t.sourceLanguageId = :sourceLanguageId"),
    @NamedQuery(name = "TranslationStatus.findByTargetLanguageId", query = "SELECT t FROM TranslationStatus t WHERE t.targetLanguageId = :targetLanguageId"),
    @NamedQuery(name = "TranslationStatus.findByEncoding", query = "SELECT t FROM TranslationStatus t WHERE t.encoding = :encoding"),
    @NamedQuery(name = "TranslationStatus.findByPriority", query = "SELECT t FROM TranslationStatus t WHERE t.priority = :priority"),
    @NamedQuery(name = "TranslationStatus.findByTmx", query = "SELECT t FROM TranslationStatus t WHERE t.tmx = :tmx"),
    @NamedQuery(name = "TranslationStatus.findByDocumentFormat", query = "SELECT t FROM TranslationStatus t WHERE t.documentFormat = :documentFormat"),
    @NamedQuery(name = "TranslationStatus.findByEngineResponseCode", query = "SELECT t FROM TranslationStatus t WHERE t.engineResponseCode = :engineResponseCode"),
    @NamedQuery(name = "TranslationStatus.findByEngineException", query = "SELECT t FROM TranslationStatus t WHERE t.engineException = :engineException"),
    @NamedQuery(name = "TranslationStatus.findBySourceLength", query = "SELECT t FROM TranslationStatus t WHERE t.sourceLength = :sourceLength"),
    @NamedQuery(name = "TranslationStatus.findByTranslatedLength", query = "SELECT t FROM TranslationStatus t WHERE t.translatedLength = :translatedLength")})
public class TranslationStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "SOURCE_WORD_COUNT")
    private Long sourceWordCount;
    @Column(name = "SOURCE_LANGUAGE_ID")
    private String sourceLanguageId;
    @Column(name = "TARGET_LANGUAGE_ID")
    private String targetLanguageId;
    @Column(name = "ENCODING")
    private String encoding;
    @Column(name = "PRIORITY")
    private Long priority;
    @Column(name = "TMX")
    private Long tmx;
    @Column(name = "DOCUMENT_FORMAT")
    private String documentFormat;
    @Column(name = "ENGINE_RESPONSE_CODE")
    private String engineResponseCode;
    @Column(name = "ENGINE_EXCEPTION")
    private String engineException;
    @Column(name = "SOURCE_LENGTH")
    private Long sourceLength;
    @Column(name = "TRANSLATED_LENGTH")
    private Long translatedLength;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false)
    private Customer customerId;

    public TranslationStatus() {
    }

    public TranslationStatus(Long requestId) {
        this.requestId = requestId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Long getSourceWordCount() {
        return sourceWordCount;
    }

    public void setSourceWordCount(Long sourceWordCount) {
        this.sourceWordCount = sourceWordCount;
    }

    public String getSourceLanguageId() {
        return sourceLanguageId;
    }

    public void setSourceLanguageId(String sourceLanguageId) {
        this.sourceLanguageId = sourceLanguageId;
    }

    public String getTargetLanguageId() {
        return targetLanguageId;
    }

    public void setTargetLanguageId(String targetLanguageId) {
        this.targetLanguageId = targetLanguageId;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getTmx() {
        return tmx;
    }

    public void setTmx(Long tmx) {
        this.tmx = tmx;
    }

    public String getDocumentFormat() {
        return documentFormat;
    }

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    public String getEngineResponseCode() {
        return engineResponseCode;
    }

    public void setEngineResponseCode(String engineResponseCode) {
        this.engineResponseCode = engineResponseCode;
    }

    public String getEngineException() {
        return engineException;
    }

    public void setEngineException(String engineException) {
        this.engineException = engineException;
    }

    public Long getSourceLength() {
        return sourceLength;
    }

    public void setSourceLength(Long sourceLength) {
        this.sourceLength = sourceLength;
    }

    public Long getTranslatedLength() {
        return translatedLength;
    }

    public void setTranslatedLength(Long translatedLength) {
        this.translatedLength = translatedLength;
    }

    @Transient
    public String getFormatedStartTime() {
        return getFormatedDate(startTime);
    }

    private String getFormatedDate(Date date) {
        String dt = "";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        if (date != null) {
            dt = df.format(date);
        } 
        return dt;
    }

    @Transient
    public String getFormatedEndTime() {
        return getFormatedDate(endTime);
    }

    @Transient
    public Long getTime() {
        Long time = 0L;
        if (endTime != null && startTime != null) {
            time = endTime.getTime() - startTime.getTime();
        } 
        return time;
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
        if (!(object instanceof TranslationStatus)) {
            return false;
        }
        TranslationStatus other = (TranslationStatus) object;
        if ((this.requestId == null && other.requestId != null) || (this.requestId != null && !this.requestId.equals(other.requestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cisco.altcso.domain.TranslationStatus[ requestId=" + requestId + " ]";
    }
}
