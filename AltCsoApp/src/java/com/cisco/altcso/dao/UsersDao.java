/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.dao;

import com.cisco.altcso.domain.Users;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 */
public interface UsersDao extends GenericDao<Users, String> {
    public List<Users> findByUserId(String userId);
}
