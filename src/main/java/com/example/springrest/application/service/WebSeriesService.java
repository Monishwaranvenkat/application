package com.example.springrest.application.service;

import com.example.springrest.application.entity.WebSeries;
import com.example.springrest.application.repositry.WebSeriesRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSeriesService {
    @Autowired
    WebSeriesRepositry webSeriesRepositry;

    public void addSeries(WebSeries webSeries)
    {
        webSeriesRepositry.save(webSeries);
    }

    public String deleteSeries(Integer id)
    {
        try {
            webSeriesRepositry.deleteById(id);
            return "Series Removed! "+id;
        }catch (Exception e)
        {
            return "Series not found! "+id;
        }
    }

    public List<WebSeries> getSeries()
    {
        return webSeriesRepositry.findAll();
    }

    public WebSeries getByName(String name)
    {
        return webSeriesRepositry.findAllByName(name);
    }

    public WebSeries getById(Integer id)
    {
        return  webSeriesRepositry.findById(id).get();
    }
}
