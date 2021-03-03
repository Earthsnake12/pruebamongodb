package com.pruebamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Datos")
public class Datos {

    @Id
    private String id;

    private String human;
    private String mutan;


    public Datos() {
    }

    public Datos(String id, String human, String mutan) {
        this.id = id;
        this.mutan = mutan;
        this.human = human;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMutan() {
        return mutan;
    }

    public void setMutan(String mutan) {
        this.mutan = mutan;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", mutan='" + mutan + '\'' +
                ", human='" + human + '\'' +
                '}';
    }
}
