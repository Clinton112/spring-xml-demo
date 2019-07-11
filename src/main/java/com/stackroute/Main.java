package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("ALL")
public class Main
{
    public static void main(String[] args)
    {
        //use Application Context to retrieve the actor details
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("Spyder", Movie.class);
        System.out.println(movie.toString());
        
        //XmlBeanFactory
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = beanFactory.getBean("Spyder", Movie.class);
        System.out.println(movie1.toString());

        //BeanDefinitionRegistry
        @Deprecated
        BeanDefinitionRegistry beanDefinitionRegistry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);

        Movie movie2 = ((XmlBeanFactory) beanFactory).getBean("Spyder", Movie.class);
        System.out.println(movie2.toString());

    }
}