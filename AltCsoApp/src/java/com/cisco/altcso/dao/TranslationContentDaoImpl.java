package com.cisco.altcso.dao;

import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.TranslationContent;

/**
 * Hibernate implementation of the TranslationContent DAO interface.
 */
@Repository
public class TranslationContentDaoImpl extends GenericDaoImpl<TranslationContent, Long> implements
        TranslationContentDao {
    public TranslationContentDaoImpl() {
        super(TranslationContent.class);
    }
}