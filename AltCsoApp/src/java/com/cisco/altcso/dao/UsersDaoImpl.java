/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.dao;

import com.cisco.altcso.domain.Users;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Intesar Mohammed
 */
@Repository
public class UsersDaoImpl extends GenericDaoImpl<Users, String> implements UsersDao{

   public UsersDaoImpl() {
       super(Users.class);
   }

    @Override
    public List<Users> findByUserId(String userId) {
        return this.entityManager.createNamedQuery("Users.findByUserId")
                .setParameter("userId", "%" + userId + "%")
                .getResultList();
    }
}
