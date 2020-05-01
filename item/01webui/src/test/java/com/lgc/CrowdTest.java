package com.lgc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 *@Author Crush
 *@Date 2020/5/1 16:01
 *@Vision 1.0
 **/
public class CrowdTest {
    @Test
    public void test(){
        System.out.println(1);
    }
    @Test
    public void testConnection() throws SQLException {
        String path = "spring-persist-mybatis.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
