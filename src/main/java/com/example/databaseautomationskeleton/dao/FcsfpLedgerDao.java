package com.example.databaseautomationskeleton.dao;


import com.example.databaseautomationskeleton.model.FcsfpLedger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Transactional
@Component
public class FcsfpLedgerDao {

    @PersistenceContext
    private EntityManager entityManager;


    public FcsfpLedger getFCSFPLedger(int id) {

        FcsfpLedger fcsfpLedger = entityManager.find(FcsfpLedger.class, id);

        return fcsfpLedger;
    }

}
