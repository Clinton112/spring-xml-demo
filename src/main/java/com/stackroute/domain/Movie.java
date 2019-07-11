package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanPostProcessor {
    private Actor actor;

    public Movie() {
        this.actor = null;
    }

    public Movie(Actor actor)
    {
        this.actor=actor;

    }

    public void init() {
        System.out.println("Inside init method");
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void destroy()
    {
        System.out.println("Inside Destroy Method");
    }


}