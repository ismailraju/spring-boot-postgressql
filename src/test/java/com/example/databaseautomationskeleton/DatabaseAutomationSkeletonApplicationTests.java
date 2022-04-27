package com.example.databaseautomationskeleton;

import com.example.databaseautomationskeleton.dao.FcsfpLedgerDao;
import com.example.databaseautomationskeleton.model.FcsfpLedger;
import com.example.databaseautomationskeleton.repository.FcsfpLedgerRepository;
import com.example.databaseautomationskeleton.service.FcsfpLedgerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatabaseAutomationSkeletonApplicationTests {
    @Autowired
    private FcsfpLedgerService fcsfpLedgerService;
    @Autowired
    private FcsfpLedgerRepository fcsfpLedgerRepository;
    @Autowired
    private FcsfpLedgerDao fcsfpLedgerDao;

//    @Test
    void test1() {

        FcsfpLedger fcsfpLedger = fcsfpLedgerService.getFCSFPLedger(1);
//        Optional<FCSFPLedger> byId = fcsfpLedgerRepository.findById(Integer.valueOf("1"));
//        FCSFPLedger fcsfpLedger = byId.get();
        System.out.println(fcsfpLedger);
    }

    @Test
    void test2() {

        FcsfpLedger fcsfpLedger = fcsfpLedgerDao.getFCSFPLedgerSql(1);
        System.out.println(fcsfpLedger);
    }

}
