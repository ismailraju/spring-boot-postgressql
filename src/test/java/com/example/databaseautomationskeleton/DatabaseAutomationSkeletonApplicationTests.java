package com.example.databaseautomationskeleton;

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

    @Test
    void contextLoads() {

        FcsfpLedger fcsfpLedger = fcsfpLedgerService.getFCSFPLedger(1);
//        Optional<FCSFPLedger> byId = fcsfpLedgerRepository.findById(Integer.valueOf("1"));
//        FCSFPLedger fcsfpLedger = byId.get();
        System.out.println(fcsfpLedger);
    }

}
