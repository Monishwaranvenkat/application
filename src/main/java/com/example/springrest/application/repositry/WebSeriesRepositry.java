package com.example.springrest.application.repositry;

import com.example.springrest.application.entity.WebSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebSeriesRepositry extends JpaRepository<WebSeries,Integer> {
    WebSeries findAllByName(String name);
}
