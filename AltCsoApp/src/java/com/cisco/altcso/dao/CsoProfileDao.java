package com.cisco.altcso.dao;

import com.cisco.altcso.domain.CsoProfile;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 */
public interface CsoProfileDao extends GenericDao<CsoProfile, Long> {
    
    List<CsoProfile> findByCsoProfileName(String name);
}
