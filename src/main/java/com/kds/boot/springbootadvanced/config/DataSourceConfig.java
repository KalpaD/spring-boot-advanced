package com.kds.boot.springbootadvanced.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by kalpasenanayake on 29/10/17.
 */

/**
 * 1. Annotate config class with @Component to mark it as stereotype,
 2. Annotate it with @PropertySource and point the configuration file.
 3. Annotate it with @ConfigurationProperties point the prefix.
 4. Annotate the Application class with @EnableConfigurationProperties and point the Configuration class ie.
 @EnableConfigurationProperties(DataSourceConfig.class)
 */
@Primary
@Component
@PropertySource("classpath:db_config.properties")
@ConfigurationProperties(prefix = "db")
public class DataSourceConfig {

    private String userName;
    private String password;
    private String url;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
