package com.kds.boot.springbootadvanced.config;

import com.kds.boot.springbootadvanced.model.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
@Configuration
@PropertySource(value = "classpath:db_config.properties")
public class DbConfiguration {

    @Value("${db.user}")
    String dbUser;

    @Value("${db.passwd}")
    String dbPassword;

    @Value("${db.url}")
    String dbUrl;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDbUser(dbUser);
        dataSource.setDbPassword(dbPassword);
        dataSource.setDbUrl(dbUrl);
        return dataSource;
    }

}
