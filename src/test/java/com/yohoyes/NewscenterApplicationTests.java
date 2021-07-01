package com.yohoyes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class NewscenterApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }

}
