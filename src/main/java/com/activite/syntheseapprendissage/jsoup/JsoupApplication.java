package com.activite.syntheseapprendissage.jsoup;

import com.activite.syntheseapprendissage.jsoup.service.WatchPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JsoupApplication {

    @Autowired
    private WatchPageService watchPageService;

    public static void main(String[] args) {
        SpringApplication.run(JsoupApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){return args -> {
        System.out.println(watchPageService.getUrl("https://jsoup.org/"));
    };}

}
