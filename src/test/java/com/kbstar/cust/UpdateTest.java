package com.kbstar.cust;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class UpdateTest {
    @Autowired
    CustService service;

    @Test
    void contextLoads() {
        try {
            service.modify(new Cust("id11", "pwd11", "장덕배", "서울시 양천구", "010-5555-6666", "F"));
        } catch (Exception e) {
            log.info("오류----------------------------");
        }
    }
}
