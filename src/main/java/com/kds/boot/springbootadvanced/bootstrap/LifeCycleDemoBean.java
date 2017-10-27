package com.kds.boot.springbootadvanced.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by kalpasenanayake on 28/10/17.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    private Logger log = LoggerFactory.getLogger(LifeCycleDemoBean.class);

    public LifeCycleDemoBean() {
        log.info("I am in the LifeCycleDemoBean Constructor.");
    }

    @PostConstruct
    public void postConstruct() {
        log.info(" The post construct annotated method had been called");
    }


    @PreDestroy
    public void preDestroy() {
        log.info("The predestroy annotated method had been called.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info( "Bean factory has been set.");
    }

    @Override
    public void setBeanName(String name) {
        log.info("My bean name is : "+ name);
    }

    @Override
    public void destroy() throws Exception {
        log.info("The Lifecycle bean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("The Lifecycle bean has its property set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("Application context has been set.");
    }

    public void beforeInit() {
        log.info("Before init - called by bean post processor.");
    }

    public void afterInit() {
        log.info("After init called by bean post processor.");
    }
}
