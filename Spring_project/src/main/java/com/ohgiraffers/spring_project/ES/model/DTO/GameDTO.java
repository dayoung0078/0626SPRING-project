package com.ohgiraffers.spring_project.ES.model.DTO;

import com.ohgiraffers.spring_project.ES.model.entity.GameEntity;

public class GameDTO {
    private Long id;
    private String estitle;
    private String essubtitle;
    private String esgenre;
    private String escountry;
    private String esduration;
    private String esissue;
    private String esmetacritic;
    private String esaccessor;
    private String esimageurl;

    public GameDTO() {
    }

    public GameDTO(GameEntity entity) {
        this.id = entity.getId();
        this.estitle = entity.getEstitle();
        this.essubtitle = entity.getEssubtitle();
        this.esgenre = entity.getEsgenre();
        this.escountry = entity.getEscountry();
        this.esduration = entity.getEsduration();
        this.esissue = entity.getEsissue();
        this.esmetacritic = entity.getEsmetacritic();
        this.esaccessor = entity.getEsaccessor();
        this.esimageurl = entity.getEsimageurl();
    }

    public GameEntity toEntity() {
        GameEntity entity = new GameEntity();
        entity.setId(this.id);
        entity.setEstitle(this.estitle);
        entity.setEssubtitle(this.essubtitle);
        entity.setEsgenre(this.esgenre);
        entity.setEscountry(this.escountry);
        entity.setEsduration(this.esduration);
        entity.setEsissue(this.esissue);
        entity.setEsmetacritic(this.esmetacritic);
        entity.setEsaccessor(this.esaccessor);
        entity.setEsimageurl(this.esimageurl);
        return entity;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstitle() {
        return estitle;
    }

    public void setEstitle(String estitle) {
        this.estitle = estitle;
    }

    public String getEssubtitle() {
        return essubtitle;
    }

    public void setEssubtitle(String essubtitle) {
        this.essubtitle = essubtitle;
    }

    public String getEsgenre() {
        return esgenre;
    }

    public void setEsgenre(String esgenre) {
        this.esgenre = esgenre;
    }

    public String getEscountry() {
        return escountry;
    }

    public void setEscountry(String escountry) {
        this.escountry = escountry;
    }

    public String getEsduration() {
        return esduration;
    }

    public void setEsduration(String esduration) {
        this.esduration = esduration;
    }

    public String getEsissue() {
        return esissue;
    }

    public void setEsissue(String esissue) {
        this.esissue = esissue;
    }

    public String getEsmetacritic() {
        return esmetacritic;
    }

    public void setEsmetacritic(String esmetacritic) {
        this.esmetacritic = esmetacritic;
    }

    public String getEsaccessor() {
        return esaccessor;
    }

    public void setEsaccessor(String esaccessor) {
        this.esaccessor = esaccessor;
    }

    public String getEsimageurl() {
        return esimageurl;
    }

    public void setEsimageurl(String esimageurl) {
        this.esimageurl = esimageurl;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "id=" + id +
                ", estitle='" + estitle + '\'' +
                ", essubtitle='" + essubtitle + '\'' +
                ", esgenre='" + esgenre + '\'' +
                ", escountry='" + escountry + '\'' +
                ", esduration='" + esduration + '\'' +
                ", esissue='" + esissue + '\'' +
                ", esmetacritic='" + esmetacritic + '\'' +
                ", esaccessor='" + esaccessor + '\'' +
                ", esimageurl='" + esimageurl + '\'' +
                '}';
    }
}