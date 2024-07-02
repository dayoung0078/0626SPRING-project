package com.ohgiraffers.spring_project.sy.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private String subtitle;

    @Column
    private String imageUrl;

    @Column
    private String genre;

    @Column
    private String country;

    @Column
    private String duration;

    @Column
    private String releaseDate;

    @Column
    private String rating;

    @Column
    private String audience;

    @Column
    private String originalLink;

    @Column
    private String description;

    @Column
    private String accordionTitle;

    @Column
    private String anw;

    public MovieEntity() {
    }

    public MovieEntity(Long id, String title, String subtitle, String imageUrl, String genre, String country, String duration, String releaseDate, String rating, String audience, String originalLink, String description, String accordionTitle, String anw) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.country = country;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.audience = audience;
        this.originalLink = originalLink;
        this.description = description;
        this.accordionTitle = accordionTitle;
        this.anw = anw;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccordionTitle() {
        return accordionTitle;
    }

    public void setAccordionTitle(String accordionTitle) {
        this.accordionTitle = accordionTitle;
    }

    public String getAnw() {
        return anw;
    }

    public void setAnw(String anw) {
        this.anw = anw;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating='" + rating + '\'' +
                ", audience='" + audience + '\'' +
                ", originalLink='" + originalLink + '\'' +
                ", description='" + description + '\'' +
                ", accordionTitle='" + accordionTitle + '\'' +
                ", anw='" + anw + '\'' +
                '}';
    }
}
