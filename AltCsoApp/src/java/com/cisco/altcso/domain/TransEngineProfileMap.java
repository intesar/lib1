package com.cisco.altcso.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TRANS_ENGINE_PROFILE_MAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransEngineProfileMap.findAll", query = "SELECT t FROM TransEngineProfileMap t"),
    @NamedQuery(name = "TransEngineProfileMap.findByTransEngineProfileMapId", query = "SELECT t FROM TransEngineProfileMap t WHERE t.transEngineProfileMapId = :transEngineProfileMapId"),
    @NamedQuery(name = "TransEngineProfileMap.findByTransEngineUrl", query = "SELECT t FROM TransEngineProfileMap t WHERE t.transEngineUrl = :transEngineUrl"),
    @NamedQuery(name = "TransEngineProfileMap.findByTransEngineProfileName", query = "SELECT t FROM TransEngineProfileMap t WHERE t.transEngineProfileName = :transEngineProfileName"),
    @NamedQuery(name = "TransEngineProfileMap.findByTransEngineProfileId", query = "SELECT t FROM TransEngineProfileMap t WHERE t.transEngineProfileId = :transEngineProfileId")})
public class TransEngineProfileMap implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TRANS_ENGINE_PROFILE_MAP_ID")
    private Long transEngineProfileMapId;
    @Column(name = "TRANS_ENGINE_URL")
    private String transEngineUrl;
    @Column(name = "TRANS_ENGINE_PROFILE_NAME")
    private String transEngineProfileName;
    @Column(name = "TRANS_ENGINE_PROFILE_ID")
    private Long transEngineProfileId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transEngineProfileMapId")
    private List<CsoProfile> csoProfileList;

    public TransEngineProfileMap() {
    }

    public TransEngineProfileMap(Long transEngineProfileMapId) {
        this.transEngineProfileMapId = transEngineProfileMapId;
    }

    public Long getTransEngineProfileMapId() {
        return transEngineProfileMapId;
    }

    public void setTransEngineProfileMapId(Long transEngineProfileMapId) {
        this.transEngineProfileMapId = transEngineProfileMapId;
    }

    public String getTransEngineUrl() {
        return transEngineUrl;
    }

    public void setTransEngineUrl(String transEngineUrl) {
        this.transEngineUrl = transEngineUrl;
    }

    public String getTransEngineProfileName() {
        return transEngineProfileName;
    }

    public void setTransEngineProfileName(String transEngineProfileName) {
        this.transEngineProfileName = transEngineProfileName;
    }

    public Long getTransEngineProfileId() {
        return transEngineProfileId;
    }

    public void setTransEngineProfileId(Long transEngineProfileId) {
        this.transEngineProfileId = transEngineProfileId;
    }

    public List<CsoProfile> getCsoProfileList() {
        return csoProfileList;
    }

    public void setCsoProfileList(List<CsoProfile> csoProfileList) {
        this.csoProfileList = csoProfileList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transEngineProfileMapId != null ? transEngineProfileMapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransEngineProfileMap)) {
            return false;
        }
        TransEngineProfileMap other = (TransEngineProfileMap) object;
        if ((this.transEngineProfileMapId == null && other.transEngineProfileMapId != null) || (this.transEngineProfileMapId != null && !this.transEngineProfileMapId.equals(other.transEngineProfileMapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cisco.altcso.domain.TransEngineProfileMap[ transEngineProfileMapId=" + transEngineProfileMapId + " ]";
    }
}
