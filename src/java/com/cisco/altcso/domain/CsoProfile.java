package com.cisco.altcso.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Intesar Mohammed
 */
@Entity
@Table(name = "CSO_PROFILE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CsoProfile.findAll", query = "SELECT c FROM CsoProfile c"),
    @NamedQuery(name = "CsoProfile.findByCsoProfileId", query = "SELECT c FROM CsoProfile c WHERE c.csoProfileId = :csoProfileId"),
    @NamedQuery(name = "CsoProfile.findByCsoProfileName", query = "SELECT c FROM CsoProfile c WHERE c.csoProfileName = :csoProfileName"),
    @NamedQuery(name = "CsoProfile.findByDefaultProfile", query = "SELECT c FROM CsoProfile c WHERE c.defaultProfile = :defaultProfile"),
    @NamedQuery(name = "CsoProfile.findByLanguagePair", query = "SELECT c FROM CsoProfile c WHERE c.languagePair = :languagePair"),
    @NamedQuery(name = "CsoProfile.findByTransEngineProfileMapId", query = "SELECT c FROM CsoProfile c WHERE c.transEngineProfileMapId = :transEngineProfileMapId"),
    @NamedQuery(name = "CsoProfile.findByCustomerName", query = "SELECT c FROM CsoProfile c WHERE c.customerName = :customerName")})
public class CsoProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CSO_PROFILE_ID")
    private Long csoProfileId;
    @Basic(optional = false)
    @Column(name = "CSO_PROFILE_NAME")
    private String csoProfileName;
    @Basic(optional = false)
    @Column(name = "DEFAULT_PROFILE")
    private String defaultProfile;
    @Basic(optional = false)
    @Column(name = "LANGUAGE_PAIR")
    private String languagePair;
    @Basic(optional = false)
//    @Column(name = "TRANS_ENGINE_PROFILE_MAP_ID")
//    private BigInteger transEngineProfileMapId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @JoinColumn(name = "TRANS_ENGINE_PROFILE_MAP_ID", referencedColumnName = "TRANS_ENGINE_PROFILE_MAP_ID")
    @ManyToOne(optional = false)
    private TransEngineProfileMap transEngineProfileMapId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "csoProfileId")
    private List<CustomerCsoProfileMap> customerCsoProfileMapList;

    public CsoProfile() {
    }

    public CsoProfile(Long csoProfileId) {
        this.csoProfileId = csoProfileId;
    }

    public CsoProfile(Long csoProfileId, String csoProfileName, String defaultProfile, String languagePair) {
        this.csoProfileId = csoProfileId;
        this.csoProfileName = csoProfileName;
        this.defaultProfile = defaultProfile;
        this.languagePair = languagePair;
    }

    public Long getCsoProfileId() {
        return csoProfileId;
    }

    public void setCsoProfileId(Long csoProfileId) {
        this.csoProfileId = csoProfileId;
    }

    public String getCsoProfileName() {
        return csoProfileName;
    }

    public void setCsoProfileName(String csoProfileName) {
        this.csoProfileName = csoProfileName;
    }

    public String getDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(String defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public String getLanguagePair() {
        return languagePair;
    }

    public void setLanguagePair(String languagePair) {
        this.languagePair = languagePair;
    }

//    public BigInteger getTransEngineProfileMapId() {
//        return transEngineProfileMapId;
//    }
//
//    public void setTransEngineProfileMapId(BigInteger transEngineProfileMapId) {
//        this.transEngineProfileMapId = transEngineProfileMapId;
//    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<CustomerCsoProfileMap> getCustomerCsoProfileMapList() {
        return customerCsoProfileMapList;
    }

    public void setCustomerCsoProfileMapList(List<CustomerCsoProfileMap> customerCsoProfileMapList) {
        this.customerCsoProfileMapList = customerCsoProfileMapList;
    }

    public TransEngineProfileMap getTransEngineProfileMapId() {
        return transEngineProfileMapId;
    }

    public void setTransEngineProfileMapId(TransEngineProfileMap transEngineProfileMapId) {
        this.transEngineProfileMapId = transEngineProfileMapId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (csoProfileId != null ? csoProfileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CsoProfile)) {
            return false;
        }
        CsoProfile other = (CsoProfile) object;
        if ((this.csoProfileId == null && other.csoProfileId != null) || (this.csoProfileId != null && !this.csoProfileId.equals(other.csoProfileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cisco.altcso.domain.CsoProfile[ csoProfileId=" + csoProfileId + " ]";
    }
}
