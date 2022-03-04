package com.example.databaseautomationskeleton.service;


import com.example.databaseautomationskeleton.dao.FcsfpLedgerDao;
import com.example.databaseautomationskeleton.model.FcsfpLedger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class FcsfpLedgerService {

    @Autowired
    private FcsfpLedgerDao fcsfpLedgerDao;


    @Transactional(readOnly = true)
    public FcsfpLedger getFCSFPLedger(int id) {

        return fcsfpLedgerDao.getFCSFPLedger(id);

    }

}
