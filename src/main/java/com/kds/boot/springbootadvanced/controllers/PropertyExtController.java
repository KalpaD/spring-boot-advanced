package com.kds.boot.springbootadvanced.controllers;

import com.kds.boot.springbootadvanced.config.DataSourceConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
@RestController
public class PropertyExtController {

    private DataSourceConfig dataSource;

    public PropertyExtController(DataSourceConfig dataSource) {
        this.dataSource = dataSource;
    }

    @RequestMapping("/prop")
    public String getExtProperty(@RequestParam(value = "name") String propName) {
        switch (propName) {
            case "name":
                return dataSource.getUserName();
            case "url":
                return dataSource.getUrl();
            case "max":
                return Integer.toString(dataSource.getMax());
            case "min":
                return Integer.toString(dataSource.getMin());
            default:
                return dataSource.getUserName();
        }
    }
}
