package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("ALL")
public class Main  {
    public static void main(String[] args) {
        //use Application Context to retrieve the actor details


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movieA", Movie.class);
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println(movie==movie1);
        System.out.println(movie1.toString());

    }
}