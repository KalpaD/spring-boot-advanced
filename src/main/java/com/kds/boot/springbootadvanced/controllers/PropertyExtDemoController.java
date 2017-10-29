package com.kds.boot.springbootadvanced.controllers;


import com.kds.boot.springbootadvanced.config.DbConfiguration;
import com.kds.boot.springbootadvanced.model.DataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
@RestController
public class PropertyExtDemoController {

    private DataSource dataSource;

    public PropertyExtDemoController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @RequestMapping
    public String getProperty(@RequestParam(name = "prop") String property) {
        switch (property) {
            case "user":
                return dataSource.getDbUser();

            case "url":
                return dataSource.getDbUrl();

            default:
                return dataSource.getDbUser();
        }
    }
}
