package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig
{
    @Bean
    public Movie setTheMovie()
    {
        Actor actor= new Actor();
        return new Movie(actor);

    }
}