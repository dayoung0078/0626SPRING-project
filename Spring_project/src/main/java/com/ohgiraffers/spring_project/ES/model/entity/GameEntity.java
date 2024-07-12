package com.ohgiraffers.spring_project.ES.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "estitle")
    private String estitle;

    @Column(name = "essubtitle")
    private String essubtitle;

    @Column(name = "esgenre")
    private String esgenre;

    @Column(name = "escountry")
    private String escountry;

    @Column(name = "esduration")
    private String esduration;

    @Column(name = "esissue")
    private String esissue;

    @Column(name = "esmetacritic")
    private String esmetacritic;

    @Column(name = "esaccessor")
    private String esaccessor;

    @Column(name = "esimageurl")
    private String esimageurl;

    public GameEntity() {
    }

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
        return "GameEntity{" +
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