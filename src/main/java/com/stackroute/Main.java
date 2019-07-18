package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("ALL")
public class Main  {
    public static void main(String[] args) {
        //use Application Context to retrieve the actor details


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie = applicationContext.getBean( Movie.class);
        System.out.println(movie.toString());


    }
}