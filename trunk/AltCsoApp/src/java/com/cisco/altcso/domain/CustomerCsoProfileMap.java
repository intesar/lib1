package com.cisco.altcso.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Intesar Mohammed
 */
@Entity
@Table(name = "CUSTOMER_CSO_PROFILE_MAP_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerCsoProfileMap.findAll", query = "SELECT c FROM CustomerCsoProfileMap c"),
    @NamedQuery(name = "CustomerCsoProfileMap.findByCustomerCsoProfileMapId", query = "SELECT c FROM CustomerCsoProfileMap c WHERE c.customerCsoProfileMapId = :customerCsoProfileMapId")})
public class CustomerCsoProfileMap implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_CSO_PROFILE_MAP_ID")
    private Long customerCsoProfileMapId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false)
    private Customer customerId;
    @JoinColumn(name = "CSO_PROFILE_ID", referencedColumnName = "CSO_PROFILE_ID")
    @ManyToOne(optional = false)
    private CsoProfile csoProfileId;

    public CustomerCsoProfileMap() {
    }

    public CustomerCsoProfileMap(Long customerCsoProfileMapId) {
        this.customerCsoProfileMapId = customerCsoProfileMapId;
    }

    public Long getCustomerCsoProfileMapId() {
        return customerCsoProfileMapId;
    }

    public void setCustomerCsoProfileMapId(Long customerCsoProfileMapId) {
        this.customerCsoProfileMapId = customerCsoProfileMapId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public CsoProfile getCsoProfileId() {
        return csoProfileId;
    }

    public void setCsoProfileId(CsoProfile csoProfileId) {
        this.csoProfileId = csoProfileId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerCsoProfileMapId != null ? customerCsoProfileMapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerCsoProfileMap)) {
            return false;
        }
        CustomerCsoProfileMap other = (CustomerCsoProfileMap) object;
        if ((this.customerCsoProfileMapId == null && other.customerCsoProfileMapId != null) || (this.customerCsoProfileMapId != null && !this.customerCsoProfileMapId.equals(other.customerCsoProfileMapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.CustomerCsoProfileMap[ customerCsoProfileMapId=" + customerCsoProfileMapId + " ]";
    }
}
