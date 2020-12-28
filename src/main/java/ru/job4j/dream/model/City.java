package ru.job4j.dream.model;

import java.util.Objects;

public class City {
    private int id;
    private String nameCity;

    public City(String nameCity) {
        this.nameCity = nameCity;
    }

    public City(int id, String nameCity) {
        this.id = id;
        this.nameCity = nameCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return id == city.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
