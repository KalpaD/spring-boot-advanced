package com.kds.boot.springbootadvanced.model;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
public class DataSource {

    private String dbUser;
    private String dbPassword;
    private String dbUrl;

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
