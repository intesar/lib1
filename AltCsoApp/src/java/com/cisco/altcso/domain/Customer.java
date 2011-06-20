package com.cisco.altcso.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customer.findByGroupName", query = "SELECT c FROM Customer c WHERE c.groupName LIKE :groupName"),
    @NamedQuery(name = "Customer.findByAppkey", query = "SELECT c FROM Customer c WHERE c.appkey = :appkey"),
    @NamedQuery(name = "Customer.findByExpiryDate", query = "SELECT c FROM Customer c WHERE c.expiryDate = :expiryDate"),
    @NamedQuery(name = "Customer.findByMaxPriority", query = "SELECT c FROM Customer c WHERE c.maxPriority = :maxPriority")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @SequenceGenerator(name = "Cust_Gen", sequenceName = "CUSTOMER_ID_SEQUENCE")
    @Id
    @GeneratedValue(generator = "Cust_Gen")
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "APPKEY")
    private String appkey;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "MAX_PRIORITY")
    private Long maxPriority;
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<CustomerCsoProfileMap> customerCsoProfileMapList;
    @Column(name = "tmx")
    private String tmx;

    public Customer() {
    }

    public Customer(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getMaxPriority() {
        return maxPriority;
    }

    public void setMaxPriority(Long maxPriority) {
        this.maxPriority = maxPriority;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTmx() {
        return tmx;
    }

    public void setTmx(String tmx) {
        this.tmx = tmx;
    }

    @Transient
    public String getFormatedCreateDate() {
        if (createDate != null) {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            return df.format(createDate);
        } else {
            return "";
        }
    }

    @Transient
    public String getFormatedExpiryDate() {
        if (expiryDate != null) {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            return df.format(expiryDate);
        } else {
            return "";
        }
    }

    public void setFormatedExpiryDate(String dt) {
        if (!dt.equals(getFormatedExpiryDate())) {
            try {
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                this.expiryDate = df.parse(dt);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }

    public List<CustomerCsoProfileMap> getCustomerCsoProfileMapList() {
        return customerCsoProfileMapList;
    }

    public void setCustomerCsoProfileMapList(List<CustomerCsoProfileMap> customerCsoProfileMapList) {
        this.customerCsoProfileMapList = customerCsoProfileMapList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cisco.altcso.domain.Customer[ customerId=" + customerId + " ]";
    }
}