package com.example.databaseautomationskeleton.dao;


import com.example.databaseautomationskeleton.model.FcsfpLedger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Transactional
@Component
public class FcsfpLedgerDao {

    @PersistenceContext
    private EntityManager entityManager;


    public FcsfpLedger getFCSFPLedger(int id) {

        FcsfpLedger fcsfpLedger = entityManager.find(FcsfpLedger.class, id);

        return fcsfpLedger;
    }

    public FcsfpLedger getFCSFPLedgerSql(int id) {
        Query query = entityManager.createNativeQuery("select  * from fcsfp_ledger where executioninstance_id=:id");
        query.setParameter("id", 1);
        FcsfpLedger fcsfpLedger =
                new FcsfpLedger((Object[]) query.getSingleResult());

        return fcsfpLedger;
    }

}
