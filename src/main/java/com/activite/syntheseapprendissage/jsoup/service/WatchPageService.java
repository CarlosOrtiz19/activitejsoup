package com.activite.syntheseapprendissage.jsoup.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WatchPageService {

    public String getUrl(String url) throws IOException {

        Document document = Jsoup.connect(url).get();
        System.out.println( document.getElementsByTag("div").size());
        System.out.println( document.getElementsByTag("h1").text());
        System.out.println( document.getElementsByTag("ul").size());
        System.out.println( document.getElementsByAttribute("href").size());
        System.out.println( document.getElementsByClass("footer").text());

        return "hello";
    }
}
