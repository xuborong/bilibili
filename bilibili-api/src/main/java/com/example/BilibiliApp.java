package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class BilibiliApp
{
    public static void main( String[] args )
    {
        ApplicationContext app = SpringApplication.run(BilibiliApp.class, args);
    }
}
