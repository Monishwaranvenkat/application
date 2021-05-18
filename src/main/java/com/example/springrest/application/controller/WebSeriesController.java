package com.example.springrest.application.controller;

import com.example.springrest.application.entity.WebSeries;
import com.example.springrest.application.service.WebSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebSeriesController {
    @Autowired
    WebSeriesService webSeriesService;

    @PostMapping("/addSeries")
    public void addSeries(@RequestBody WebSeries webSeries)
    {
        webSeriesService.addSeries(webSeries);
    }

    @GetMapping("/series")
    public List<WebSeries> getAllSeries()
    {
       return webSeriesService.getSeries();
    }

    @GetMapping("/series/id/{id}")
    public WebSeries getSeriesById(@PathVariable("id") Integer id)
    {
        return webSeriesService.getById(id);
    }

    @GetMapping("/series/name/{name}")
    public WebSeries getSeriesByName(@PathVariable("name") String name)
    {
        return webSeriesService.getByName(name);
    }

    @PutMapping("/update")
    public void updateSeries(@RequestBody WebSeries webSeries)
    {
        webSeriesService.addSeries(webSeries);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSeries(@PathVariable("id") Integer id)
    {
        return webSeriesService.deleteSeries(id);
    }
}
