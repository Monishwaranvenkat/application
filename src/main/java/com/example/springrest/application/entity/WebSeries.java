package com.example.springrest.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="webseries")
public class WebSeries {

    @Id
    private Integer id;
    private String name;
    private Integer seasons;
    private Integer episodes;
    private Integer rating;

    public WebSeries() {
    }

    public WebSeries(Integer id, String name, Integer seasons, Integer episodes, Integer rating) {
        this.id = id;
        this.name = name;
        this.seasons = seasons;
        this.episodes = episodes;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "WebSeries{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seasons=" + seasons +
                ", episodes=" + episodes +
                ", rating=" + rating +
                '}';
    }
}
