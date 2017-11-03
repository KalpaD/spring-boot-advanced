package com.kds.boot.springbootadvanced.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
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
@PropertySources( {
        @PropertySource("classpath:db_config.properties"),
        @PropertySource("classpath:db_con.properties")
})
@ConfigurationProperties(prefix = "db")
public class DataSourceConfig {

    private String userName;
    private String password;
    private String url;

    @Value("${db.con.max}")
    private int max;
    @Value("${db.con.min}")
    private int min;

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

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
